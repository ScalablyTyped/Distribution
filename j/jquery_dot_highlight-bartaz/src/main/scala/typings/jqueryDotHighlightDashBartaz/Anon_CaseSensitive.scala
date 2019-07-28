package typings.jqueryDotHighlightDashBartaz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var wordsOnly: js.UndefOr[Boolean] = js.undefined
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    element: String = null,
    wordsOnly: js.UndefOr[Boolean] = js.undefined
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (className != null) __obj.updateDynamic("className")(className)
    if (element != null) __obj.updateDynamic("element")(element)
    if (!js.isUndefined(wordsOnly)) __obj.updateDynamic("wordsOnly")(wordsOnly)
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

