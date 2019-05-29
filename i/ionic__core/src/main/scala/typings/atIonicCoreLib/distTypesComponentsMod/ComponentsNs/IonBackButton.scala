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
    * The icon name to use for the back button.
    */
  var icon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * The text to display in the back button.
    */
  var text: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object IonBackButton {
  @scala.inline
  def apply(
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    defaultHref: java.lang.String = null,
    icon: java.lang.String = null,
    text: java.lang.String = null
  ): IonBackButton = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (color != null) __obj.updateDynamic("color")(color)
    if (defaultHref != null) __obj.updateDynamic("defaultHref")(defaultHref)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[IonBackButton]
  }
}

