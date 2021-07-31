package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import typings.ionicCore.pickerInterfaceMod.PickerButton
import typings.ionicCore.pickerInterfaceMod.PickerColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeInterfaceMod {
  
  trait DatetimeChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String | Null] = js.undefined
  }
  object DatetimeChangeEventDetail {
    
    @scala.inline
    def apply(): DatetimeChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatetimeChangeEventDetail]
    }
    
    @scala.inline
    implicit class DatetimeChangeEventDetailMutableBuilder[Self <: DatetimeChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ionic/core.@ionic/core.PickerOptions> */
  trait DatetimeOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var backdropDismiss: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[PickerButton]] = js.undefined
    
    var columns: js.UndefOr[js.Array[PickerColumn]] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var showBackdrop: js.UndefOr[Boolean] = js.undefined
  }
  object DatetimeOptions {
    
    @scala.inline
    def apply(): DatetimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatetimeOptions]
    }
    
    @scala.inline
    implicit class DatetimeOptionsMutableBuilder[Self <: DatetimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[PickerButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: PickerButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setColumns(value: js.Array[PickerColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: PickerColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
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
      def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    }
  }
}
