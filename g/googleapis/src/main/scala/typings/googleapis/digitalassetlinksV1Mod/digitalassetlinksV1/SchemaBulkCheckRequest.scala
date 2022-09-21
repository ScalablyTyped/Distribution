package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkCheckRequest extends StObject {
  
  /**
    * Same configuration as in Check request, all statements checks will use same configurations.
    */
  var allowGoogleInternalDataSources: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If specified, will be used in any given template statement that doesn’t specify a relation.
    */
  var defaultRelation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, will be used in any given template statement that doesn’t specify a source.
    */
  var defaultSource: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * If specified, will be used in any given template statement that doesn’t specify a target.
    */
  var defaultTarget: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * Same configuration as in Check request, all statements checks will use same configurations.
    */
  var skipCacheLookup: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of statements to check. For each statement, you can omit a field if the corresponding default_* field below was supplied. Minimum 1 statement; maximum 1,000 statements. Any additional statements will be ignored.
    */
  var statements: js.UndefOr[js.Array[SchemaStatementTemplate]] = js.undefined
}
object SchemaBulkCheckRequest {
  
  inline def apply(): SchemaBulkCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkCheckRequest]
  }
  
  extension [Self <: SchemaBulkCheckRequest](x: Self) {
    
    inline def setAllowGoogleInternalDataSources(value: Boolean): Self = StObject.set(x, "allowGoogleInternalDataSources", value.asInstanceOf[js.Any])
    
    inline def setAllowGoogleInternalDataSourcesNull: Self = StObject.set(x, "allowGoogleInternalDataSources", null)
    
    inline def setAllowGoogleInternalDataSourcesUndefined: Self = StObject.set(x, "allowGoogleInternalDataSources", js.undefined)
    
    inline def setDefaultRelation(value: String): Self = StObject.set(x, "defaultRelation", value.asInstanceOf[js.Any])
    
    inline def setDefaultRelationNull: Self = StObject.set(x, "defaultRelation", null)
    
    inline def setDefaultRelationUndefined: Self = StObject.set(x, "defaultRelation", js.undefined)
    
    inline def setDefaultSource(value: SchemaAsset): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    inline def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    inline def setDefaultTarget(value: SchemaAsset): Self = StObject.set(x, "defaultTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetUndefined: Self = StObject.set(x, "defaultTarget", js.undefined)
    
    inline def setSkipCacheLookup(value: Boolean): Self = StObject.set(x, "skipCacheLookup", value.asInstanceOf[js.Any])
    
    inline def setSkipCacheLookupNull: Self = StObject.set(x, "skipCacheLookup", null)
    
    inline def setSkipCacheLookupUndefined: Self = StObject.set(x, "skipCacheLookup", js.undefined)
    
    inline def setStatements(value: js.Array[SchemaStatementTemplate]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: SchemaStatementTemplate*): Self = StObject.set(x, "statements", js.Array(value*))
  }
}
