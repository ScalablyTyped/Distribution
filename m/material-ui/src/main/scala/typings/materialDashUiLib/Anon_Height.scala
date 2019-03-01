package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var iconButtonSize: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var textTransform: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    iconButtonSize: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    textTransform: java.lang.String = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconButtonSize != null) __obj.updateDynamic("iconButtonSize")(iconButtonSize.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform)
    __obj.asInstanceOf[Anon_Height]
  }
}

