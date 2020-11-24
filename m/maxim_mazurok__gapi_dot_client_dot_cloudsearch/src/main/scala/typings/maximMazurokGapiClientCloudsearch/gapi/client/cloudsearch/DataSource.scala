package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  
  /**
    * If true, sets the datasource to read-only mode. In read-only mode, the Indexing API rejects any requests to index or delete items in this source. Enabling read-only mode does not
    * stop the processing of previously accepted data.
    */
  var disableModifications: js.UndefOr[Boolean] = js.native
  
  /** Disable serving any search or assist results. */
  var disableServing: js.UndefOr[Boolean] = js.native
  
  /** Required. Display name of the datasource The maximum length is 300 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** List of service accounts that have indexing access. */
  var indexingServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This field restricts visibility to items at the datasource level. Items within the datasource are restricted to the union of users and groups included in this field. Note that, this
    * does not ensure access to a specific item, as users need to have ACL permissions on the contained items. This ensures a high level access on the entire datasource, and that the
    * individual items are not shared outside this visibility.
    */
  var itemsVisibility: js.UndefOr[js.Array[GSuitePrincipal]] = js.native
  
  /** Name of the datasource resource. Format: datasources/{source_id}. The name is ignored when creating a datasource. */
  var name: js.UndefOr[String] = js.native
  
  /** IDs of the Long Running Operations (LROs) currently running for this schema. */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A short name or alias for the source. This value will be used to match the 'source' operator. For example, if the short name is *<value>* then queries like *source:<value>* will
    * only return results for this source. The value must be unique across all datasources. The value must only contain alphanumeric characters (a-zA-Z0-9). The value cannot start with
    * 'google' and cannot be one of the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep, people, teams. Its maximum length is 32 characters.
    */
  var shortName: js.UndefOr[String] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableModifications(value: Boolean): Self = this.set("disableModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableModifications: Self = this.set("disableModifications", js.undefined)
    
    @scala.inline
    def setDisableServing(value: Boolean): Self = this.set("disableServing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableServing: Self = this.set("disableServing", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setIndexingServiceAccountsVarargs(value: String*): Self = this.set("indexingServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setIndexingServiceAccounts(value: js.Array[String]): Self = this.set("indexingServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexingServiceAccounts: Self = this.set("indexingServiceAccounts", js.undefined)
    
    @scala.inline
    def setItemsVisibilityVarargs(value: GSuitePrincipal*): Self = this.set("itemsVisibility", js.Array(value :_*))
    
    @scala.inline
    def setItemsVisibility(value: js.Array[GSuitePrincipal]): Self = this.set("itemsVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsVisibility: Self = this.set("itemsVisibility", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperationIdsVarargs(value: String*): Self = this.set("operationIds", js.Array(value :_*))
    
    @scala.inline
    def setOperationIds(value: js.Array[String]): Self = this.set("operationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationIds: Self = this.set("operationIds", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
  }
}
