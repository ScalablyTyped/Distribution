package typings
package atIonicCoreLib.distTypesComponentsTabDashBarTabDashBarDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabButtonClickEventDetail extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var selected: scala.Boolean
  var tab: java.lang.String
}

object TabButtonClickEventDetail {
  @scala.inline
  def apply(selected: scala.Boolean, tab: java.lang.String, href: java.lang.String = null): TabButtonClickEventDetail = {
    val __obj = js.Dynamic.literal(selected = selected, tab = tab)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[TabButtonClickEventDetail]
  }
}

