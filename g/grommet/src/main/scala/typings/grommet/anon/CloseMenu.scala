package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseMenu extends js.Object {
  var closeMenu: js.UndefOr[String] = js.undefined
  var openMenu: js.UndefOr[String] = js.undefined
}

object CloseMenu {
  @scala.inline
  def apply(closeMenu: String = null, openMenu: String = null): CloseMenu = {
    val __obj = js.Dynamic.literal()
    if (closeMenu != null) __obj.updateDynamic("closeMenu")(closeMenu.asInstanceOf[js.Any])
    if (openMenu != null) __obj.updateDynamic("openMenu")(openMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseMenu]
  }
}

