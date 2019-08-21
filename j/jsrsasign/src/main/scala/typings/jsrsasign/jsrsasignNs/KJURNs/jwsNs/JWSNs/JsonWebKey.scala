package typings.jsrsasign.jsrsasignNs.KJURNs.jwsNs.JWSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonWebKey extends js.Object {
  var crv: String
  var e: String
  var k: String
  var kty: String
  var n: String
  var v: String
  var x: String
  var y: String
}

object JsonWebKey {
  @scala.inline
  def apply(crv: String, e: String, k: String, kty: String, n: String, v: String, x: String, y: String): JsonWebKey = {
    val __obj = js.Dynamic.literal(crv = crv, e = e, k = k, kty = kty, n = n, v = v, x = x, y = y)
  
    __obj.asInstanceOf[JsonWebKey]
  }
}

