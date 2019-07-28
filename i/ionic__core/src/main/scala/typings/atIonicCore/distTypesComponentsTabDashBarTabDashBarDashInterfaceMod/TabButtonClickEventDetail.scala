package typings.atIonicCore.distTypesComponentsTabDashBarTabDashBarDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabButtonClickEventDetail extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var selected: Boolean
  var tab: String
}

object TabButtonClickEventDetail {
  @scala.inline
  def apply(selected: Boolean, tab: String, href: String = null): TabButtonClickEventDetail = {
    val __obj = js.Dynamic.literal(selected = selected, tab = tab)
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[TabButtonClickEventDetail]
  }
}

