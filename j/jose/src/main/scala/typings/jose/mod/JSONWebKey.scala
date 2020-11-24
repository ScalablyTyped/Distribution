package typings.jose.mod

import typings.jose.joseStrings.EC
import typings.jose.joseStrings.OKP
import typings.jose.joseStrings.RSA
import typings.jose.joseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jose.mod.JWKRSAKey
  - typings.jose.mod.JWKOKPKey
  - typings.jose.mod.JWKECKey
  - typings.jose.mod.JWKOctKey
*/
trait JSONWebKey extends js.Object
object JSONWebKey {
  
  @scala.inline
  def JWKRSAKey(e: String, kty: RSA, n: String): JSONWebKey = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWebKey]
  }
  
  @scala.inline
  def JWKOKPKey(crv: OKPCurve, kty: OKP, x: String): JSONWebKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWebKey]
  }
  
  @scala.inline
  def JWKECKey(crv: ECCurve, kty: EC, x: String, y: String): JSONWebKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWebKey]
  }
  
  @scala.inline
  def JWKOctKey(kty: oct): JSONWebKey = {
    val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONWebKey]
  }
}
