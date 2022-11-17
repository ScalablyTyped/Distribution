package typings.materialUiCore

import typings.materialUiCore.anon.PartialFilledInputProps
import typings.materialUiCore.anon.PartialInputProps
import typings.materialUiCore.anon.PartialOutlinedInputProps
import typings.materialUiCore.anon.PartialSelectPropsAbout
import typings.materialUiCore.anon.Ref
import typings.materialUiCore.formControlFormControlMod.FormControlProps
import typings.materialUiCore.formHelperTextFormHelperTextMod.FormHelperTextProps
import typings.materialUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typings.materialUiCore.inputLabelInputLabelMod.InputLabelProps
import typings.materialUiCore.mod.PropTypes.Margin
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.HTMLInputTypeAttribute
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldTextFieldMod {
  
  @JSImport("@material-ui/core/TextField/TextField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TextFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps<'div', {}> extends any ? std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps<'div', {}>, std.Exclude<keyof @material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps<'div', {}>, 'classes' | 'onChange' | 'onBlur' | 'onFocus' | 'defaultValue'>> : never */ trait BaseTextFieldProps
    extends StObject
       with StyledComponentProps[TextFieldClassKey]
       with Ref[FormControlProps["div", js.Object]] {
    
    /**
      * Props applied to the [`FormHelperText`](/api/form-helper-text/) element.
      */
    var FormHelperTextProps: js.UndefOr[
        Partial[
          typings.materialUiCore.formHelperTextFormHelperTextMod.FormHelperTextProps["p", js.Object]
        ]
      ] = js.undefined
    
    /**
      * Props applied to the [`InputLabel`](/api/input-label/) element.
      */
    var InputLabelProps: js.UndefOr[Partial[typings.materialUiCore.inputLabelInputLabelMod.InputLabelProps]] = js.undefined
    
    /**
      * Props applied to the [`Select`](/api/select/) element.
      */
    var SelectProps: js.UndefOr[PartialSelectPropsAbout] = js.undefined
    
    /**
      * This prop helps users to fill forms faster, especially on mobile devices.
      * The name can be confusing, as it's more like an autofill.
      * You can learn more about it [following the specification](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill).
      */
    var autoComplete: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the `input` element will be focused during the first mount.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The color of the component. It supports those theme colors that make sense for this component.
      */
    var color: js.UndefOr["primary" | "secondary"] = js.undefined
    
    /**
      * The default value of the `input` element.
      */
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    /**
      * If `true`, the `input` element will be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label will be displayed in an error state.
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the input will take up the full width of its container.
      */
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The helper text content.
      */
    var helperText: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The id of the `input` element.
      * Use this prop to make `label` and `helperText` accessible for screen readers.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Pass a ref to the `input` element.
      */
    var inputRef: js.UndefOr[typings.react.mod.Ref[Any]] = js.undefined
    
    /**
      * The label content.
      */
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If `dense` or `normal`, will adjust vertical spacing of this and contained components.
      */
    var margin: js.UndefOr[Margin] = js.undefined
    
    /**
      * Maximum number of rows to display when multiline option is set to true.
      */
    var maxRows: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Minimum number of rows to display.
      */
    var minRows: js.UndefOr[String | Double] = js.undefined
    
    /**
      * If `true`, a textarea element will be rendered instead of an input.
      */
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name attribute of the `input` element.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The short hint displayed in the input before the user enters a value.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the label is displayed as required and the `input` element` will be required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of rows to display when multiline option is set to true.
      * @deprecated Use `minRows` instead.
      */
    var rows: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Maximum number of rows to display.
      * @deprecated Use `maxRows` instead.
      */
    var rowsMax: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Render a [`Select`](/api/select/) element while passing the Input element to `Select` as `input` parameter.
      * If this option is set you must pass the options of the select as children.
      */
    var select: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The size of the text field.
      */
    var size: js.UndefOr["small" | "medium"] = js.undefined
    
    /**
      * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
      */
    var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.undefined
    
    /**
      * The value of the `input` element, required for a controlled component.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object BaseTextFieldProps {
    
    inline def apply(): BaseTextFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTextFieldProps]
    }
    
    extension [Self <: BaseTextFieldProps](x: Self) {
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: "primary" | "secondary"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFormHelperTextProps(value: Partial[FormHelperTextProps["p", js.Object]]): Self = StObject.set(x, "FormHelperTextProps", value.asInstanceOf[js.Any])
      
      inline def setFormHelperTextPropsUndefined: Self = StObject.set(x, "FormHelperTextProps", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHelperText(value: ReactNode): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputLabelProps(value: Partial[InputLabelProps]): Self = StObject.set(x, "InputLabelProps", value.asInstanceOf[js.Any])
      
      inline def setInputLabelPropsUndefined: Self = StObject.set(x, "InputLabelProps", js.undefined)
      
      inline def setInputRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMaxRows(value: String | Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setMinRows(value: String | Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRows(value: String | Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsMax(value: String | Double): Self = StObject.set(x, "rowsMax", value.asInstanceOf[js.Any])
      
      inline def setRowsMaxUndefined: Self = StObject.set(x, "rowsMax", js.undefined)
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectProps(value: PartialSelectPropsAbout): Self = StObject.set(x, "SelectProps", value.asInstanceOf[js.Any])
      
      inline def setSelectPropsUndefined: Self = StObject.set(x, "SelectProps", js.undefined)
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSize(value: "small" | "medium"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: HTMLInputTypeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FilledTextFieldProps
    extends StObject
       with BaseTextFieldProps {
    
    /**
      * Props applied to the Input element.
      * It will be a [`FilledInput`](/api/filled-input/),
      * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
      * component depending on the `variant` prop value.
      */
    var InputProps: js.UndefOr[PartialFilledInputProps] = js.undefined
    
    /**
      * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
      */
    var inputProps: js.UndefOr[InputBaseComponentProps] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    /**
      * Callback fired when the value is changed.
      *
      * @param {object} event The event source of the callback.
      * You can pull out the new value by accessing `event.target.value` (string).
      */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    /**
      * The variant to use.
      */
    var variant: "filled"
  }
  object FilledTextFieldProps {
    
    inline def apply(): FilledTextFieldProps = {
      val __obj = js.Dynamic.literal(variant = "filled")
      __obj.asInstanceOf[FilledTextFieldProps]
    }
    
    extension [Self <: FilledTextFieldProps](x: Self) {
      
      inline def setInputProps(value: PartialFilledInputProps): Self = StObject.set(x, "InputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "InputProps", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLTextAreaElement | HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setVariant(value: "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutlinedTextFieldProps
    extends StObject
       with BaseTextFieldProps {
    
    /**
      * Props applied to the Input element.
      * It will be a [`FilledInput`](/api/filled-input/),
      * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
      * component depending on the `variant` prop value.
      */
    var InputProps: js.UndefOr[PartialOutlinedInputProps] = js.undefined
    
    /**
      * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
      */
    var inputProps: js.UndefOr[InputBaseComponentProps] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    /**
      * Callback fired when the value is changed.
      *
      * @param {object} event The event source of the callback.
      * You can pull out the new value by accessing `event.target.value` (string).
      */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    /**
      * The variant to use.
      */
    var variant: "outlined"
  }
  object OutlinedTextFieldProps {
    
    inline def apply(): OutlinedTextFieldProps = {
      val __obj = js.Dynamic.literal(variant = "outlined")
      __obj.asInstanceOf[OutlinedTextFieldProps]
    }
    
    extension [Self <: OutlinedTextFieldProps](x: Self) {
      
      inline def setInputProps(value: PartialOutlinedInputProps): Self = StObject.set(x, "InputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "InputProps", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLTextAreaElement | HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setVariant(value: "outlined"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  trait StandardTextFieldProps
    extends StObject
       with BaseTextFieldProps {
    
    /**
      * Props applied to the Input element.
      * It will be a [`FilledInput`](/api/filled-input/),
      * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
      * component depending on the `variant` prop value.
      */
    var InputProps: js.UndefOr[PartialInputProps] = js.undefined
    
    /**
      * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
      */
    var inputProps: js.UndefOr[InputBaseComponentProps] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    /**
      * Callback fired when the value is changed.
      *
      * @param {object} event The event source of the callback.
      * You can pull out the new value by accessing `event.target.value` (string).
      */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    /**
      * The variant to use.
      */
    var variant: js.UndefOr["standard"] = js.undefined
  }
  object StandardTextFieldProps {
    
    inline def apply(): StandardTextFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardTextFieldProps]
    }
    
    extension [Self <: StandardTextFieldProps](x: Self) {
      
      inline def setInputProps(value: PartialInputProps): Self = StObject.set(x, "InputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "InputProps", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, typings.std.Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLTextAreaElement | HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement | HTMLTextAreaElement, typings.std.Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setVariant(value: "standard"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type TextFieldClassKey = "root"
  
  type TextFieldProps = StandardTextFieldProps | FilledTextFieldProps | OutlinedTextFieldProps
}
