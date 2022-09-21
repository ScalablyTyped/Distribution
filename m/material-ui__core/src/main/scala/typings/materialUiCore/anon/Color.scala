package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreBooleans.`false`
import typings.materialUiCore.materialUiCoreStrings.end
import typings.materialUiCore.materialUiCoreStrings.medium
import typings.materialUiCore.materialUiCoreStrings.small
import typings.materialUiCore.materialUiCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: js.UndefOr[typings.materialUiCore.mod.PropTypes.Color] = js.undefined
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If given, uses a negative margin to counteract the padding on one
    * side (this is often helpful for aligning the left or right
    * side of the icon with content above or below, without ruining the border
    * size and shape).
    */
  var edge: js.UndefOr[start | end | `false`] = js.undefined
  
  var size: js.UndefOr[small | medium] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: typings.materialUiCore.mod.PropTypes.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setEdge(value: start | end | `false`): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
