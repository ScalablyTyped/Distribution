package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerInterfaceMod {
  
  @js.native
  trait PickerButton extends StObject {
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var handler: js.UndefOr[js.Function1[/* value */ js.Any, Boolean | Unit]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object PickerButton {
    
    @scala.inline
    def apply(): PickerButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerButton]
    }
    
    @scala.inline
    implicit class PickerButtonMutableBuilder[Self <: PickerButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setHandler(value: /* value */ js.Any => Boolean | Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait PickerColumn extends StObject {
    
    var align: js.UndefOr[String] = js.native
    
    var columnWidth: js.UndefOr[String] = js.native
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var name: String = js.native
    
    var options: js.Array[PickerColumnOption] = js.native
    
    var optionsWidth: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var prefixWidth: js.UndefOr[String] = js.native
    
    var prevSelected: js.UndefOr[Double] = js.native
    
    var refresh: js.UndefOr[js.Function0[Unit]] = js.native
    
    var selectedIndex: js.UndefOr[Double] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var suffixWidth: js.UndefOr[String] = js.native
  }
  object PickerColumn {
    
    @scala.inline
    def apply(name: String, options: js.Array[PickerColumnOption]): PickerColumn = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerColumn]
    }
    
    @scala.inline
    implicit class PickerColumnMutableBuilder[Self <: PickerColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[PickerColumnOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: PickerColumnOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setOptionsWidth(value: String): Self = StObject.set(x, "optionsWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsWidthUndefined: Self = StObject.set(x, "optionsWidth", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPrefixWidth(value: String): Self = StObject.set(x, "prefixWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixWidthUndefined: Self = StObject.set(x, "prefixWidth", js.undefined)
      
      @scala.inline
      def setPrevSelected(value: Double): Self = StObject.set(x, "prevSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevSelectedUndefined: Self = StObject.set(x, "prevSelected", js.undefined)
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSuffixWidth(value: String): Self = StObject.set(x, "suffixWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixWidthUndefined: Self = StObject.set(x, "suffixWidth", js.undefined)
    }
  }
  
  @js.native
  trait PickerColumnOption extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object PickerColumnOption {
    
    @scala.inline
    def apply(): PickerColumnOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerColumnOption]
    }
    
    @scala.inline
    implicit class PickerColumnOptionMutableBuilder[Self <: PickerColumnOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait PickerOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var backdropDismiss: js.UndefOr[Boolean] = js.native
    
    var buttons: js.UndefOr[js.Array[PickerButton]] = js.native
    
    var columns: js.Array[PickerColumn] = js.native
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyboardClose: js.UndefOr[Boolean] = js.native
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
    
    var showBackdrop: js.UndefOr[Boolean] = js.native
  }
  object PickerOptions {
    
    @scala.inline
    def apply(columns: js.Array[PickerColumn]): PickerOptions = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerOptions]
    }
    
    @scala.inline
    implicit class PickerOptionsMutableBuilder[Self <: PickerOptions] (val x: Self) extends AnyVal {
      
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
