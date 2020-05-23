package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextColor extends js.Object {
  var textColor: js.UndefOr[String] = js.undefined
}

object TextColor {
  @scala.inline
  def apply(textColor: String = null): TextColor = {
    val __obj = js.Dynamic.literal()
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColor]
  }
}

