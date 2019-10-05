package typings.jqueryDotMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarOptions extends js.Object {
  /**
    * Whether or not to add a navbar above the panels.
    * Default: true
    */
  var add: js.UndefOr[Boolean] = js.undefined
  /**
    * The title above the main panel.
    * Default: "Menu"
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type of link to set for the title.
    * Possible values: "parent", "anchor" or "none".
    * Default: "parent"
    */
  var titleLink: js.UndefOr[String] = js.undefined
}

object NavbarOptions {
  @scala.inline
  def apply(add: js.UndefOr[Boolean] = js.undefined, title: String = null, titleLink: String = null): NavbarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleLink != null) __obj.updateDynamic("titleLink")(titleLink)
    __obj.asInstanceOf[NavbarOptions]
  }
}

