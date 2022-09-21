package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDebugOptions extends StObject {
  
  /**
    * When true, enables the logging of the literal hot key to the user's Cloud Logging.
    */
  var enableHotKeyLogging: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDebugOptions {
  
  inline def apply(): SchemaDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDebugOptions]
  }
  
  extension [Self <: SchemaDebugOptions](x: Self) {
    
    inline def setEnableHotKeyLogging(value: Boolean): Self = StObject.set(x, "enableHotKeyLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableHotKeyLoggingNull: Self = StObject.set(x, "enableHotKeyLogging", null)
    
    inline def setEnableHotKeyLoggingUndefined: Self = StObject.set(x, "enableHotKeyLogging", js.undefined)
  }
}
