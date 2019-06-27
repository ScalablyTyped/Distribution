package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItem extends js.Object {
  /**
    * If `true`, a button tag will be rendered and the item will be tappable.
    */
  var button: scala.Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, a detail arrow will appear on the item. Defaults to `false` unless the `mode` is `ios` and an `href` or `button` property is present.
    */
  var detail: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The icon to use when `detail` is set to `true`.
    */
  var detailIcon: java.lang.String
  /**
    * If `true`, the user cannot interact with the item.
    */
  var disabled: scala.Boolean
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How the bottom border should be displayed on the item.
    */
  var lines: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.full | atIonicCoreLib.atIonicCoreLibStrings.inset | atIonicCoreLib.atIonicCoreLibStrings.none
  ] = js.undefined
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
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the button. Only used when an `onclick` or `button` property is present.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button
}

object IonItem {
  @scala.inline
  def apply(
    button: scala.Boolean,
    detailIcon: java.lang.String,
    disabled: scala.Boolean,
    routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    detail: js.UndefOr[scala.Boolean] = js.undefined,
    download: java.lang.String = null,
    href: java.lang.String = null,
    lines: atIonicCoreLib.atIonicCoreLibStrings.full | atIonicCoreLib.atIonicCoreLibStrings.inset | atIonicCoreLib.atIonicCoreLibStrings.none = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null,
    rel: java.lang.String = null,
    target: java.lang.String = null
  ): IonItem = {
    val __obj = js.Dynamic.literal(button = button, detailIcon = detailIcon, disabled = disabled, routerDirection = routerDirection)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail)
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IonItem]
  }
}

