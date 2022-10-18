package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.snappersGridMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/core/types.Point & {  range :number | undefined,   limits :@interactjs/types.@interactjs/core/types.Rect | undefined,   offset :@interactjs/types.@interactjs/core/types.Point | undefined} */
trait Pointrangenumberundefined
  extends StObject
     with GridOptions {
  
  var limits: js.UndefOr[typings.interactjsTypes.coreTypesMod.Rect] = js.undefined
  
  var offset: js.UndefOr[Point] = js.undefined
  
  var range: js.UndefOr[Double] = js.undefined
  
  var x: Double
  
  var y: Double
}
object Pointrangenumberundefined {
  
  inline def apply(x: Double, y: Double): Pointrangenumberundefined = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointrangenumberundefined]
  }
  
  extension [Self <: Pointrangenumberundefined](x: Self) {
    
    inline def setLimits(value: typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
