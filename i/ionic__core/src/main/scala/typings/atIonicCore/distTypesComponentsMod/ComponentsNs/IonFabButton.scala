package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.small
import typings.atIonicCore.atIonicCoreStrings.submit
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typings.atIonicCore.distTypesInterfaceMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFabButton extends js.Object {
  /**
    * If `true`, the fab button will be show a close icon.
    */
  var activated: Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the fab button.
    */
  var disabled: Boolean
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[String] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: RouterDirection
  /**
    * If `true`, the fab button will show when in a fab-list.
    */
  var show: Boolean
  /**
    * The size of the button. Set this to `small` in order to have a mini fab.
    */
  var size: js.UndefOr[small] = js.undefined
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the fab button will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: Boolean
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button
}

object IonFabButton {
  @scala.inline
  def apply(
    activated: Boolean,
    disabled: Boolean,
    routerDirection: RouterDirection,
    show: Boolean,
    translucent: Boolean,
    `type`: submit | reset | button,
    color: Color = null,
    download: String = null,
    href: String = null,
    mode: ios | md = null,
    rel: String = null,
    size: small = null,
    target: String = null
  ): IonFabButton = {
    val __obj = js.Dynamic.literal(activated = activated, disabled = disabled, routerDirection = routerDirection, show = show, translucent = translucent)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (size != null) __obj.updateDynamic("size")(size)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IonFabButton]
  }
}

