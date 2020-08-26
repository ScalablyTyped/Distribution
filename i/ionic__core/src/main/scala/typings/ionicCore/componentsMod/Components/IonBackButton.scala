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

@js.native
trait IonBackButton extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * The url to navigate back to by default when there is no history.
    */
  var defaultHref: js.UndefOr[String] = js.native
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: Boolean = js.native
  /**
    * The icon name to use for the back button.
    */
  var icon: js.UndefOr[String | Null] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * When using a router, it specifies the transition animation when navigating to another page.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * The text to display in the back button.
    */
  var text: js.UndefOr[String | Null] = js.native
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button = js.native
}

object IonBackButton {
  @scala.inline
  def apply(disabled: Boolean, `type`: submit | reset | button): IonBackButton = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonBackButton]
  }
  @scala.inline
  implicit class IonBackButtonOps[Self <: IonBackButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDefaultHref(value: String): Self = this.set("defaultHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHref: Self = this.set("defaultHref", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("routerAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRouterAnimation: Self = this.set("routerAnimation", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

