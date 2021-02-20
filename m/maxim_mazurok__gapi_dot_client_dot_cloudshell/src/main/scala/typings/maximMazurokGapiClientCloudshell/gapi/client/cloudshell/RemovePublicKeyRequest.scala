package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemovePublicKeyRequest extends StObject {
  
  /** Key that should be removed from the environment. */
  var key: js.UndefOr[String] = js.native
}
object RemovePublicKeyRequest {
  
  @scala.inline
  def apply(): RemovePublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovePublicKeyRequest]
  }
  
  @scala.inline
  implicit class RemovePublicKeyRequestMutableBuilder[Self <: RemovePublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
