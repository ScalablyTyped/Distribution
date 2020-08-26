package typings.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A collection of extension names to enable for the menu.
    * You'll need this option when using the extensions.
    * Default: []
    */
  var extensions: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * navbar options
    */
  var navbar: js.UndefOr[NavbarOptions] = js.native
  /**
    * onClick options
    */
  var onClick: js.UndefOr[OnclickOptions] = js.native
  /**
    * Whether or not submenus should come sliding in from the right.
    * If false, submenus expand below their parent.
    * To expand a single submenu below its parent item, add the class "Vertical" to it.
    * Default: true
    */
  var slidingSubmenus: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtensionsVarargs(value: js.Object*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setNavbar(value: NavbarOptions): Self = this.set("navbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavbar: Self = this.set("navbar", js.undefined)
    @scala.inline
    def setOnClick(value: OnclickOptions): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSlidingSubmenus(value: Boolean): Self = this.set("slidingSubmenus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidingSubmenus: Self = this.set("slidingSubmenus", js.undefined)
  }
  
}

