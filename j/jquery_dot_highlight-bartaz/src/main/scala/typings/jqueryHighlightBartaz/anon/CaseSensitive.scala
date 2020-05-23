package typings.jqueryHighlightBartaz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var wordsOnly: js.UndefOr[Boolean] = js.undefined
}

object CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    element: String = null,
    wordsOnly: js.UndefOr[Boolean] = js.undefined
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(wordsOnly)) __obj.updateDynamic("wordsOnly")(wordsOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
}

