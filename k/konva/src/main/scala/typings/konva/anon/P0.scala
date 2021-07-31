package typings.konva.anon

import typings.konva.typesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P0 extends StObject {
  
  var p0: Vector2d
  
  var p1: Vector2d
  
  var rotation: Double
  
  var text: String
  
  var transposeX: Double
  
  var transposeY: Double
}
object P0 {
  
  @scala.inline
  def apply(p0: Vector2d, p1: Vector2d, rotation: Double, text: String, transposeX: Double, transposeY: Double): P0 = {
    val __obj = js.Dynamic.literal(p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transposeX = transposeX.asInstanceOf[js.Any], transposeY = transposeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[P0]
  }
  
  @scala.inline
  implicit class P0MutableBuilder[Self <: P0] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setP0(value: Vector2d): Self = StObject.set(x, "p0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP1(value: Vector2d): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeX(value: Double): Self = StObject.set(x, "transposeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeY(value: Double): Self = StObject.set(x, "transposeY", value.asInstanceOf[js.Any])
  }
}
