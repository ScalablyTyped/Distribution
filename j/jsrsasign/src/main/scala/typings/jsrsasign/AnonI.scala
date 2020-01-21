package typings.jsrsasign

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonI extends js.Object {
  var i: Double
  var r: BigInteger
  var s: BigInteger
}

object AnonI {
  @scala.inline
  def apply(i: Double, r: BigInteger, s: BigInteger): AnonI = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonI]
  }
}

