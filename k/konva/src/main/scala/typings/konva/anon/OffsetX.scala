package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetX extends StObject {
  
  var offsetX: Double
  
  var offsetY: Double
  
  var rotation: Double
  
  var scaleX: Double
  
  var scaleY: Double
  
  var skewX: Double
  
  var skewY: Double
  
  var x: Double
  
  var y: Double
}
object OffsetX {
  
  @scala.inline
  def apply(
    offsetX: Double,
    offsetY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    x: Double,
    y: Double
  ): OffsetX = {
    val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetX]
  }
  
  @scala.inline
  implicit class OffsetXMutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
