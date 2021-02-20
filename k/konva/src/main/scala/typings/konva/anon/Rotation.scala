package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotation extends StObject {
  
  var rotation: Double = js.native
  
  var scaleX: Double = js.native
  
  var scaleY: Double = js.native
  
  var skewX: Double = js.native
  
  var skewY: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Rotation {
  
  @scala.inline
  def apply(
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    x: Double,
    y: Double
  ): Rotation = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  
  @scala.inline
  implicit class RotationMutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
    
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
