package typings.jqueryDotMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassnamesConfigurations extends js.Object {
  /**
    * The classname on a LI that should be displayed as a divider.
    * Default: "Divider"
    */
  var divider: js.UndefOr[String] = js.undefined
  /**
    * The classname on a submenu (a nested UL) that should be displayed as a default list.
    * Default: "Inset"
    */
  var inset: js.UndefOr[String] = js.undefined
  /**
    * The classname on an element (for example a DIV) that should be considered to be a panel.
    * Only applies if the "isMenu" option is set to false.
    * Default: "Panel"
    */
  var panel: js.UndefOr[String] = js.undefined
  /**
    * The classname on the LI that should be displayed as selected.
    * Default: "Selected"
    */
  var selected: js.UndefOr[String] = js.undefined
  /**
    * The classname on a submenu (a nested UL) that should expand below
    * their parent instead of slide in from the right.
    * Default: "vertical"
    */
  var vertical: js.UndefOr[String] = js.undefined
}

object ClassnamesConfigurations {
  @scala.inline
  def apply(
    divider: String = null,
    inset: String = null,
    panel: String = null,
    selected: String = null,
    vertical: String = null
  ): ClassnamesConfigurations = {
    val __obj = js.Dynamic.literal()
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassnamesConfigurations]
  }
}

