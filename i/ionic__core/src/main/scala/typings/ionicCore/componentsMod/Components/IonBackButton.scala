package typings.ionicCore.componentsMod.Components

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonBackButton extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The url to navigate back to by default when there is no history.
    */
  var defaultHref: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: Boolean
  /**
    * The icon name to use for the back button.
    */
  var icon: js.UndefOr[String | Null] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * When using a router, it specifies the transition animation when navigating to another page.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * The text to display in the back button.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button
}

object IonBackButton {
  @scala.inline
  def apply(
    disabled: Boolean,
    `type`: submit | reset | button,
    color: Color = null,
    defaultHref: String = null,
    icon: js.UndefOr[Null | String] = js.undefined,
    mode: ios | md = null,
    routerAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    text: js.UndefOr[Null | String] = js.undefined
  ): IonBackButton = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (defaultHref != null) __obj.updateDynamic("defaultHref")(defaultHref.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (routerAnimation != null) __obj.updateDynamic("routerAnimation")(js.Any.fromFunction2(routerAnimation))
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonBackButton]
  }
}

