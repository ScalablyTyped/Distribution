package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTyp extends js.Object {
  var alg: String
  var typ: String
}

object AnonTyp {
  @scala.inline
  def apply(alg: String, typ: String): AnonTyp = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTyp]
  }
}

