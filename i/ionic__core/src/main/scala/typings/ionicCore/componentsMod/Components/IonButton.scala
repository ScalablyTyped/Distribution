package typings.ionicCore.componentsMod.Components

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.block
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.clear
import typings.ionicCore.ionicCoreStrings.default
import typings.ionicCore.ionicCoreStrings.full
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.large
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.outline
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.round
import typings.ionicCore.ionicCoreStrings.small
import typings.ionicCore.ionicCoreStrings.solid
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonButton extends js.Object {
  /**
    * The type of button.
    */
  var buttonType: String
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: Boolean
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[String] = js.undefined
  /**
    * Set to `"block"` for a full-width button or to `"full"` for a full-width button without left and right borders.
    */
  var expand: js.UndefOr[full | block] = js.undefined
  /**
    * Set to `"clear"` for a transparent button, to `"outline"` for a transparent button with a border, or to `"solid"`. The default style is `"solid"` except inside of a toolbar, where the default is `"clear"`.
    */
  var fill: js.UndefOr[clear | outline | solid | default] = js.undefined
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
    * When using a router, it specifies the transition animation when navigating to another page using `href`.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: RouterDirection
  /**
    * The button shape.
    */
  var shape: js.UndefOr[round] = js.undefined
  /**
    * The button size.
    */
  var size: js.UndefOr[small | default | large] = js.undefined
  /**
    * If `true`, activates a button with a heavier font weight.
    */
  var strong: Boolean
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button
}

object IonButton {
  @scala.inline
  def apply(
    buttonType: String,
    disabled: Boolean,
    routerDirection: RouterDirection,
    strong: Boolean,
    `type`: submit | reset | button,
    color: Color = null,
    download: String = null,
    expand: full | block = null,
    fill: clear | outline | solid | default = null,
    href: String = null,
    mode: ios | md = null,
    rel: String = null,
    routerAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    shape: round = null,
    size: small | default | large = null,
    target: String = null
  ): IonButton = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], routerDirection = routerDirection.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (routerAnimation != null) __obj.updateDynamic("routerAnimation")(js.Any.fromFunction2(routerAnimation))
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonButton]
  }
}

