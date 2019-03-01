package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Button //////////////////////////////////////////////////
trait ButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    click: js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icons: js.Any = null,
    label: java.lang.String = null,
    text: java.lang.String | scala.Boolean = null
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (label != null) __obj.updateDynamic("label")(label)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

