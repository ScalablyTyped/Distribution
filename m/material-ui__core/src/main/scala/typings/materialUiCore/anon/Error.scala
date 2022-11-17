package typings.materialUiCore.anon

import typings.materialUiCore.mod.PropTypes.Margin
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  /**
    * The contents of the form control.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr["primary" | "secondary"] = js.undefined
  
  /**
    * If `true`, the label, input and helper text should be displayed in a disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the label should be displayed in an error state.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component will be displayed in focused state.
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component will take up the full width of its container.
    */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the label will be hidden.
    * This is used to increase density for a `FilledInput`.
    * Be sure to add `aria-label` to the `input` element.
    */
  var hiddenLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `dense` or `normal`, will adjust vertical spacing of this and contained components.
    */
  var margin: js.UndefOr[Margin] = js.undefined
  
  /**
    * If `true`, the label will indicate that the input is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the text field.
    */
  var size: js.UndefOr["small" | "medium"] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr["standard" | "outlined" | "filled"] = js.undefined
}
object Error {
  
  inline def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: "primary" | "secondary"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setHiddenLabel(value: Boolean): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
    
    inline def setHiddenLabelUndefined: Self = StObject.set(x, "hiddenLabel", js.undefined)
    
    inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: "small" | "medium"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: "standard" | "outlined" | "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
