package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaximum extends js.Object {
  var maximum: js.UndefOr[Double] = js.undefined
}

object AnonMaximum {
  @scala.inline
  def apply(maximum: Int | Double = null): AnonMaximum = {
    val __obj = js.Dynamic.literal()
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaximum]
  }
}

