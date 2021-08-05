package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchApplication
  */
trait SchemaSearchApplication extends StObject {
  
  /**
    * Retrictions applied to the configurations. The maximum number of elements
    * is 10.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.undefined
  
  /**
    * The default fields for returning facet results. The sources specified
    * here also have been included in data_source_restrictions above.
    */
  var defaultFacetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.undefined
  
  /**
    * The default options for sorting the search results
    */
  var defaultSortOptions: js.UndefOr[SchemaSortOptions] = js.undefined
  
  /**
    * Display name of the Search Application. The maximum length is 300
    * characters.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the Search Application. &lt;br /&gt;Format:
    * searchapplications/{application_id}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema. Output only field.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.undefined
  
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
    
    inline def setDataSourceRestrictionsVarargs(value: SchemaDataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value :_*))
    
    inline def setDefaultFacetOptions(value: js.Array[SchemaFacetOptions]): Self = StObject.set(x, "defaultFacetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultFacetOptionsUndefined: Self = StObject.set(x, "defaultFacetOptions", js.undefined)
    
    inline def setDefaultFacetOptionsVarargs(value: SchemaFacetOptions*): Self = StObject.set(x, "defaultFacetOptions", js.Array(value :_*))
    
    inline def setDefaultSortOptions(value: SchemaSortOptions): Self = StObject.set(x, "defaultSortOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortOptionsUndefined: Self = StObject.set(x, "defaultSortOptions", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperationIds(value: js.Array[String]): Self = StObject.set(x, "operationIds", value.asInstanceOf[js.Any])
    
    inline def setOperationIdsUndefined: Self = StObject.set(x, "operationIds", js.undefined)
    
    inline def setOperationIdsVarargs(value: String*): Self = StObject.set(x, "operationIds", js.Array(value :_*))
    
    inline def setScoringConfig(value: SchemaScoringConfig): Self = StObject.set(x, "scoringConfig", value.asInstanceOf[js.Any])
    
    inline def setScoringConfigUndefined: Self = StObject.set(x, "scoringConfig", js.undefined)
    
    inline def setSourceConfig(value: js.Array[SchemaSourceConfig]): Self = StObject.set(x, "sourceConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigUndefined: Self = StObject.set(x, "sourceConfig", js.undefined)
    
    inline def setSourceConfigVarargs(value: SchemaSourceConfig*): Self = StObject.set(x, "sourceConfig", js.Array(value :_*))
  }
}
