package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonBackButton extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * The url to navigate back to by default when there is no history.
    */
  var defaultHref: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: scala.Boolean
  /**
    * The icon name to use for the back button.
    */
  var icon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * The text to display in the back button.
    */
  var text: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button
}

object IonBackButton {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    defaultHref: java.lang.String = null,
    icon: java.lang.String = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null,
    text: java.lang.String = null
  ): IonBackButton = {
    val __obj = js.Dynamic.literal(disabled = disabled)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (defaultHref != null) __obj.updateDynamic("defaultHref")(defaultHref)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[IonBackButton]
  }
}

