package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single value that is part of a MenuItem.
  */
@js.native
trait SchemaMenuValue extends js.Object {
  /**
    * The name to display for the menu item. If you specify this property for a
    * built-in menu item, the default contextual voice command for that menu
    * item is not shown.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * URL of an icon to display with the menu item.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The state that this value applies to. Allowed values are:   - DEFAULT -
    * Default value shown when displayed in the menuItems list.  - PENDING -
    * Value shown when the menuItem has been selected by the user but can still
    * be cancelled.  - CONFIRMED - Value shown when the menuItem has been
    * selected by the user and can no longer be cancelled.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaMenuValue {
  @scala.inline
  def apply(displayName: String = null, iconUrl: String = null, state: String = null): SchemaMenuValue = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMenuValue]
  }
}

