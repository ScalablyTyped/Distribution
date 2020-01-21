package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurve extends js.Object {
  var curve: String
  var pub: js.UndefOr[String] = js.undefined
}

object AnonCurve {
  @scala.inline
  def apply(curve: String, pub: String = null): AnonCurve = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any])
    if (pub != null) __obj.updateDynamic("pub")(pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurve]
  }
}

