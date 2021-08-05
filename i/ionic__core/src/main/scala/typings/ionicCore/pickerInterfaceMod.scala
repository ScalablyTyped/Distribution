package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerInterfaceMod {
  
  trait PickerButton extends StObject {
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var handler: js.UndefOr[js.Function1[/* value */ js.Any, Boolean | Unit]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object PickerButton {
    
    inline def apply(): PickerButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerButton]
    }
    
    extension [Self <: PickerButton](x: Self) {
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      inline def setHandler(value: /* value */ js.Any => Boolean | Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait PickerColumn extends StObject {
    
    var align: js.UndefOr[String] = js.undefined
    
    var columnWidth: js.UndefOr[String] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var name: String
    
    var options: js.Array[PickerColumnOption]
    
    var optionsWidth: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var prefixWidth: js.UndefOr[String] = js.undefined
    
    var prevSelected: js.UndefOr[Double] = js.undefined
    
    var refresh: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var suffixWidth: js.UndefOr[String] = js.undefined
  }
  object PickerColumn {
    
    inline def apply(name: String, options: js.Array[PickerColumnOption]): PickerColumn = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerColumn]
    }
    
    extension [Self <: PickerColumn](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[PickerColumnOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: PickerColumnOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setOptionsWidth(value: String): Self = StObject.set(x, "optionsWidth", value.asInstanceOf[js.Any])
      
      inline def setOptionsWidthUndefined: Self = StObject.set(x, "optionsWidth", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrefixWidth(value: String): Self = StObject.set(x, "prefixWidth", value.asInstanceOf[js.Any])
      
      inline def setPrefixWidthUndefined: Self = StObject.set(x, "prefixWidth", js.undefined)
      
      inline def setPrevSelected(value: Double): Self = StObject.set(x, "prevSelected", value.asInstanceOf[js.Any])
      
      inline def setPrevSelectedUndefined: Self = StObject.set(x, "prevSelected", js.undefined)
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixWidth(value: String): Self = StObject.set(x, "suffixWidth", value.asInstanceOf[js.Any])
      
      inline def setSuffixWidthUndefined: Self = StObject.set(x, "suffixWidth", js.undefined)
    }
  }
  
  trait PickerColumnOption extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object PickerColumnOption {
    
    inline def apply(): PickerColumnOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerColumnOption]
    }
    
    extension [Self <: PickerColumnOption](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PickerOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var backdropDismiss: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[PickerButton]] = js.undefined
    
    var columns: js.Array[PickerColumn]
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var showBackdrop: js.UndefOr[Boolean] = js.undefined
  }
  object PickerOptions {
    
    inline def apply(columns: js.Array[PickerColumn]): PickerOptions = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerOptions]
    }
    
    extension [Self <: PickerOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      inline def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
      inline def setButtons(value: js.Array[PickerButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: PickerButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      inline def setColumns(value: js.Array[PickerColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: PickerColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      inline def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      inline def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      inline def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
    }
  }
}
