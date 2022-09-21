package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingComponentConfig extends StObject {
  
  /** Select components to collect logs. An empty set would disable all logging. */
  var enableComponents: js.UndefOr[js.Array[String]] = js.undefined
}
object LoggingComponentConfig {
  
  inline def apply(): LoggingComponentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingComponentConfig]
  }
  
  extension [Self <: LoggingComponentConfig](x: Self) {
    
    inline def setEnableComponents(value: js.Array[String]): Self = StObject.set(x, "enableComponents", value.asInstanceOf[js.Any])
    
    inline def setEnableComponentsUndefined: Self = StObject.set(x, "enableComponents", js.undefined)
    
    inline def setEnableComponentsVarargs(value: String*): Self = StObject.set(x, "enableComponents", js.Array(value*))
  }
}
