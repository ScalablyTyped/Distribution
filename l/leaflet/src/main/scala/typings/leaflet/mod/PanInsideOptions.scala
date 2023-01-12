package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanInsideOptions
  extends StObject
     with PanOptions {
  
  var padding: js.UndefOr[PointExpression] = js.undefined
  
  var paddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  
  var paddingTopLeft: js.UndefOr[PointExpression] = js.undefined
}
object PanInsideOptions {
  
  inline def apply(): PanInsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanInsideOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanInsideOptions] (val x: Self) extends AnyVal {
    
    inline def setPadding(value: PointExpression): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomRight(value: PointExpression): Self = StObject.set(x, "paddingBottomRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomRightUndefined: Self = StObject.set(x, "paddingBottomRight", js.undefined)
    
    inline def setPaddingTopLeft(value: PointExpression): Self = StObject.set(x, "paddingTopLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopLeftUndefined: Self = StObject.set(x, "paddingTopLeft", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
