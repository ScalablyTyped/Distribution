package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuButton extends js.Object {
  /**
    * Automatically hides the menu button when the corresponding menu is not active
    */
  var autoHide: scala.Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the menu button.
    */
  var disabled: scala.Boolean
  /**
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle
    */
  var menu: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button
}

object IonMenuButton {
  @scala.inline
  def apply(
    autoHide: scala.Boolean,
    disabled: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    menu: java.lang.String = null
  ): IonMenuButton = {
    val __obj = js.Dynamic.literal(autoHide = autoHide, disabled = disabled)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    __obj.asInstanceOf[IonMenuButton]
  }
}

