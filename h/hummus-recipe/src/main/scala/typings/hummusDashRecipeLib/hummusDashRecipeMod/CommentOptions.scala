package typings
package hummusDashRecipeLib.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentOptions extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var flag: js.UndefOr[CommentOptionsFlag] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var richText: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object CommentOptions {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    flag: CommentOptionsFlag = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    richText: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): CommentOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(richText)) __obj.updateDynamic("richText")(richText)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CommentOptions]
  }
}

