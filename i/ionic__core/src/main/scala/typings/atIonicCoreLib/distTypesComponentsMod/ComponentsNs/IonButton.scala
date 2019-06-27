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
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: scala.Boolean
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[java.lang.String] = js.undefined
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
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[java.lang.String] = js.undefined
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
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
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
    routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    strong: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    download: java.lang.String = null,
    expand: atIonicCoreLib.atIonicCoreLibStrings.full | atIonicCoreLib.atIonicCoreLibStrings.block = null,
    fill: atIonicCoreLib.atIonicCoreLibStrings.clear | atIonicCoreLib.atIonicCoreLibStrings.outline | atIonicCoreLib.atIonicCoreLibStrings.solid | atIonicCoreLib.atIonicCoreLibStrings.default = null,
    href: java.lang.String = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null,
    rel: java.lang.String = null,
    shape: atIonicCoreLib.atIonicCoreLibStrings.round = null,
    size: atIonicCoreLib.atIonicCoreLibStrings.small | atIonicCoreLib.atIonicCoreLibStrings.default | atIonicCoreLib.atIonicCoreLibStrings.large = null,
    target: java.lang.String = null
  ): IonButton = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, disabled = disabled, routerDirection = routerDirection, strong = strong)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (download != null) __obj.updateDynamic("download")(download)
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IonButton]
  }
}

