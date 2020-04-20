package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECCPrivateKey extends js.Object {
  var curve: String
  var d: String
}

object ECCPrivateKey {
  @scala.inline
  def apply(curve: String, d: String): ECCPrivateKey = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCPrivateKey]
  }
}

