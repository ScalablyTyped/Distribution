package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    padding: scala.Int | scala.Double = null,
    textColor: java.lang.String = null
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

