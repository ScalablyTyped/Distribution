package typings.jqueryDashTruncateDashHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateOptions extends js.Object {
  var ellipsis: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var noBreaks: js.UndefOr[Boolean] = js.undefined
  var stripTags: js.UndefOr[Boolean] = js.undefined
  var words: js.UndefOr[Boolean] = js.undefined
}

object TruncateOptions {
  @scala.inline
  def apply(
    ellipsis: String = null,
    length: Int | Double = null,
    noBreaks: js.UndefOr[Boolean] = js.undefined,
    stripTags: js.UndefOr[Boolean] = js.undefined,
    words: js.UndefOr[Boolean] = js.undefined
  ): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(noBreaks)) __obj.updateDynamic("noBreaks")(noBreaks)
    if (!js.isUndefined(stripTags)) __obj.updateDynamic("stripTags")(stripTags)
    if (!js.isUndefined(words)) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[TruncateOptions]
  }
}

