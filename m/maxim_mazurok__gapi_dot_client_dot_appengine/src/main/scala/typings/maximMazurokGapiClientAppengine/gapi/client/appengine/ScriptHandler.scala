package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptHandler extends StObject {
  
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[String] = js.undefined
}
object ScriptHandler {
  
  inline def apply(): ScriptHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptHandler]
  }
  
  extension [Self <: ScriptHandler](x: Self) {
    
    inline def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    inline def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
  }
}
