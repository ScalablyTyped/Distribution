package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationToken extends StObject {
  
  /** The authentication token to be passed to the device policy client on the device where it can be used to provision the account for which this token was generated. */
  var token: js.UndefOr[String] = js.undefined
}
object AuthenticationToken {
  
  @scala.inline
  def apply(): AuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationToken]
  }
  
  @scala.inline
  implicit class AuthenticationTokenMutableBuilder[Self <: AuthenticationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
