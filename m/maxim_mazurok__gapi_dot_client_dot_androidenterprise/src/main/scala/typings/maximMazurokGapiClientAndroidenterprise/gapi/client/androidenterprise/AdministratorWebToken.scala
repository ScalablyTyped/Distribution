package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministratorWebToken extends StObject {
  
  /** An opaque token to be passed to the Play front-end to generate an iframe. */
  var token: js.UndefOr[String] = js.undefined
}
object AdministratorWebToken {
  
  inline def apply(): AdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebToken]
  }
  
  extension [Self <: AdministratorWebToken](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
