package typings
package jqueryDashTruncateDashHtmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateOptions extends js.Object {
  var ellipsis: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var noBreaks: js.UndefOr[scala.Boolean] = js.undefined
  var stripTags: js.UndefOr[scala.Boolean] = js.undefined
  var words: js.UndefOr[scala.Boolean] = js.undefined
}

object TruncateOptions {
  @scala.inline
  def apply(
    ellipsis: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    noBreaks: js.UndefOr[scala.Boolean] = js.undefined,
    stripTags: js.UndefOr[scala.Boolean] = js.undefined,
    words: js.UndefOr[scala.Boolean] = js.undefined
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

