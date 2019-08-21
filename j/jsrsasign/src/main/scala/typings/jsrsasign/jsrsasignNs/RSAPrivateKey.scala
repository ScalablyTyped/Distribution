package typings.jsrsasign.jsrsasignNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAPrivateKey extends js.Object {
  var co: String
  var d: String
  var dp: String
  var dq: String
  var e: String
  var n: String
  var p: String
  var q: String
}

object RSAPrivateKey {
  @scala.inline
  def apply(co: String, d: String, dp: String, dq: String, e: String, n: String, p: String, q: String): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(co = co, d = d, dp = dp, dq = dq, e = e, n = n, p = p, q = q)
  
    __obj.asInstanceOf[RSAPrivateKey]
  }
}

