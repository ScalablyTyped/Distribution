package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseMenu extends js.Object {
  var closeMenu: js.UndefOr[String] = js.undefined
  var openMenu: js.UndefOr[String] = js.undefined
}

object AnonCloseMenu {
  @scala.inline
  def apply(closeMenu: String = null, openMenu: String = null): AnonCloseMenu = {
    val __obj = js.Dynamic.literal()
    if (closeMenu != null) __obj.updateDynamic("closeMenu")(closeMenu.asInstanceOf[js.Any])
    if (openMenu != null) __obj.updateDynamic("openMenu")(openMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseMenu]
  }
}

