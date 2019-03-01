package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ TabStripSelectEvent, scala.Unit]] = js.undefined
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
}

object TabStripOptions {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    select: js.Function1[/* e */ TabStripSelectEvent, scala.Unit] = null,
    selectedIndex: scala.Int | scala.Double = null
  ): TabStripOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripOptions]
  }
}

