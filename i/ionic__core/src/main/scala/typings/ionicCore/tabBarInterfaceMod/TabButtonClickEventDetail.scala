package typings.ionicCore.tabBarInterfaceMod

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
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabButtonClickEventDetail]
  }
}

