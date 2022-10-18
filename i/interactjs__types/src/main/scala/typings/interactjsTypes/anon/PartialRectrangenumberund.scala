package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.snappersGridMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/core/types.Rect> & {  range :number | undefined,   limits :@interactjs/types.@interactjs/core/types.Rect | undefined,   offset :@interactjs/types.@interactjs/core/types.Point | undefined} */
trait PartialRectrangenumberund
  extends StObject
     with GridOptions {
  
  var bottom: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var limits: js.UndefOr[typings.interactjsTypes.coreTypesMod.Rect] = js.undefined
  
  var offset: js.UndefOr[Point] = js.undefined
  
  var range: js.UndefOr[Double] = js.undefined
  
  var right: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialRectrangenumberund {
  
  inline def apply(): PartialRectrangenumberund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRectrangenumberund]
  }
  
  extension [Self <: PartialRectrangenumberund](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLimits(value: typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
