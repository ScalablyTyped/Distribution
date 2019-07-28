package typings.hummusDashRecipe.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotOptions extends js.Object {
  var flag: js.UndefOr[AnnotOptionsFlag] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[AnnotOptionsIcon] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var richText: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnnotOptions {
  @scala.inline
  def apply(
    flag: AnnotOptionsFlag = null,
    height: Int | Double = null,
    icon: AnnotOptionsIcon = null,
    open: js.UndefOr[Boolean] = js.undefined,
    richText: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: Int | Double = null
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

