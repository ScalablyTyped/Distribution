package typings
package jqueryDotMmenuLib.JQueryMmenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarOptions extends js.Object {
  /**
    * Whether or not to add a navbar above the panels.
    * Default: true
    */
  var add: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The title above the main panel.
    * Default: "Menu"
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of link to set for the title.
    * Possible values: "parent", "anchor" or "none".
    * Default: "parent"
    */
  var titleLink: js.UndefOr[java.lang.String] = js.undefined
}

object NavbarOptions {
  @scala.inline
  def apply(
    add: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleLink: java.lang.String = null
  ): NavbarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleLink != null) __obj.updateDynamic("titleLink")(titleLink)
    __obj.asInstanceOf[NavbarOptions]
  }
}

