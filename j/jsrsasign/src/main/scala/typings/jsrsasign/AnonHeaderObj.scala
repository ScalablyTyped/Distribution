package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaderObj extends js.Object {
  var headerObj: AnonTyp
  var headerPP: AnonTyp
  var sigHex: String
}

object AnonHeaderObj {
  @scala.inline
  def apply(headerObj: AnonTyp, headerPP: AnonTyp, sigHex: String): AnonHeaderObj = {
    val __obj = js.Dynamic.literal(headerObj = headerObj.asInstanceOf[js.Any], headerPP = headerPP.asInstanceOf[js.Any], sigHex = sigHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaderObj]
  }
}

