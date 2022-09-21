package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoggingComponentConfig extends StObject {
  
  /**
    * Select components to collect logs. An empty set would disable all logging.
    */
  var enableComponents: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaLoggingComponentConfig {
  
  inline def apply(): SchemaLoggingComponentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingComponentConfig]
  }
  
  extension [Self <: SchemaLoggingComponentConfig](x: Self) {
    
    inline def setEnableComponents(value: js.Array[String]): Self = StObject.set(x, "enableComponents", value.asInstanceOf[js.Any])
    
    inline def setEnableComponentsNull: Self = StObject.set(x, "enableComponents", null)
    
    inline def setEnableComponentsUndefined: Self = StObject.set(x, "enableComponents", js.undefined)
    
    inline def setEnableComponentsVarargs(value: String*): Self = StObject.set(x, "enableComponents", js.Array(value*))
  }
}
