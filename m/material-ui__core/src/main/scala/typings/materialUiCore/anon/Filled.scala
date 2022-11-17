package typings.materialUiCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filled extends StObject {
  
  /**
    * The content of the component.
    *
    * If `' '` is provided, the component reserves one line height for displaying a future message.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * If `true`, the helper text should be displayed in a disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, helper text should be displayed in an error state.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the helper text should use filled classes key.
    */
  var filled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the helper text should use focused classes key.
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `dense`, will adjust vertical spacing. This is normally obtained via context from
    * FormControl.
    */
  var margin: js.UndefOr["dense"] = js.undefined
  
  /**
    * If `true`, the helper text should use required classes key.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr["standard" | "outlined" | "filled"] = js.undefined
}
object Filled {
  
  inline def apply(): Filled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filled]
  }
  
  extension [Self <: Filled](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setMargin(value: "dense"): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setVariant(value: "standard" | "outlined" | "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
