package typings.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A collection of extension names to enable for the menu.
    * You'll need this option when using the extensions.
    * Default: []
    */
  var extensions: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * navbar options
    */
  var navbar: js.UndefOr[NavbarOptions] = js.undefined
  /**
    * onClick options
    */
  var onClick: js.UndefOr[OnclickOptions] = js.undefined
  /**
    * Whether or not submenus should come sliding in from the right.
    * If false, submenus expand below their parent.
    * To expand a single submenu below its parent item, add the class "Vertical" to it.
    * Default: true
    */
  var slidingSubmenus: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extensions: js.Array[js.Object] = null,
    navbar: NavbarOptions = null,
    onClick: OnclickOptions = null,
    slidingSubmenus: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (navbar != null) __obj.updateDynamic("navbar")(navbar.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (!js.isUndefined(slidingSubmenus)) __obj.updateDynamic("slidingSubmenus")(slidingSubmenus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

