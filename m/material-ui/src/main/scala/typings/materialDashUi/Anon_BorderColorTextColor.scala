package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorTextColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_BorderColorTextColor {
  @scala.inline
  def apply(borderColor: String = null, textColor: String = null): Anon_BorderColorTextColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BorderColorTextColor]
  }
}

