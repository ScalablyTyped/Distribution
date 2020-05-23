package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapHighlightColor extends js.Object {
  var tapHighlightColor: js.UndefOr[String] = js.undefined
}

object TapHighlightColor {
  @scala.inline
  def apply(tapHighlightColor: String = null): TapHighlightColor = {
    val __obj = js.Dynamic.literal()
    if (tapHighlightColor != null) __obj.updateDynamic("tapHighlightColor")(tapHighlightColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapHighlightColor]
  }
}

