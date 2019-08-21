package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgAud extends js.Object {
  var alg: js.Array[String]
  var aud: js.Array[String]
  var iss: js.Array[String]
  var jti: js.UndefOr[String] = js.undefined
  var sub: js.Array[String]
  var verifyAt: js.UndefOr[String | Double] = js.undefined
}

object Anon_AlgAud {
  @scala.inline
  def apply(
    alg: js.Array[String],
    aud: js.Array[String],
    iss: js.Array[String],
    sub: js.Array[String],
    jti: String = null,
    verifyAt: String | Double = null
  ): Anon_AlgAud = {
    val __obj = js.Dynamic.literal(alg = alg, aud = aud, iss = iss, sub = sub)
    if (jti != null) __obj.updateDynamic("jti")(jti)
    if (verifyAt != null) __obj.updateDynamic("verifyAt")(verifyAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlgAud]
  }
}

