package typings
package hummusDashRecipeLib.hummusDashRecipeMod.RecipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotOptions extends js.Object {
  var flag: js.UndefOr[AnnotOptionsFlag] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var icon: js.UndefOr[AnnotOptionsIcon] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var richText: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AnnotOptions {
  @scala.inline
  def apply(
    flag: AnnotOptionsFlag = null,
    height: scala.Int | scala.Double = null,
    icon: AnnotOptionsIcon = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    richText: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): AnnotOptions = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(richText)) __obj.updateDynamic("richText")(richText)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotOptions]
  }
}

