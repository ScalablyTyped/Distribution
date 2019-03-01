package typings
package jqueryDotMmenuLib.JQueryMmenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassnamesConfigurations extends js.Object {
  /**
    * The classname on a LI that should be displayed as a divider.
    * Default: "Divider"
    */
  var divider: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname on a submenu (a nested UL) that should be displayed as a default list.
    * Default: "Inset"
    */
  var inset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname on an element (for example a DIV) that should be considered to be a panel.
    * Only applies if the "isMenu" option is set to false.
    * Default: "Panel"
    */
  var panel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname on the LI that should be displayed as selected.
    * Default: "Selected"
    */
  var selected: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname on a submenu (a nested UL) that should expand below
    * their parent instead of slide in from the right.
    * Default: "vertical"
    */
  var vertical: js.UndefOr[java.lang.String] = js.undefined
}

object ClassnamesConfigurations {
  @scala.inline
  def apply(
    divider: java.lang.String = null,
    inset: java.lang.String = null,
    panel: java.lang.String = null,
    selected: java.lang.String = null,
    vertical: java.lang.String = null
  ): ClassnamesConfigurations = {
    val __obj = js.Dynamic.literal()
    if (divider != null) __obj.updateDynamic("divider")(divider)
    if (inset != null) __obj.updateDynamic("inset")(inset)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ClassnamesConfigurations]
  }
}

