package typings.atIonicCore.distTypesComponentsTabDashBarTabDashBarDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarChangedEventDetail extends js.Object {
  var tab: js.UndefOr[String] = js.undefined
}

object TabBarChangedEventDetail {
  @scala.inline
  def apply(tab: String = null): TabBarChangedEventDetail = {
    val __obj = js.Dynamic.literal()
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarChangedEventDetail]
  }
}

