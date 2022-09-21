package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchApplication extends StObject {
  
  /**
    * Retrictions applied to the configurations. The maximum number of elements is 10.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.undefined
  
  /**
    * The default fields for returning facet results. The sources specified here also have been included in data_source_restrictions above.
    */
  var defaultFacetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.undefined
  
  /**
    * The default options for sorting the search results
    */
  var defaultSortOptions: js.UndefOr[SchemaSortOptions] = js.undefined
  
  /**
    * Display name of the Search Application. The maximum length is 300 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether audit logging is on/off for requests made for the search application in query APIs.
    */
  var enableAuditLog: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the Search Application. Format: searchapplications/{application_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. IDs of the Long Running Operations (LROs) currently running for this schema. Output only field.
    */
  var operationIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The default options for query interpretation
    */
  var queryInterpretationConfig: js.UndefOr[SchemaQueryInterpretationConfig] = js.undefined
  
  /**
    * With each result we should return the URI for its thumbnail (when applicable)
    */
  var returnResultThumbnailUrls: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configuration for ranking results.
    */
  var scoringConfig: js.UndefOr[SchemaScoringConfig] = js.undefined
  
  /**
    * Configuration for a sources specified in data_source_restrictions.
    */
  var sourceConfig: js.UndefOr[js.Array[SchemaSourceConfig]] = js.undefined
}
object SchemaSearchApplication {
  
  inline def apply(): SchemaSearchApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchApplication]
  }
  
  extension [Self <: SchemaSearchApplication](x: Self) {
    
    inline def setDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    inline def setDataSourceRestrictionsVarargs(value: SchemaDataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value*))
    
    inline def setDefaultFacetOptions(value: js.Array[SchemaFacetOptions]): Self = StObject.set(x, "defaultFacetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultFacetOptionsUndefined: Self = StObject.set(x, "defaultFacetOptions", js.undefined)
    
    inline def setDefaultFacetOptionsVarargs(value: SchemaFacetOptions*): Self = StObject.set(x, "defaultFacetOptions", js.Array(value*))
    
    inline def setDefaultSortOptions(value: SchemaSortOptions): Self = StObject.set(x, "defaultSortOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortOptionsUndefined: Self = StObject.set(x, "defaultSortOptions", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableAuditLog(value: Boolean): Self = StObject.set(x, "enableAuditLog", value.asInstanceOf[js.Any])
    
    inline def setEnableAuditLogNull: Self = StObject.set(x, "enableAuditLog", null)
    
    inline def setEnableAuditLogUndefined: Self = StObject.set(x, "enableAuditLog", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
    
    inline def setOperationIdsNull: Self = StObject.set(x, "operationIds", null)
    
    inline def setOperationIdsUndefined: Self = StObject.set(x, "operationIds", js.undefined)
    
    inline def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value*))
    
    inline def setQueryInterpretationConfig(value: SchemaQueryInterpretationConfig): Self = StObject.set(x, "queryInterpretationConfig", value.asInstanceOf[js.Any])
    
    inline def setQueryInterpretationConfigUndefined: Self = StObject.set(x, "queryInterpretationConfig", js.undefined)
    
    inline def setReturnResultThumbnailUrls(value: Boolean): Self = StObject.set(x, "returnResultThumbnailUrls", value.asInstanceOf[js.Any])
    
    inline def setReturnResultThumbnailUrlsNull: Self = StObject.set(x, "returnResultThumbnailUrls", null)
    
    inline def setReturnResultThumbnailUrlsUndefined: Self = StObject.set(x, "returnResultThumbnailUrls", js.undefined)
    
    inline def setScoringConfig(value: SchemaScoringConfig): Self = StObject.set(x, "scoringConfig", value.asInstanceOf[js.Any])
    
    inline def setScoringConfigUndefined: Self = StObject.set(x, "scoringConfig", js.undefined)
    
    inline def setSourceConfig(value: js.Array[SchemaSourceConfig]): Self = StObject.set(x, "sourceConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigUndefined: Self = StObject.set(x, "sourceConfig", js.undefined)
    
    inline def setSourceConfigVarargs(value: SchemaSourceConfig*): Self = StObject.set(x, "sourceConfig", js.Array(value*))
  }
}
