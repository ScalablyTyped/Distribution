package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCredentials extends StObject {
  
  /** An OAuth access token. */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /** The amount of time, in seconds, after which the access token is no longer valid. */
  var expiresIn: js.UndefOr[String] = js.undefined
  
  /** Indicates to Google how Google should use these OAuth tokens. */
  var purpose: js.UndefOr[String] = js.undefined
}
object AccountCredentials {
  
  inline def apply(): AccountCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountCredentials] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
  }
}
