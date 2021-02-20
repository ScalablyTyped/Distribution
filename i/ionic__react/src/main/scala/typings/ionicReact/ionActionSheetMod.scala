package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import typings.ionicReact.anon.ActionSheetOptionsReactOv
import typings.ionicReact.anon.Ios
import typings.ionicReact.ionicReactStrings.cancel
import typings.ionicReact.ionicReactStrings.destructive
import typings.ionicReact.ionicReactStrings.selected
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionActionSheetMod {
  
  @JSImport("@ionic/react/dist/types/components/IonActionSheet", "IonActionSheet")
  @js.native
  val IonActionSheet: ForwardRefExoticComponent[ActionSheetOptionsReactOv] = js.native
  
  /* Inlined parent std.Omit<@ionic/core.@ionic/core.ActionSheetButton, 'icon'> */
  @js.native
  trait ActionSheetButton extends StObject {
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var handler: js.UndefOr[js.Function0[Boolean | Unit | (js.Promise[Boolean | Unit])]] = js.native
    
    var icon: js.UndefOr[Ios | String] = js.native
    
    var role: js.UndefOr[cancel | destructive | selected | String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object ActionSheetButton {
    
    @scala.inline
    def apply(): ActionSheetButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSheetButton]
    }
    
    @scala.inline
    implicit class ActionSheetButtonMutableBuilder[Self <: ActionSheetButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setHandler(value: () => Boolean | Unit | (js.Promise[Boolean | Unit])): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setIcon(value: Ios | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setRole(value: cancel | destructive | selected | String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@ionic/core.@ionic/core.ActionSheetOptions, 'buttons'> */
  @js.native
  trait ActionSheetOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var backdropDismiss: js.UndefOr[Boolean] = js.native
    
    var buttons: js.UndefOr[js.Array[ActionSheetButton | String]] = js.native
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyboardClose: js.UndefOr[Boolean] = js.native
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
    
    var subHeader: js.UndefOr[String] = js.native
    
    var translucent: js.UndefOr[Boolean] = js.native
  }
  object ActionSheetOptions {
    
    @scala.inline
    def apply(): ActionSheetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSheetOptions]
    }
    
    @scala.inline
    implicit class ActionSheetOptionsMutableBuilder[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[ActionSheetButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: (ActionSheetButton | String)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      @scala.inline
      def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setSubHeader(value: String): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
      
      @scala.inline
      def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    }
  }
}
