package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonButton extends js.Object {
  /**
    * The type of button.
    */
  var buttonType: java.lang.String
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: scala.Boolean
  /**
    * Set to `"block"` for a full-width button or to `"full"` for a full-width button without left and right borders.
    */
  var expand: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.full | atIonicCoreLib.atIonicCoreLibStrings.block
  ] = js.undefined
  /**
    * Set to `"clear"` for a transparent button, to `"outline"` for a transparent button with a border, or to `"solid"`. The default style is `"solid"` except inside of a toolbar, where the default is `"clear"`.
    */
  var fill: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.clear | atIonicCoreLib.atIonicCoreLibStrings.outline | atIonicCoreLib.atIonicCoreLibStrings.solid | atIonicCoreLib.atIonicCoreLibStrings.default
  ] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  /**
    * The button shape.
    */
  var shape: js.UndefOr[atIonicCoreLib.atIonicCoreLibStrings.round] = js.undefined
  /**
    * The button size.
    */
  var size: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.small | atIonicCoreLib.atIonicCoreLibStrings.default | atIonicCoreLib.atIonicCoreLibStrings.large
  ] = js.undefined
  /**
    * If `true`, activates a button with a heavier font weight.
    */
  var strong: scala.Boolean
  /**
    * The type of the button.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button
}

object IonButton {
  @scala.inline
  def apply(
    buttonType: java.lang.String,
    disabled: scala.Boolean,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    strong: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    expand: atIonicCoreLib.atIonicCoreLibStrings.full | atIonicCoreLib.atIonicCoreLibStrings.block = null,
    fill: atIonicCoreLib.atIonicCoreLibStrings.clear | atIonicCoreLib.atIonicCoreLibStrings.outline | atIonicCoreLib.atIonicCoreLibStrings.solid | atIonicCoreLib.atIonicCoreLibStrings.default = null,
    href: java.lang.String = null,
    shape: atIonicCoreLib.atIonicCoreLibStrings.round = null,
    size: atIonicCoreLib.atIonicCoreLibStrings.small | atIonicCoreLib.atIonicCoreLibStrings.default | atIonicCoreLib.atIonicCoreLibStrings.large = null
  ): IonButton = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, disabled = disabled, mode = mode, routerDirection = routerDirection, strong = strong)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonButton]
  }
}

