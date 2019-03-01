package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButtonOptions
  extends /* attr */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var click: js.UndefOr[js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var showText: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object DialogButtonOptions {
  @scala.inline
  def apply(
    StringDictionary: /* attr */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    click: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _] = null,
    icons: js.Any = null,
    showText: java.lang.String | scala.Boolean = null,
    text: java.lang.String = null
  ): DialogButtonOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (click != null) __obj.updateDynamic("click")(click)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (showText != null) __obj.updateDynamic("showText")(showText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DialogButtonOptions]
  }
}

