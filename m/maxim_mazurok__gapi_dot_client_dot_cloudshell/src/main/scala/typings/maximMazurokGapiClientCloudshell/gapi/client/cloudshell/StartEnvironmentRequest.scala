package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEnvironmentRequest extends StObject {
  
  /**
    * The initial access token passed to the environment. If this is present and valid, the environment will be pre-authenticated with gcloud so that the user can run gcloud commands in
    * Cloud Shell without having to log in. This code can be updated later by calling AuthorizeEnvironment.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /** Public keys that should be added to the environment before it is started. */
  var publicKeys: js.UndefOr[js.Array[String]] = js.undefined
}
object StartEnvironmentRequest {
  
  @scala.inline
  def apply(): StartEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEnvironmentRequest]
  }
  
  @scala.inline
  implicit class StartEnvironmentRequestMutableBuilder[Self <: StartEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setPublicKeys(value: js.Array[String]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    @scala.inline
    def setPublicKeysVarargs(value: String*): Self = StObject.set(x, "publicKeys", js.Array(value :_*))
  }
}
