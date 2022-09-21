package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTelemetry extends StObject {
  
  /**
    * The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaTelemetry {
  
  inline def apply(): SchemaTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTelemetry]
  }
  
  extension [Self <: SchemaTelemetry](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
