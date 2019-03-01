package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupOptions extends js.Object {
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var items: js.UndefOr[js.Array[ButtonGroupItem]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ButtonGroupSelectEvent, scala.Unit]] = js.undefined
  var selection: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonGroupOptions {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    items: js.Array[ButtonGroupItem] = null,
    name: java.lang.String = null,
    select: js.Function1[/* e */ ButtonGroupSelectEvent, scala.Unit] = null,
    selection: java.lang.String = null
  ): ButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    if (name != null) __obj.updateDynamic("name")(name)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    __obj.asInstanceOf[ButtonGroupOptions]
  }
}

