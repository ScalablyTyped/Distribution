package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchApplication extends StObject {
  
  /** Retrictions applied to the configurations. The maximum number of elements is 10. */
  var dataSourceRestrictions: js.UndefOr[js.Array[DataSourceRestriction]] = js.undefined
  
  /** The default fields for returning facet results. The sources specified here also have been included in data_source_restrictions above. */
  var defaultFacetOptions: js.UndefOr[js.Array[FacetOptions]] = js.undefined
  
  /** The default options for sorting the search results */
  var defaultSortOptions: js.UndefOr[SortOptions] = js.undefined
  
  /** Display name of the Search Application. The maximum length is 300 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Name of the Search Application. Format: searchapplications/{application_id}. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. IDs of the Long Running Operations (LROs) currently running for this schema. Output only field. */
  var operationIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Configuration for ranking results. */
  var scoringConfig: js.UndefOr[ScoringConfig] = js.undefined
  
  /** Configuration for a sources specified in data_source_restrictions. */
  var sourceConfig: js.UndefOr[js.Array[SourceConfig]] = js.undefined
}
object SearchApplication {
  
  @scala.inline
  def apply(): SearchApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchApplication]
  }
  
  @scala.inline
  implicit class SearchApplicationMutableBuilder[Self <: SearchApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[DataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    @scala.inline
    def setDataSourceRestrictionsVarargs(value: DataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultFacetOptions(value: js.Array[FacetOptions]): Self = StObject.set(x, "defaultFacetOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFacetOptionsUndefined: Self = StObject.set(x, "defaultFacetOptions", js.undefined)
    
    @scala.inline
    def setDefaultFacetOptionsVarargs(value: FacetOptions*): Self = StObject.set(x, "defaultFacetOptions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSortOptions(value: SortOptions): Self = StObject.set(x, "defaultSortOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortOptionsUndefined: Self = StObject.set(x, "defaultSortOptions", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdsUndefined: Self = StObject.set(x, "operationIds", js.undefined)
    
    @scala.inline
    def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value :_*))
    
    @scala.inline
    def setScoringConfig(value: ScoringConfig): Self = StObject.set(x, "scoringConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoringConfigUndefined: Self = StObject.set(x, "scoringConfig", js.undefined)
    
    @scala.inline
    def setSourceConfig(value: js.Array[SourceConfig]): Self = StObject.set(x, "sourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceConfigUndefined: Self = StObject.set(x, "sourceConfig", js.undefined)
    
    @scala.inline
    def setSourceConfigVarargs(value: SourceConfig*): Self = StObject.set(x, "sourceConfig", js.Array(value :_*))
  }
}
