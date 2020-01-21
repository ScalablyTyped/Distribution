package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTapHighlightColor extends js.Object {
  var tapHighlightColor: js.UndefOr[String] = js.undefined
}

object AnonTapHighlightColor {
  @scala.inline
  def apply(tapHighlightColor: String = null): AnonTapHighlightColor = {
    val __obj = js.Dynamic.literal()
    if (tapHighlightColor != null) __obj.updateDynamic("tapHighlightColor")(tapHighlightColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTapHighlightColor]
  }
}

