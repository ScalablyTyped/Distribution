package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * If true, sets the datasource to read-only mode. In read-only mode, the Indexing API rejects any requests to index or delete items in this source. Enabling read-only mode does not
    * stop the processing of previously accepted data.
    */
  var disableModifications: js.UndefOr[Boolean] = js.undefined
  
  /** Disable serving any search or assist results. */
  var disableServing: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Display name of the datasource The maximum length is 300 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** List of service accounts that have indexing access. */
  var indexingServiceAccounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This field restricts visibility to items at the datasource level. Items within the datasource are restricted to the union of users and groups included in this field. Note that, this
    * does not ensure access to a specific item, as users need to have ACL permissions on the contained items. This ensures a high level access on the entire datasource, and that the
    * individual items are not shared outside this visibility.
    */
  var itemsVisibility: js.UndefOr[js.Array[GSuitePrincipal]] = js.undefined
  
  /** The name of the datasource resource. Format: datasources/{source_id}. The name is ignored when creating a datasource. */
  var name: js.UndefOr[String] = js.undefined
  
  /** IDs of the Long Running Operations (LROs) currently running for this schema. */
  var operationIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Can a user request to get thumbnail URI for Items indexed in this data source. */
  var returnThumbnailUrls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A short name or alias for the source. This value will be used to match the 'source' operator. For example, if the short name is *<value>* then queries like *source:<value>* will
    * only return results for this source. The value must be unique across all datasources. The value must only contain alphanumeric characters (a-zA-Z0-9). The value cannot start with
    * 'google' and cannot be one of the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep, people, teams. Its maximum length is 32 characters.
    */
  var shortName: js.UndefOr[String] = js.undefined
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setDisableModifications(value: Boolean): Self = StObject.set(x, "disableModifications", value.asInstanceOf[js.Any])
    
    inline def setDisableModificationsUndefined: Self = StObject.set(x, "disableModifications", js.undefined)
    
    inline def setDisableServing(value: Boolean): Self = StObject.set(x, "disableServing", value.asInstanceOf[js.Any])
    
    inline def setDisableServingUndefined: Self = StObject.set(x, "disableServing", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIndexingServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "indexingServiceAccounts", value.asInstanceOf[js.Any])
    
    inline def setIndexingServiceAccountsUndefined: Self = StObject.set(x, "indexingServiceAccounts", js.undefined)
    
    inline def setIndexingServiceAccountsVarargs(value: String*): Self = StObject.set(x, "indexingServiceAccounts", js.Array(value*))
    
    inline def setItemsVisibility(value: js.Array[GSuitePrincipal]): Self = StObject.set(x, "itemsVisibility", value.asInstanceOf[js.Any])
    
    inline def setItemsVisibilityUndefined: Self = StObject.set(x, "itemsVisibility", js.undefined)
    
    inline def setItemsVisibilityVarargs(value: GSuitePrincipal*): Self = StObject.set(x, "itemsVisibility", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
    
    inline def setOperationIdsUndefined: Self = StObject.set(x, "operationIds", js.undefined)
    
    inline def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value*))
    
    inline def setReturnThumbnailUrls(value: Boolean): Self = StObject.set(x, "returnThumbnailUrls", value.asInstanceOf[js.Any])
    
    inline def setReturnThumbnailUrlsUndefined: Self = StObject.set(x, "returnThumbnailUrls", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
  }
}
