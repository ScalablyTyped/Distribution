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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@ionic/react.@ionic/react/dist/types/components/navigation/IonBackButton.Props> */
trait ReadonlyProps extends StObject {
  
  val `class`: js.UndefOr[String] = js.undefined
  
  val className: js.UndefOr[String] = js.undefined
  
  val color: js.UndefOr[Color] = js.undefined
  
  val defaultHref: js.UndefOr[String] = js.undefined
  
  val disabled: js.UndefOr[Boolean] = js.undefined
  
  val icon: js.UndefOr[Ios | String] = js.undefined
  
  val mode: js.UndefOr[ios | md] = js.undefined
  
  val ref: js.UndefOr[RefObject[HTMLIonBackButtonElement]] = js.undefined
  
  val routerAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  val style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  val text: js.UndefOr[String | Null] = js.undefined
  
  val `type`: js.UndefOr[submit | reset | button] = js.undefined
}
object ReadonlyProps {
  
  inline def apply(): ReadonlyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyProps]
  }
  
  extension [Self <: ReadonlyProps](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDefaultHref(value: String): Self = StObject.set(x, "defaultHref", value.asInstanceOf[js.Any])
    
    inline def setDefaultHrefUndefined: Self = StObject.set(x, "defaultHref", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: Ios | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRef(value: RefObject[HTMLIonBackButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "routerAnimation", js.Any.fromFunction2(value))
    
    inline def setRouterAnimationUndefined: Self = StObject.set(x, "routerAnimation", js.undefined)
    
    inline def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
