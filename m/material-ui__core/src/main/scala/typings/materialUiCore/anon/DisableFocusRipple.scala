package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.contained
import typings.materialUiCore.materialUiCoreStrings.horizontal
import typings.materialUiCore.materialUiCoreStrings.large
import typings.materialUiCore.materialUiCoreStrings.medium
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.small
import typings.materialUiCore.materialUiCoreStrings.text
import typings.materialUiCore.materialUiCoreStrings.vertical
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFocusRipple extends StObject {
  
  /**
    * The content of the button group.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr[typings.materialUiCore.mod.PropTypes.Color] = js.undefined
  
  /**
    * If `true`, no elevation is used.
    */
  var disableElevation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the button keyboard focus ripple will be disabled.
    */
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the button ripple effect will be disabled.
    */
  var disableRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the buttons will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the buttons will take up the full width of its container.
    */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group orientation (layout flow direction).
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  /**
    * The size of the button.
    * `small` is equivalent to the dense button styling.
    */
  var size: js.UndefOr[small | medium | large] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr[text | outlined | contained] = js.undefined
}
object DisableFocusRipple {
  
  inline def apply(): DisableFocusRipple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFocusRipple]
  }
  
  extension [Self <: DisableFocusRipple](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: typings.materialUiCore.mod.PropTypes.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableElevation(value: Boolean): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
    
    inline def setDisableElevationUndefined: Self = StObject.set(x, "disableElevation", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: text | outlined | contained): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
