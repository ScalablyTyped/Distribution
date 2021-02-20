package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPublicKeyResponse extends StObject {
  
  /** Key that was added to the environment. */
  var key: js.UndefOr[String] = js.native
}
object AddPublicKeyResponse {
  
  @scala.inline
  def apply(): AddPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPublicKeyResponse]
  }
  
  @scala.inline
  implicit class AddPublicKeyResponseMutableBuilder[Self <: AddPublicKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
