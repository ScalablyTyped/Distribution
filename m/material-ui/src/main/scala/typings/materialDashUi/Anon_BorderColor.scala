package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_BorderColor {
  @scala.inline
  def apply(borderColor: String = null, padding: Int | Double = null, textColor: String = null): Anon_BorderColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

