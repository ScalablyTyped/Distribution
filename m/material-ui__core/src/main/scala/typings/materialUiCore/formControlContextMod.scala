package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.materialUiCore.mod.PropTypes.Margin
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlContextMod extends Shortcut {
  
  @JSImport("@material-ui/core/FormControl/FormControlContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[FormControlContextProps | Null]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.error
    - typings.materialUiCore.materialUiCoreStrings.margin
    - typings.materialUiCore.materialUiCoreStrings.required
    - typings.materialUiCore.materialUiCoreStrings.variant
  */
  trait ContextFromPropsKey extends StObject
  object ContextFromPropsKey {
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typings.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.error]
    
    inline def margin: typings.materialUiCore.materialUiCoreStrings.margin = "margin".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.margin]
    
    inline def required: typings.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.required]
    
    inline def variant: typings.materialUiCore.materialUiCoreStrings.variant = "variant".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.variant]
  }
  
  /* Inlined parent std.Pick<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps, @material-ui/core.@material-ui/core/FormControl/FormControlContext.ContextFromPropsKey> */
  trait FormControlContextProps extends StObject {
    
    var adornedStart: Boolean
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var filled: Boolean
    
    var focused: Boolean
    
    var margin: js.UndefOr[Margin] = js.undefined
    
    def onBlur(): Unit
    
    def onEmpty(): Unit
    
    def onFilled(): Unit
    
    def onFocus(): Unit
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object FormControlContextProps {
    
    inline def apply(
      adornedStart: Boolean,
      filled: Boolean,
      focused: Boolean,
      onBlur: () => Unit,
      onEmpty: () => Unit,
      onFilled: () => Unit,
      onFocus: () => Unit
    ): FormControlContextProps = {
      val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onEmpty = js.Any.fromFunction0(onEmpty), onFilled = js.Any.fromFunction0(onFilled), onFocus = js.Any.fromFunction0(onFocus))
      __obj.asInstanceOf[FormControlContextProps]
    }
    
    extension [Self <: FormControlContextProps](x: Self) {
      
      inline def setAdornedStart(value: Boolean): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnEmpty(value: () => Unit): Self = StObject.set(x, "onEmpty", js.Any.fromFunction0(value))
      
      inline def setOnFilled(value: () => Unit): Self = StObject.set(x, "onFilled", js.Any.fromFunction0(value))
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[FormControlContextProps | Null]]
  
  /* This means you don't have to write `default`, but can instead just say `formControlContextMod.foo` */
  override def _to: Context[js.UndefOr[FormControlContextProps | Null]] = default
}
