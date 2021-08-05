package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switches {
  
  @js.native
  trait Checkbox
    extends Component[CheckboxProps, js.Object, js.Any] {
    
    /** @deprecated Use checked property instead */
    def isChecked(): Unit = js.native
    
    /** @deprecated Use checked property instead */
    def setChecked(newCheckedValue: Boolean): Unit = js.native
  }
  
  trait CheckboxProps
    extends StObject
       with CommonEnhancedSwitchProps[Checkbox] {
    
    var checkedIcon: js.UndefOr[ReactElement] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelPosition: js.UndefOr[left | right] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onCheck: js.UndefOr[
        js.Function2[/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean, Unit]
      ] = js.undefined
    
    var uncheckedIcon: js.UndefOr[ReactElement] = js.undefined
    
    // Normally an SvgIcon
    var valueLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setCheckedIcon(value: ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnCheck(value: (/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setUncheckedIcon(value: ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      inline def setValueLink(value: ReactLink[Boolean]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      inline def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.Props because var conflicts: children. Inlined ref, key */ trait CommonEnhancedSwitchProps[T]
    extends StObject
       with InputHTMLAttributes[js.Object] {
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[T]] = js.undefined
  }
  object CommonEnhancedSwitchProps {
    
    inline def apply[T](): CommonEnhancedSwitchProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonEnhancedSwitchProps[T]]
    }
    
    extension [Self <: CommonEnhancedSwitchProps[?], T](x: Self & CommonEnhancedSwitchProps[T]) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait EnhancedSwitch
    extends Component[EnhancedSwitchProps, js.Object, js.Any] {
    
    def getValue(): String = js.native
    
    def isKeyboardFocused(): Boolean = js.native
    
    def isSwitched(): Boolean = js.native
    
    def setSwitched(newSwitchedValue: Boolean): Unit = js.native
  }
  
  trait EnhancedSwitchProps
    extends StObject
       with CommonEnhancedSwitchProps[EnhancedSwitch] {
    
    var defaultSwitched: js.UndefOr[Boolean] = js.undefined
    
    var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
    
    var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: CSSProperties
    
    var inputType: String
    
    var labelPosition: js.UndefOr[String] = js.undefined
    
    // oneOf(['left', 'right'])
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    def onParentShouldUpdate(isInputChecked: Boolean): Unit
    
    var onSwitch: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
      ] = js.undefined
    
    var rippleColor: js.UndefOr[String] = js.undefined
    
    var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var switchElement: ReactElement
    
    var switched: Boolean
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    @JSName("value")
    var value_EnhancedSwitchProps: js.UndefOr[String] = js.undefined
  }
  object EnhancedSwitchProps {
    
    inline def apply(
      inputStyle: CSSProperties,
      inputType: String,
      onParentShouldUpdate: Boolean => Unit,
      switchElement: ReactElement,
      switched: Boolean
    ): EnhancedSwitchProps = {
      val __obj = js.Dynamic.literal(inputStyle = inputStyle.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], onParentShouldUpdate = js.Any.fromFunction1(onParentShouldUpdate), switchElement = switchElement.asInstanceOf[js.Any], switched = switched.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedSwitchProps]
    }
    
    extension [Self <: EnhancedSwitchProps](x: Self) {
      
      inline def setDefaultSwitched(value: Boolean): Self = StObject.set(x, "defaultSwitched", value.asInstanceOf[js.Any])
      
      inline def setDefaultSwitchedUndefined: Self = StObject.set(x, "defaultSwitched", js.undefined)
      
      inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
      
      inline def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnParentShouldUpdate(value: Boolean => Unit): Self = StObject.set(x, "onParentShouldUpdate", js.Any.fromFunction1(value))
      
      inline def setOnSwitch(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit): Self = StObject.set(x, "onSwitch", js.Any.fromFunction2(value))
      
      inline def setOnSwitchUndefined: Self = StObject.set(x, "onSwitch", js.undefined)
      
      inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleStyle(value: CSSProperties): Self = StObject.set(x, "rippleStyle", value.asInstanceOf[js.Any])
      
      inline def setRippleStyleUndefined: Self = StObject.set(x, "rippleStyle", js.undefined)
      
      inline def setSwitchElement(value: ReactElement): Self = StObject.set(x, "switchElement", value.asInstanceOf[js.Any])
      
      inline def setSwitched(value: Boolean): Self = StObject.set(x, "switched", value.asInstanceOf[js.Any])
      
      inline def setThumbStyle(value: CSSProperties): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
      
      inline def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait RadioButton
    extends Component[RadioButtonProps, js.Object, js.Any] {
    
    def getValue(): String = js.native
    
    def isChecked(): Boolean = js.native
  }
  
  @js.native
  trait RadioButtonGroup
    extends Component[RadioButtonGroupProps, js.Object, js.Any] {
    
    def clearValue(): Unit = js.native
    
    def getSelectedValue(): String = js.native
    
    def setSelectedValue(newSelectionValue: String): Unit = js.native
  }
  
  trait RadioButtonGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSelected: js.UndefOr[js.Any] = js.undefined
    
    var labelPosition: js.UndefOr[left | right] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var valueSelected: js.UndefOr[js.Any] = js.undefined
  }
  object RadioButtonGroupProps {
    
    inline def apply(name: String): RadioButtonGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonGroupProps]
    }
    
    extension [Self <: RadioButtonGroupProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSelected(value: js.Any): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      inline def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValueSelected(value: js.Any): Self = StObject.set(x, "valueSelected", value.asInstanceOf[js.Any])
      
      inline def setValueSelectedUndefined: Self = StObject.set(x, "valueSelected", js.undefined)
    }
  }
  
  trait RadioButtonProps
    extends StObject
       with CommonEnhancedSwitchProps[RadioButton] {
    
    // <EnhancedSwitch/> is element that get the 'other' properties
    var checkedIcon: js.UndefOr[ReactElement] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onCheck: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.undefined
    
    var uncheckedIcon: js.UndefOr[ReactElement] = js.undefined
    
    // Normally an SvgIcon
    @JSName("value")
    var value_RadioButtonProps: js.UndefOr[js.Any] = js.undefined
  }
  object RadioButtonProps {
    
    inline def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    extension [Self <: RadioButtonProps](x: Self) {
      
      inline def setCheckedIcon(value: ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnCheck(value: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setUncheckedIcon(value: ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Toggle
    extends Component[ToggleProps, js.Object, js.Any] {
    
    def isToggled(): Boolean = js.native
    
    def setToggled(newToggledValue: Boolean): Unit = js.native
  }
  
  trait ToggleProps
    extends StObject
       with CommonEnhancedSwitchProps[Toggle] {
    
    // <EnhancedSwitch/> is element that get the 'other' properties
    var defaultToggled: js.UndefOr[Boolean] = js.undefined
    
    var elementStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelPosition: js.UndefOr[left | right] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onToggle: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
      ] = js.undefined
    
    var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var thumbSwitchedStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var toggled: js.UndefOr[Boolean] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var trackSwitchedStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var valueLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
  }
  object ToggleProps {
    
    inline def apply(): ToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleProps]
    }
    
    extension [Self <: ToggleProps](x: Self) {
      
      inline def setDefaultToggled(value: Boolean): Self = StObject.set(x, "defaultToggled", value.asInstanceOf[js.Any])
      
      inline def setDefaultToggledUndefined: Self = StObject.set(x, "defaultToggled", js.undefined)
      
      inline def setElementStyle(value: CSSProperties): Self = StObject.set(x, "elementStyle", value.asInstanceOf[js.Any])
      
      inline def setElementStyleUndefined: Self = StObject.set(x, "elementStyle", js.undefined)
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnToggle(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setRippleStyle(value: CSSProperties): Self = StObject.set(x, "rippleStyle", value.asInstanceOf[js.Any])
      
      inline def setRippleStyleUndefined: Self = StObject.set(x, "rippleStyle", js.undefined)
      
      inline def setThumbStyle(value: CSSProperties): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
      
      inline def setThumbSwitchedStyle(value: CSSProperties): Self = StObject.set(x, "thumbSwitchedStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbSwitchedStyleUndefined: Self = StObject.set(x, "thumbSwitchedStyle", js.undefined)
      
      inline def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
      
      inline def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
      
      inline def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setTrackSwitchedStyle(value: CSSProperties): Self = StObject.set(x, "trackSwitchedStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackSwitchedStyleUndefined: Self = StObject.set(x, "trackSwitchedStyle", js.undefined)
      
      inline def setValueLink(value: ReactLink[Boolean]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      inline def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
    }
  }
}
