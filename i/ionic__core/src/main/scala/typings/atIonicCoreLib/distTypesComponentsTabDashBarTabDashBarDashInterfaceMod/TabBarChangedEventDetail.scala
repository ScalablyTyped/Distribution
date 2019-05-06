package typings
package atIonicCoreLib.distTypesComponentsTabDashBarTabDashBarDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarChangedEventDetail extends js.Object {
  var tab: js.UndefOr[java.lang.String] = js.undefined
}

object TabBarChangedEventDetail {
  @scala.inline
  def apply(tab: java.lang.String = null): TabBarChangedEventDetail = {
    val __obj = js.Dynamic.literal()
    if (tab != null) __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[TabBarChangedEventDetail]
  }
}

