package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatAppLogEntry extends StObject {
  
  /** The deployment that caused the error. For Chat apps built in Apps Script, this is the deployment ID defined by Apps Script. */
  var deployment: js.UndefOr[String] = js.undefined
  
  /** The unencrypted `callback_method` name that was running when the error was encountered. */
  var deploymentFunction: js.UndefOr[String] = js.undefined
  
  /** The error code and message. */
  var error: js.UndefOr[Status] = js.undefined
}
object ChatAppLogEntry {
  
  inline def apply(): ChatAppLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatAppLogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatAppLogEntry] (val x: Self) extends AnyVal {
    
    inline def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentFunction(value: String): Self = StObject.set(x, "deploymentFunction", value.asInstanceOf[js.Any])
    
    inline def setDeploymentFunctionUndefined: Self = StObject.set(x, "deploymentFunction", js.undefined)
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
