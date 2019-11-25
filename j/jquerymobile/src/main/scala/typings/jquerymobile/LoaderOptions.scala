package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var html: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textVisible: js.UndefOr[Boolean] = js.undefined
  var textonly: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    html: String = null,
    text: String = null,
    textVisible: js.UndefOr[Boolean] = js.undefined,
    textonly: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(textVisible)) __obj.updateDynamic("textVisible")(textVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(textonly)) __obj.updateDynamic("textonly")(textonly.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
}

