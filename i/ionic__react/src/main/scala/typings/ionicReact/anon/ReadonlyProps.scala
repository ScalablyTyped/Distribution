package typings.ionicReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonBackButtonElement
import typings.ionicCore.mod.Color
import typings.ionicReact.ionicReactStrings.button
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.ionicReact.ionicReactStrings.reset
import typings.ionicReact.ionicReactStrings.submit
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@ionic/react.@ionic/react/dist/types/components/navigation/IonBackButton.Props> */
@js.native
trait ReadonlyProps extends StObject {
  
  val `class`: js.UndefOr[String] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val color: js.UndefOr[Color] = js.native
  
  val defaultHref: js.UndefOr[String] = js.native
  
  val disabled: js.UndefOr[Boolean] = js.native
  
  val icon: js.UndefOr[Ios | String] = js.native
  
  val mode: js.UndefOr[ios | md] = js.native
  
  val ref: js.UndefOr[RefObject[HTMLIonBackButtonElement]] = js.native
  
  val routerAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  val style: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  val text: js.UndefOr[String | Null] = js.native
  
  val `type`: js.UndefOr[submit | reset | button] = js.native
}
object ReadonlyProps {
  
  @scala.inline
  def apply(): ReadonlyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyProps]
  }
  
  @scala.inline
  implicit class ReadonlyPropsMutableBuilder[Self <: ReadonlyProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDefaultHref(value: String): Self = StObject.set(x, "defaultHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHrefUndefined: Self = StObject.set(x, "defaultHref", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: Ios | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRef(value: RefObject[HTMLIonBackButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "routerAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRouterAnimationUndefined: Self = StObject.set(x, "routerAnimation", js.undefined)
    
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
