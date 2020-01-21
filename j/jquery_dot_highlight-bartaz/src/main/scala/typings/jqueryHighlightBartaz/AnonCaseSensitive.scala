package typings.jqueryHighlightBartaz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var wordsOnly: js.UndefOr[Boolean] = js.undefined
}

object AnonCaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    element: String = null,
    wordsOnly: js.UndefOr[Boolean] = js.undefined
  ): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(wordsOnly)) __obj.updateDynamic("wordsOnly")(wordsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitive]
  }
}

