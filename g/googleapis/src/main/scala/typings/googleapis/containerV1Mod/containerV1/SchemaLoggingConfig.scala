package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoggingConfig extends StObject {
  
  /**
    * Logging components configuration
    */
  var componentConfig: js.UndefOr[SchemaLoggingComponentConfig] = js.undefined
}
object SchemaLoggingConfig {
  
  inline def apply(): SchemaLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingConfig]
  }
  
  extension [Self <: SchemaLoggingConfig](x: Self) {
    
    inline def setComponentConfig(value: SchemaLoggingComponentConfig): Self = StObject.set(x, "componentConfig", value.asInstanceOf[js.Any])
    
    inline def setComponentConfigUndefined: Self = StObject.set(x, "componentConfig", js.undefined)
  }
}
