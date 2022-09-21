package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugOptions extends StObject {
  
  /** When true, enables the logging of the literal hot key to the user's Cloud Logging. */
  var enableHotKeyLogging: js.UndefOr[Boolean] = js.undefined
}
object DebugOptions {
  
  inline def apply(): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOptions]
  }
  
  extension [Self <: DebugOptions](x: Self) {
    
    inline def setEnableHotKeyLogging(value: Boolean): Self = StObject.set(x, "enableHotKeyLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableHotKeyLoggingUndefined: Self = StObject.set(x, "enableHotKeyLogging", js.undefined)
  }
}
