package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorDeleteIconColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var deleteIconColor: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var shadow: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundColorDeleteIconColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    deleteIconColor: String = null,
    fontSize: Int | Double = null,
    fontWeight: Int | Double = null,
    shadow: String = null,
    textColor: String = null
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

