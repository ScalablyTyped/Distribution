package typings.hummusRecipe.mod

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
    height: js.UndefOr[Double] = js.undefined,
    icon: AnnotOptionsIcon = null,
    open: js.UndefOr[Boolean] = js.undefined,
    richText: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): AnnotOptions = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(richText)) __obj.updateDynamic("richText")(richText.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotOptions]
  }
}

