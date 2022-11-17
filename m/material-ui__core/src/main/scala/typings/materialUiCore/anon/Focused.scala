package typings.materialUiCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr["primary" | "secondary"] = js.undefined
  
  /**
    * If `true`, the label should be displayed in a disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the label should be displayed in an error state.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the label should use filled classes key.
    */
  var filled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the input of this label is focused (used by `FormGroup` components).
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the label will indicate that the input is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
}
object Focused {
  
  inline def apply(): Focused = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focused]
  }
  
  extension [Self <: Focused](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: "primary" | "secondary"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
