package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oauth2 extends StObject {
  
  /** OAuth 2.0 authentication information. */
  var oauth2: js.UndefOr[Scopes] = js.undefined
}
object Oauth2 {
  
  inline def apply(): Oauth2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Oauth2]
  }
  
  extension [Self <: Oauth2](x: Self) {
    
    inline def setOauth2(value: Scopes): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    
    inline def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
  }
}
