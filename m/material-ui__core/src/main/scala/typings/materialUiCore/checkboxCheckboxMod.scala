package typings.materialUiCore

import typings.materialUiCore.anon.Style
import typings.materialUiCore.materialUiCoreStrings.default
import typings.materialUiCore.materialUiCoreStrings.medium
import typings.materialUiCore.materialUiCoreStrings.primary
import typings.materialUiCore.materialUiCoreStrings.secondary
import typings.materialUiCore.materialUiCoreStrings.small
import typings.materialUiCore.switchBaseMod.SwitchBaseProps
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.react.mod.ChangeEvent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxMod {
  
  @JSImport("@material-ui/core/Checkbox/Checkbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.indeterminate
    - typings.materialUiCore.materialUiCoreStrings.colorPrimary
    - typings.materialUiCore.materialUiCoreStrings.colorSecondary
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.checked
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.input
  */
  trait CheckboxClassKey extends StObject
  object CheckboxClassKey {
    
    inline def checked: typings.materialUiCore.materialUiCoreStrings.checked = "checked".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.checked]
    
    inline def colorPrimary: typings.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typings.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def indeterminate: typings.materialUiCore.materialUiCoreStrings.indeterminate = "indeterminate".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.indeterminate]
    
    inline def input: typings.materialUiCore.materialUiCoreStrings.input = "input".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.input]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps extends any ? std.Pick<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, std.Exclude<keyof @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, 'classes' | 'checkedIcon' | 'color' | 'icon' | 'type'>> : never */ trait CheckboxProps
    extends StObject
       with StyledComponentProps[CheckboxClassKey]
       with Style[SwitchBaseProps] {
    
    /**
      * If `true`, the component is checked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to display when the component is checked.
      */
    var checkedIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The color of the component. It supports those theme colors that make sense for this component.
      */
    var color: js.UndefOr[primary | secondary | default] = js.undefined
    
    /**
      * If `true`, the ripple effect will be disabled.
      */
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the checkbox will be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to display when the component is unchecked.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The id of the `input` element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the component appears indeterminate.
      * This does not set the native input element to indeterminate due
      * to inconsistent behavior across browsers.
      * However, we set a `data-indeterminate` attribute on the input.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to display when the component is indeterminate.
      */
    var indeterminateIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
      */
    var inputProps: js.UndefOr[InputHTMLAttributes[HTMLInputElement]] = js.undefined
    
    /**
      * Pass a ref to the `input` element.
      */
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    /**
      * Callback fired when the state is changed.
      *
      * @param {object} event The event source of the callback.
      * You can pull out the new checked state by accessing `event.target.checked` (boolean).
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* checked */ Boolean, Unit]
      ] = js.undefined
    
    /**
      * If `true`, the `input` element will be required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The size of the checkbox.
      * `small` is equivalent to the dense checkbox styling.
      */
    var size: js.UndefOr[small | medium] = js.undefined
    
    /**
      * The value of the component. The DOM API casts this to a string.
      * The browser uses "on" as the default value.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedIcon(value: ReactNode): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setColor(value: primary | secondary | default): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateIcon(value: ReactNode): Self = StObject.set(x, "indeterminateIcon", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateIconUndefined: Self = StObject.set(x, "indeterminateIcon", js.undefined)
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setInputProps(value: InputHTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* checked */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
