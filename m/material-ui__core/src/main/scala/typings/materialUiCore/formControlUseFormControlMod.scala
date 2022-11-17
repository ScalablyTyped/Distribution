package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlUseFormControlMod {
  
  @JSImport("@material-ui/core/FormControl/useFormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[FormControlState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[FormControlState]]
  
  object ContextFromPropsKey {
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def error: "error" = "error".asInstanceOf["error"]
    
    inline def fullWidth: "fullWidth" = "fullWidth".asInstanceOf["fullWidth"]
    
    inline def hiddenLabel: "hiddenLabel" = "hiddenLabel".asInstanceOf["hiddenLabel"]
    
    inline def margin: "margin" = "margin".asInstanceOf["margin"]
    
    inline def required: "required" = "required".asInstanceOf["required"]
    
    inline def variant: "variant" = "variant".asInstanceOf["variant"]
  }
  type ContextFromPropsKey = "disabled" | "error" | "fullWidth" | "hiddenLabel" | "margin" | "required" | "variant"
  
  /* Inlined parent std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlTypeMap<{}, 'div'>['defaultComponent'], {}>, @material-ui/core.@material-ui/core/FormControl/useFormControl.ContextFromPropsKey> */
  trait FormControlState extends StObject {
    
    var adornedStart: Boolean
    
    var disabled: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var filled: Boolean
    
    var focused: Boolean
    
    var fullWidth: js.UndefOr[Any] = js.undefined
    
    var hiddenLabel: js.UndefOr[Any] = js.undefined
    
    var margin: js.UndefOr[Any] = js.undefined
    
    def onBlur(): Unit
    
    def onEmpty(): Unit
    
    def onFilled(): Unit
    
    def onFocus(): Unit
    
    var required: js.UndefOr[Any] = js.undefined
    
    var variant: js.UndefOr[Any] = js.undefined
  }
  object FormControlState {
    
    inline def apply(
      adornedStart: Boolean,
      filled: Boolean,
      focused: Boolean,
      onBlur: () => Unit,
      onEmpty: () => Unit,
      onFilled: () => Unit,
      onFocus: () => Unit
    ): FormControlState = {
      val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onEmpty = js.Any.fromFunction0(onEmpty), onFilled = js.Any.fromFunction0(onFilled), onFocus = js.Any.fromFunction0(onFocus))
      __obj.asInstanceOf[FormControlState]
    }
    
    extension [Self <: FormControlState](x: Self) {
      
      inline def setAdornedStart(value: Boolean): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: Any): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHiddenLabel(value: Any): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      inline def setHiddenLabelUndefined: Self = StObject.set(x, "hiddenLabel", js.undefined)
      
      inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnEmpty(value: () => Unit): Self = StObject.set(x, "onEmpty", js.Any.fromFunction0(value))
      
      inline def setOnFilled(value: () => Unit): Self = StObject.set(x, "onFilled", js.Any.fromFunction0(value))
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setRequired(value: Any): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setVariant(value: Any): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
