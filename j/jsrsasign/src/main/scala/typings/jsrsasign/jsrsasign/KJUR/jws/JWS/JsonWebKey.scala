package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

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
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonWebKey]
  }
}

