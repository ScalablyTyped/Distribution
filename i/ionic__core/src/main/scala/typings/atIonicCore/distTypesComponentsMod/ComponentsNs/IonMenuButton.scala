package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.submit
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuButton extends js.Object {
  /**
    * Automatically hides the menu button when the corresponding menu is not active
    */
  var autoHide: Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the menu button.
    */
  var disabled: Boolean
  /**
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle
    */
  var menu: js.UndefOr[String] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button
}

object IonMenuButton {
  @scala.inline
  def apply(
    autoHide: Boolean,
    disabled: Boolean,
    `type`: submit | reset | button,
    color: Color = null,
    menu: String = null
  ): IonMenuButton = {
    val __obj = js.Dynamic.literal(autoHide = autoHide, disabled = disabled)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu)
    __obj.asInstanceOf[IonMenuButton]
  }
}

