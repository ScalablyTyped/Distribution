package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorDeleteIconColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var deleteIconColor: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontWeight: js.UndefOr[scala.Double] = js.undefined
  var shadow: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColorDeleteIconColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    deleteIconColor: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontWeight: scala.Int | scala.Double = null,
    shadow: java.lang.String = null,
    textColor: java.lang.String = null
  ): Anon_BackgroundColorDeleteIconColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (deleteIconColor != null) __obj.updateDynamic("deleteIconColor")(deleteIconColor)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Anon_BackgroundColorDeleteIconColor]
  }
}

