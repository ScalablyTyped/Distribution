package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupOptions extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[ButtonGroupItem]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ButtonGroupSelectEvent, Unit]] = js.undefined
  var selection: js.UndefOr[String] = js.undefined
}

object ButtonGroupOptions {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    items: js.Array[ButtonGroupItem] = null,
    name: String = null,
    select: /* e */ ButtonGroupSelectEvent => Unit = null,
    selection: String = null
  ): ButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupOptions]
  }
}

