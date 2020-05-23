package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentOptions extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var flag: js.UndefOr[CommentOptionsFlag] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var richText: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object CommentOptions {
  @scala.inline
  def apply(
    date: String = null,
    flag: CommentOptionsFlag = null,
    open: js.UndefOr[Boolean] = js.undefined,
    richText: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): CommentOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(richText)) __obj.updateDynamic("richText")(richText.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentOptions]
  }
}

