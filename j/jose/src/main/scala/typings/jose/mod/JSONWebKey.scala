package typings.jose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jose.mod.JWKRSAKey
  - typings.jose.mod.JWKOKPKey
  - typings.jose.mod.JWKECKey
  - typings.jose.mod.JWKOctKey
*/
trait JSONWebKey extends StObject
object JSONWebKey {
  
  inline def JWKECKey(crv: ECCurve, x: String, y: String): typings.jose.mod.JWKECKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jose.mod.JWKECKey]
  }
  
  inline def JWKOKPKey(crv: OKPCurve, x: String): typings.jose.mod.JWKOKPKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "OKP", x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jose.mod.JWKOKPKey]
  }
  
  inline def JWKOctKey(): typings.jose.mod.JWKOctKey = {
    val __obj = js.Dynamic.literal(kty = "oct")
    __obj.asInstanceOf[typings.jose.mod.JWKOctKey]
  }
  
  inline def JWKRSAKey(e: String, n: String): typings.jose.mod.JWKRSAKey = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jose.mod.JWKRSAKey]
  }
}
