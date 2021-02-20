package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonBackButtonElement
import typings.ionicCore.mod.Color
import typings.ionicReact.anon.ClickButton
import typings.ionicReact.anon.Ios
import typings.ionicReact.anon.ReadonlyProps
import typings.ionicReact.ionicReactStrings.button
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.md
import typings.ionicReact.ionicReactStrings.reset
import typings.ionicReact.ionicReactStrings.submit
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Context
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionBackButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton")
  @js.native
  class IonBackButton protected () extends ClickButton {
    def this(props: ReadonlyProps) = this()
    def this(props: Props) = this()
    def this(props: Props, context: js.Any) = this()
  }
  object IonBackButton {
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton.contextType")
    @js.native
    val contextType: Context[NavContextState] = js.native
    
    @JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton.displayName")
    @js.native
    val displayName: String = js.native
  }
  
  /* Inlined std.Omit<@ionic/core.@ionic/core.JSX.IonBackButton, 'icon'> & @ionic/react.@ionic/react/dist/types/components/IonicReactProps.IonicReactProps & {  icon :{  ios :string,   md :string} | string | undefined,   ref :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonBackButtonElement> | undefined} */
  @js.native
  trait Props extends StObject {
    
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
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
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
}
