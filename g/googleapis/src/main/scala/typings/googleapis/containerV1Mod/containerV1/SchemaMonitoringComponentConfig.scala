package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonitoringComponentConfig extends StObject {
  
  /**
    * Select components to collect metrics. An empty set would disable all monitoring.
    */
  var enableComponents: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaMonitoringComponentConfig {
  
  inline def apply(): SchemaMonitoringComponentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoringComponentConfig]
  }
  
  extension [Self <: SchemaMonitoringComponentConfig](x: Self) {
    
    inline def setEnableComponents(value: js.Array[String]): Self = StObject.set(x, "enableComponents", value.asInstanceOf[js.Any])
    
    inline def setEnableComponentsNull: Self = StObject.set(x, "enableComponents", null)
    
    inline def setEnableComponentsUndefined: Self = StObject.set(x, "enableComponents", js.undefined)
    
    inline def setEnableComponentsVarargs(value: String*): Self = StObject.set(x, "enableComponents", js.Array(value*))
  }
}
