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
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle
    */
  var menu: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
}

object IonMenuButton {
  @scala.inline
  def apply(
    autoHide: scala.Boolean,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    menu: java.lang.String = null
  ): IonMenuButton = {
    val __obj = js.Dynamic.literal(autoHide = autoHide, mode = mode)
    if (color != null) __obj.updateDynamic("color")(color)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    __obj.asInstanceOf[IonMenuButton]
  }
}

