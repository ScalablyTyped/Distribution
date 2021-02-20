package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministratorWebToken extends StObject {
  
  /** An opaque token to be passed to the Play front-end to generate an iframe. */
  var token: js.UndefOr[String] = js.native
}
object AdministratorWebToken {
  
  @scala.inline
  def apply(): AdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebToken]
  }
  
  @scala.inline
  implicit class AdministratorWebTokenMutableBuilder[Self <: AdministratorWebToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
