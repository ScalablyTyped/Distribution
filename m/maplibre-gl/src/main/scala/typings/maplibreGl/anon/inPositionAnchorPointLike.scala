package typings.maplibreGl.anon

import typings.maplibreGl.mod.PointLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ _ in maplibre-gl.maplibre-gl.PositionAnchor ]: maplibre-gl.maplibre-gl.PointLike} */
trait inPositionAnchorPointLike extends StObject {
  
  var bottom: PointLike
  
  var `bottom-left`: PointLike
  
  var `bottom-right`: PointLike
  
  var center: PointLike
  
  var left: PointLike
  
  var right: PointLike
  
  var top: PointLike
  
  var `top-left`: PointLike
  
  var `top-right`: PointLike
}
object inPositionAnchorPointLike {
  
  inline def apply(
    bottom: PointLike,
    `bottom-left`: PointLike,
    `bottom-right`: PointLike,
    center: PointLike,
    left: PointLike,
    right: PointLike,
    top: PointLike,
    `top-left`: PointLike,
    `top-right`: PointLike
  ): inPositionAnchorPointLike = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-left")(`bottom-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-right")(`bottom-right`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-left")(`top-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-right")(`top-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[inPositionAnchorPointLike]
  }
  
  extension [Self <: inPositionAnchorPointLike](x: Self) {
    
    inline def setBottom(value: PointLike): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def `setBottom-left`(value: PointLike): Self = StObject.set(x, "bottom-left", value.asInstanceOf[js.Any])
    
    inline def `setBottom-right`(value: PointLike): Self = StObject.set(x, "bottom-right", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: PointLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: PointLike): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: PointLike): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: PointLike): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def `setTop-left`(value: PointLike): Self = StObject.set(x, "top-left", value.asInstanceOf[js.Any])
    
    inline def `setTop-right`(value: PointLike): Self = StObject.set(x, "top-right", value.asInstanceOf[js.Any])
  }
}
