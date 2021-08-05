package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePublicKeyRequest extends StObject {
  
  /** Key that should be removed from the environment. */
  var key: js.UndefOr[String] = js.undefined
}
object RemovePublicKeyRequest {
  
  inline def apply(): RemovePublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovePublicKeyRequest]
  }
  
  extension [Self <: RemovePublicKeyRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
