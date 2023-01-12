package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginPayload extends StObject {
  
  /* An access token for the account.
    * This access token can then be used to authorize other requests. */
  var access_token: String
  
  /* ID of the logged-in device. Will be the same as the
    * corresponding parameter in the request, if one was specified. */
  var device_id: String
  
  /* The server_name of the homeserver on which the account has been registered.
    * @deprecated Clients should extract the server_name from
    * ``user_id`` (by splitting at the first colon) if they require
    * it. Note also that ``homeserver`` is not spelt this way.
    */
  var home_server: String
  
  /* The fully-qualified Matrix ID for the account. */
  var user_id: String
  
  /**
    * Optional client configuration provided by the server. If present,
    * clients SHOULD use the provided object to reconfigure themselves,
    * optionally validating the URLs within. This object takes the same
    * form as the one returned from .well-known autodiscovery.
    */
  var well_known: js.UndefOr[Any] = js.undefined
}
object LoginPayload {
  
  inline def apply(access_token: String, device_id: String, home_server: String, user_id: String): LoginPayload = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], home_server = home_server.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginPayload] (val x: Self) extends AnyVal {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    inline def setHome_server(value: String): Self = StObject.set(x, "home_server", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setWell_known(value: Any): Self = StObject.set(x, "well_known", value.asInstanceOf[js.Any])
    
    inline def setWell_knownUndefined: Self = StObject.set(x, "well_known", js.undefined)
  }
}
