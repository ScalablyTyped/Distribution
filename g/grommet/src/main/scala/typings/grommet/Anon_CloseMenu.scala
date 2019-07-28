package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseMenu extends js.Object {
  var closeMenu: js.UndefOr[String] = js.undefined
  var openMenu: js.UndefOr[String] = js.undefined
}

object Anon_CloseMenu {
  @scala.inline
  def apply(closeMenu: String = null, openMenu: String = null): Anon_CloseMenu = {
    val __obj = js.Dynamic.literal()
    if (closeMenu != null) __obj.updateDynamic("closeMenu")(closeMenu)
    if (openMenu != null) __obj.updateDynamic("openMenu")(openMenu)
    __obj.asInstanceOf[Anon_CloseMenu]
  }
}

