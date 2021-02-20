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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait CheckboxProps extends CommonEnhancedSwitchProps[Checkbox] {
    
    var checkedIcon: js.UndefOr[ReactElement] = js.native
    
    var iconStyle: js.UndefOr[CSSProperties] = js.native
    
    var inputStyle: js.UndefOr[CSSProperties] = js.native
    
    var labelPosition: js.UndefOr[left | right] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    var onCheck: js.UndefOr[
        js.Function2[/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean, Unit]
      ] = js.native
    
    var uncheckedIcon: js.UndefOr[ReactElement] = js.native
    
    // Normally an SvgIcon
    var valueLink: js.UndefOr[ReactLink[Boolean]] = js.native
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckedIcon(value: ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setOnCheck(value: (/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      @scala.inline
      def setUncheckedIcon(value: ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      @scala.inline
      def setValueLink(value: ReactLink[Boolean]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.Props because var conflicts: children. Inlined ref, key */ @js.native
  trait CommonEnhancedSwitchProps[T]
    extends InputHTMLAttributes[js.Object] {
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var ref: js.UndefOr[LegacyRef[T]] = js.native
  }
  object CommonEnhancedSwitchProps {
    
    @scala.inline
    def apply[T](): CommonEnhancedSwitchProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonEnhancedSwitchProps[T]]
    }
    
    @scala.inline
    implicit class CommonEnhancedSwitchPropsMutableBuilder[Self <: CommonEnhancedSwitchProps[_], T] (val x: Self with CommonEnhancedSwitchProps[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
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
  
  @js.native
  trait EnhancedSwitchProps extends CommonEnhancedSwitchProps[EnhancedSwitch] {
    
    var defaultSwitched: js.UndefOr[Boolean] = js.native
    
    var disableFocusRipple: js.UndefOr[Boolean] = js.native
    
    var disableTouchRipple: js.UndefOr[Boolean] = js.native
    
    var iconStyle: js.UndefOr[CSSProperties] = js.native
    
    var inputStyle: CSSProperties = js.native
    
    var inputType: String = js.native
    
    var labelPosition: js.UndefOr[String] = js.native
    
    // oneOf(['left', 'right'])
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    def onParentShouldUpdate(isInputChecked: Boolean): Unit = js.native
    
    var onSwitch: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
      ] = js.native
    
    var rippleColor: js.UndefOr[String] = js.native
    
    var rippleStyle: js.UndefOr[CSSProperties] = js.native
    
    var switchElement: ReactElement = js.native
    
    var switched: Boolean = js.native
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.native
    
    var trackStyle: js.UndefOr[CSSProperties] = js.native
    
    @JSName("value")
    var value_EnhancedSwitchProps: js.UndefOr[String] = js.native
  }
  object EnhancedSwitchProps {
    
    @scala.inline
    def apply(
      inputStyle: CSSProperties,
      inputType: String,
      onParentShouldUpdate: Boolean => Unit,
      switchElement: ReactElement,
      switched: Boolean
    ): EnhancedSwitchProps = {
      val __obj = js.Dynamic.literal(inputStyle = inputStyle.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], onParentShouldUpdate = js.Any.fromFunction1(onParentShouldUpdate), switchElement = switchElement.asInstanceOf[js.Any], switched = switched.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedSwitchProps]
    }
    
    @scala.inline
    implicit class EnhancedSwitchPropsMutableBuilder[Self <: EnhancedSwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSwitched(value: Boolean): Self = StObject.set(x, "defaultSwitched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSwitchedUndefined: Self = StObject.set(x, "defaultSwitched", js.undefined)
      
      @scala.inline
      def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
      
      @scala.inline
      def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPosition(value: String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setOnParentShouldUpdate(value: Boolean => Unit): Self = StObject.set(x, "onParentShouldUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwitch(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit): Self = StObject.set(x, "onSwitch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwitchUndefined: Self = StObject.set(x, "onSwitch", js.undefined)
      
      @scala.inline
      def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      @scala.inline
      def setRippleStyle(value: CSSProperties): Self = StObject.set(x, "rippleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleStyleUndefined: Self = StObject.set(x, "rippleStyle", js.undefined)
      
      @scala.inline
      def setSwitchElement(value: ReactElement): Self = StObject.set(x, "switchElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitched(value: Boolean): Self = StObject.set(x, "switched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbStyle(value: CSSProperties): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
  
  @js.native
  trait RadioButtonGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var defaultSelected: js.UndefOr[js.Any] = js.native
    
    var labelPosition: js.UndefOr[left | right] = js.native
    
    var name: String = js.native
    
    var onChange: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var valueSelected: js.UndefOr[js.Any] = js.native
  }
  object RadioButtonGroupProps {
    
    @scala.inline
    def apply(name: String): RadioButtonGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonGroupProps]
    }
    
    @scala.inline
    implicit class RadioButtonGroupPropsMutableBuilder[Self <: RadioButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelected(value: js.Any): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValueSelected(value: js.Any): Self = StObject.set(x, "valueSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSelectedUndefined: Self = StObject.set(x, "valueSelected", js.undefined)
    }
  }
  
  @js.native
  trait RadioButtonProps extends CommonEnhancedSwitchProps[RadioButton] {
    
    // <EnhancedSwitch/> is element that get the 'other' properties
    var checkedIcon: js.UndefOr[ReactElement] = js.native
    
    var iconStyle: js.UndefOr[CSSProperties] = js.native
    
    var inputStyle: js.UndefOr[CSSProperties] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    var onCheck: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.native
    
    var uncheckedIcon: js.UndefOr[ReactElement] = js.native
    
    // Normally an SvgIcon
    @JSName("value")
    var value_RadioButtonProps: js.UndefOr[js.Any] = js.native
  }
  object RadioButtonProps {
    
    @scala.inline
    def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    @scala.inline
    implicit class RadioButtonPropsMutableBuilder[Self <: RadioButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckedIcon(value: ReactElement): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setOnCheck(value: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      @scala.inline
      def setUncheckedIcon(value: ReactElement): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Toggle
    extends Component[ToggleProps, js.Object, js.Any] {
    
    def isToggled(): Boolean = js.native
    
    def setToggled(newToggledValue: Boolean): Unit = js.native
  }
  
  @js.native
  trait ToggleProps extends CommonEnhancedSwitchProps[Toggle] {
    
    // <EnhancedSwitch/> is element that get the 'other' properties
    var defaultToggled: js.UndefOr[Boolean] = js.native
    
    var elementStyle: js.UndefOr[CSSProperties] = js.native
    
    var iconStyle: js.UndefOr[CSSProperties] = js.native
    
    var inputStyle: js.UndefOr[CSSProperties] = js.native
    
    var labelPosition: js.UndefOr[left | right] = js.native
    
    var labelStyle: js.UndefOr[CSSProperties] = js.native
    
    var onToggle: js.UndefOr[
        js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
      ] = js.native
    
    var rippleStyle: js.UndefOr[CSSProperties] = js.native
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.native
    
    var thumbSwitchedStyle: js.UndefOr[CSSProperties] = js.native
    
    var toggled: js.UndefOr[Boolean] = js.native
    
    var trackStyle: js.UndefOr[CSSProperties] = js.native
    
    var trackSwitchedStyle: js.UndefOr[CSSProperties] = js.native
    
    var valueLink: js.UndefOr[ReactLink[Boolean]] = js.native
  }
  object ToggleProps {
    
    @scala.inline
    def apply(): ToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleProps]
    }
    
    @scala.inline
    implicit class TogglePropsMutableBuilder[Self <: ToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultToggled(value: Boolean): Self = StObject.set(x, "defaultToggled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultToggledUndefined: Self = StObject.set(x, "defaultToggled", js.undefined)
      
      @scala.inline
      def setElementStyle(value: CSSProperties): Self = StObject.set(x, "elementStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementStyleUndefined: Self = StObject.set(x, "elementStyle", js.undefined)
      
      @scala.inline
      def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      @scala.inline
      def setOnToggle(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setRippleStyle(value: CSSProperties): Self = StObject.set(x, "rippleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleStyleUndefined: Self = StObject.set(x, "rippleStyle", js.undefined)
      
      @scala.inline
      def setThumbStyle(value: CSSProperties): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
      
      @scala.inline
      def setThumbSwitchedStyle(value: CSSProperties): Self = StObject.set(x, "thumbSwitchedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbSwitchedStyleUndefined: Self = StObject.set(x, "thumbSwitchedStyle", js.undefined)
      
      @scala.inline
      def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setTrackSwitchedStyle(value: CSSProperties): Self = StObject.set(x, "trackSwitchedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackSwitchedStyleUndefined: Self = StObject.set(x, "trackSwitchedStyle", js.undefined)
      
      @scala.inline
      def setValueLink(value: ReactLink[Boolean]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
    }
  }
}
