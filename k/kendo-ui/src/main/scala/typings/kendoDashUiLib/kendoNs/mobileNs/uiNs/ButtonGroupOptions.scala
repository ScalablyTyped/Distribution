package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupOptions extends js.Object {
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ButtonGroupSelectEvent, scala.Unit]] = js.undefined
  var selectOn: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonGroupOptions {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    select: /* e */ ButtonGroupSelectEvent => scala.Unit = null,
    selectOn: java.lang.String = null
  ): ButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectOn != null) __obj.updateDynamic("selectOn")(selectOn)
    __obj.asInstanceOf[ButtonGroupOptions]
  }
}

