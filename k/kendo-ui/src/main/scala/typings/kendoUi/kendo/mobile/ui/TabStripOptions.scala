package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, Unit]] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
}

object TabStripOptions {
  @scala.inline
  def apply(
    name: String = null,
    select: /* e */ TabStripSelectEvent => Unit = null,
    selectedIndex: js.UndefOr[Double] = js.undefined
  ): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(selectedIndex)) __obj.updateDynamic("selectedIndex")(selectedIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripOptions]
  }
}

