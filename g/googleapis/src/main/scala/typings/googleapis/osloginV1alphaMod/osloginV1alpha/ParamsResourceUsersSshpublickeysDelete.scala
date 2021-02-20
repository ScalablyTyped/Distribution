package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersSshpublickeysDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The fingerprint of the public key to update. Public keys are identified
    * by their SHA-256 fingerprint. The fingerprint of the public key is in
    * format `users/{user}/sshPublicKeys/{fingerprint}`.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceUsersSshpublickeysDelete {
  
  @scala.inline
  def apply(): ParamsResourceUsersSshpublickeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSshpublickeysDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersSshpublickeysDeleteMutableBuilder[Self <: ParamsResourceUsersSshpublickeysDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
