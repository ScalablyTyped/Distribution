package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.checkbox
import typings.ionicCore.ionicCoreStrings.radio
import typings.ionicCore.ionicCoreStrings.textarea
import typings.ionicCore.mod.Mode
import typings.ionicCore.mod.TextFieldTypes
import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.stencilPublicRuntimeMod.JSXBase.InputHTMLAttributes
import typings.ionicCore.stencilPublicRuntimeMod.JSXBase.TextareaHTMLAttributes
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertInterfaceMod {
  
  trait AlertButton extends StObject {
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var handler: js.UndefOr[js.Function1[/* value */ js.Any, Boolean | Unit | StringDictionary[js.Any]]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object AlertButton {
    
    @scala.inline
    def apply(text: String): AlertButton = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertButton]
    }
    
    @scala.inline
    implicit class AlertButtonMutableBuilder[Self <: AlertButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setHandler(value: /* value */ js.Any => Boolean | Unit | StringDictionary[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlertInput extends StObject {
    
    var attributes: js.UndefOr[AlertInputAttributes | AlertTextareaAttributes] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handler: js.UndefOr[js.Function1[/* input */ this.type, Unit]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[String | Double] = js.undefined
    
    var min: js.UndefOr[String | Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var tabindex: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[TextFieldTypes | checkbox | radio | textarea] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object AlertInput {
    
    @scala.inline
    def apply(): AlertInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertInput]
    }
    
    @scala.inline
    implicit class AlertInputMutableBuilder[Self <: AlertInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AlertInputAttributes | AlertTextareaAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandler(value: AlertInput => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setType(value: TextFieldTypes | checkbox | radio | textarea): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type AlertInputAttributes = InputHTMLAttributes[HTMLInputElement]
  
  trait AlertOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var backdropDismiss: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[AlertButton | String]] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputs: js.UndefOr[js.Array[AlertInput]] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var message: js.UndefOr[String | IonicSafeString] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var subHeader: js.UndefOr[String] = js.undefined
    
    var translucent: js.UndefOr[Boolean] = js.undefined
  }
  object AlertOptions {
    
    @scala.inline
    def apply(): AlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertOptions]
    }
    
    @scala.inline
    implicit class AlertOptionsMutableBuilder[Self <: AlertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[AlertButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: (AlertButton | String)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
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
      def setInputs(value: js.Array[AlertInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setInputsVarargs(value: AlertInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      @scala.inline
      def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      @scala.inline
      def setMessage(value: String | IonicSafeString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
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
  
  type AlertTextareaAttributes = TextareaHTMLAttributes[HTMLTextAreaElement]
}
