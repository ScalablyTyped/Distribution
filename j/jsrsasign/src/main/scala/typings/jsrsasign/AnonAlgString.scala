package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgString extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
}

object AnonAlgString {
  @scala.inline
  def apply(alg: String = null): AnonAlgString = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgString]
  }
}

