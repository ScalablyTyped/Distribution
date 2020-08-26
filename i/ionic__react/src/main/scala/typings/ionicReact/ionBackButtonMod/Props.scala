package typings.ionicReact.ionBackButtonMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonBackButtonElement
import typings.ionicCore.mod.Color
import typings.ionicReact.anon.Ios
import typings.ionicReact.ionicReactStrings.button
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.ionicReact.ionicReactStrings.reset
import typings.ionicReact.ionicReactStrings.submit
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@ionic/core.@ionic/core.JSX.IonBackButton, 'icon'> & @ionic/react.@ionic/react/dist/types/components/IonicReactProps.IonicReactProps & {  icon :{  ios :string,   md :string} | string | undefined,   ref :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonBackButtonElement> | undefined} */
@js.native
trait Props extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[Color] = js.native
  var defaultHref: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Ios | String] = js.native
  var mode: js.UndefOr[ios | md] = js.native
  var ref: js.UndefOr[RefObject[HTMLIonBackButtonElement]] = js.native
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
  var text: js.UndefOr[String | Null] = js.native
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDefaultHref(value: String): Self = this.set("defaultHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHref: Self = this.set("defaultHref", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: Ios | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRef(value: RefObject[HTMLIonBackButtonElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("routerAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRouterAnimation: Self = this.set("routerAnimation", js.undefined)
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    @scala.inline
    def setType(value: submit | reset | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

