package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAud extends js.Object {
  var alg: js.Array[String]
  var aud: js.Array[String]
  var iss: js.Array[String]
  var jti: js.UndefOr[String] = js.undefined
  var sub: js.Array[String]
  var verifyAt: js.UndefOr[String | Double] = js.undefined
}

object AnonAud {
  @scala.inline
  def apply(
    alg: js.Array[String],
    aud: js.Array[String],
    iss: js.Array[String],
    sub: js.Array[String],
    jti: String = null,
    verifyAt: String | Double = null
  ): AnonAud = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    if (jti != null) __obj.updateDynamic("jti")(jti.asInstanceOf[js.Any])
    if (verifyAt != null) __obj.updateDynamic("verifyAt")(verifyAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAud]
  }
}

