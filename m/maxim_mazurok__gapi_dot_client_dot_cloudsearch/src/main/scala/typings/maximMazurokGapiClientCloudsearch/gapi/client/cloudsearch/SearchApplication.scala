package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchApplication extends js.Object {
  
  /** Retrictions applied to the configurations. The maximum number of elements is 10. */
  var dataSourceRestrictions: js.UndefOr[js.Array[DataSourceRestriction]] = js.native
  
  /** The default fields for returning facet results. The sources specified here also have been included in data_source_restrictions above. */
  var defaultFacetOptions: js.UndefOr[js.Array[FacetOptions]] = js.native
  
  /** The default options for sorting the search results */
  var defaultSortOptions: js.UndefOr[SortOptions] = js.native
  
  /** Display name of the Search Application. The maximum length is 300 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Name of the Search Application. Format: searchapplications/{application_id}. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. IDs of the Long Running Operations (LROs) currently running for this schema. Output only field. */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Configuration for ranking results. */
  var scoringConfig: js.UndefOr[ScoringConfig] = js.native
  
  /** Configuration for a sources specified in data_source_restrictions. */
  var sourceConfig: js.UndefOr[js.Array[SourceConfig]] = js.native
}
object SearchApplication {
  
  @scala.inline
  def apply(): SearchApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchApplication]
  }
  
  @scala.inline
  implicit class SearchApplicationOps[Self <: SearchApplication] (val x: Self) extends AnyVal {
    
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
    def setDataSourceRestrictionsVarargs(value: DataSourceRestriction*): Self = this.set("dataSourceRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[DataSourceRestriction]): Self = this.set("dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceRestrictions: Self = this.set("dataSourceRestrictions", js.undefined)
    
    @scala.inline
    def setDefaultFacetOptionsVarargs(value: FacetOptions*): Self = this.set("defaultFacetOptions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultFacetOptions(value: js.Array[FacetOptions]): Self = this.set("defaultFacetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFacetOptions: Self = this.set("defaultFacetOptions", js.undefined)
    
    @scala.inline
    def setDefaultSortOptions(value: SortOptions): Self = this.set("defaultSortOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSortOptions: Self = this.set("defaultSortOptions", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
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
    def setScoringConfig(value: ScoringConfig): Self = this.set("scoringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoringConfig: Self = this.set("scoringConfig", js.undefined)
    
    @scala.inline
    def setSourceConfigVarargs(value: SourceConfig*): Self = this.set("sourceConfig", js.Array(value :_*))
    
    @scala.inline
    def setSourceConfig(value: js.Array[SourceConfig]): Self = this.set("sourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceConfig: Self = this.set("sourceConfig", js.undefined)
  }
}
