package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiEndpointHandler extends StObject {
  
  /** Path to the script from the application root directory. */
  var scriptPath: js.UndefOr[String] = js.undefined
}
object ApiEndpointHandler {
  
  @scala.inline
  def apply(): ApiEndpointHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiEndpointHandler]
  }
  
  @scala.inline
  implicit class ApiEndpointHandlerMutableBuilder[Self <: ApiEndpointHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptPath(value: String): Self = StObject.set(x, "scriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptPathUndefined: Self = StObject.set(x, "scriptPath", js.undefined)
  }
}
