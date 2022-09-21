package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringComponentConfig extends StObject {
  
  /** Select components to collect metrics. An empty set would disable all monitoring. */
  var enableComponents: js.UndefOr[js.Array[String]] = js.undefined
}
object MonitoringComponentConfig {
  
  inline def apply(): MonitoringComponentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringComponentConfig]
  }
  
  extension [Self <: MonitoringComponentConfig](x: Self) {
    
    inline def setEnableComponents(value: js.Array[String]): Self = StObject.set(x, "enableComponents", value.asInstanceOf[js.Any])
    
    inline def setEnableComponentsUndefined: Self = StObject.set(x, "enableComponents", js.undefined)
    
    inline def setEnableComponentsVarargs(value: String*): Self = StObject.set(x, "enableComponents", js.Array(value*))
  }
}
