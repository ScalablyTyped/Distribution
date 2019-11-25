package typings.jsrsasign.jsrsasign

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
    val __obj = js.Dynamic.literal(co = co.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RSAPrivateKey]
  }
}

