package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEnvironmentResponse extends StObject {
  
  /** Environment that was started. */
  var environment: js.UndefOr[Environment] = js.undefined
}
object StartEnvironmentResponse {
  
  inline def apply(): StartEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEnvironmentResponse]
  }
  
  extension [Self <: StartEnvironmentResponse](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
