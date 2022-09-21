package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppEngine extends StObject {
  
  /**
    * The ID of the App Engine module underlying this service. Corresponds to the module_id resource label in the gae_app monitored resource (https://cloud.google.com/monitoring/api/resources#tag_gae_app).
    */
  var moduleId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppEngine {
  
  inline def apply(): SchemaAppEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEngine]
  }
  
  extension [Self <: SchemaAppEngine](x: Self) {
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdNull: Self = StObject.set(x, "moduleId", null)
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
  }
}
