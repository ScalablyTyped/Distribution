package typings.jsrsasign

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonR extends js.Object {
  var r: BigInteger
  var s: BigInteger
}

object AnonR {
  @scala.inline
  def apply(r: BigInteger, s: BigInteger): AnonR = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonR]
  }
}

