package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIconColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var deleteIconColor: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var shadow: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object DeleteIconColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    deleteIconColor: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontWeight: js.UndefOr[Double] = js.undefined,
    shadow: String = null,
    textColor: String = null
  ): DeleteIconColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (deleteIconColor != null) __obj.updateDynamic("deleteIconColor")(deleteIconColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontWeight)) __obj.updateDynamic("fontWeight")(fontWeight.get.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIconColor]
  }
}

