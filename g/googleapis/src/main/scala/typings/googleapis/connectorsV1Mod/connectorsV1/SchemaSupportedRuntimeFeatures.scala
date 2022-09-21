package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSupportedRuntimeFeatures extends StObject {
  
  /**
    * Specifies if the connector supports action apis like 'executeAction'.
    */
  var actionApis: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies if the connector supports entity apis like 'createEntity'.
    */
  var entityApis: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies if the connector supports 'ExecuteSqlQuery' operation.
    */
  var sqlQuery: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSupportedRuntimeFeatures {
  
  inline def apply(): SchemaSupportedRuntimeFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSupportedRuntimeFeatures]
  }
  
  extension [Self <: SchemaSupportedRuntimeFeatures](x: Self) {
    
    inline def setActionApis(value: Boolean): Self = StObject.set(x, "actionApis", value.asInstanceOf[js.Any])
    
    inline def setActionApisNull: Self = StObject.set(x, "actionApis", null)
    
    inline def setActionApisUndefined: Self = StObject.set(x, "actionApis", js.undefined)
    
    inline def setEntityApis(value: Boolean): Self = StObject.set(x, "entityApis", value.asInstanceOf[js.Any])
    
    inline def setEntityApisNull: Self = StObject.set(x, "entityApis", null)
    
    inline def setEntityApisUndefined: Self = StObject.set(x, "entityApis", js.undefined)
    
    inline def setSqlQuery(value: Boolean): Self = StObject.set(x, "sqlQuery", value.asInstanceOf[js.Any])
    
    inline def setSqlQueryNull: Self = StObject.set(x, "sqlQuery", null)
    
    inline def setSqlQueryUndefined: Self = StObject.set(x, "sqlQuery", js.undefined)
  }
}
