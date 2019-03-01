package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var html: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var textVisible: js.UndefOr[scala.Boolean] = js.undefined
  var textonly: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(
    html: java.lang.String = null,
    text: java.lang.String = null,
    textVisible: js.UndefOr[scala.Boolean] = js.undefined,
    textonly: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(textVisible)) __obj.updateDynamic("textVisible")(textVisible)
    if (!js.isUndefined(textonly)) __obj.updateDynamic("textonly")(textonly)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[LoaderOptions]
  }
}

