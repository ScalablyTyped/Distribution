package typings.konva.anon

import typings.konva.typesMod.Vector2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P0 extends js.Object {
  
  var p0: Vector2d = js.native
  
  var p1: Vector2d = js.native
  
  var rotation: Double = js.native
  
  var text: String = js.native
  
  var transposeX: Double = js.native
  
  var transposeY: Double = js.native
}
object P0 {
  
  @scala.inline
  def apply(p0: Vector2d, p1: Vector2d, rotation: Double, text: String, transposeX: Double, transposeY: Double): P0 = {
    val __obj = js.Dynamic.literal(p0 = p0.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transposeX = transposeX.asInstanceOf[js.Any], transposeY = transposeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[P0]
  }
  
  @scala.inline
  implicit class P0Ops[Self <: P0] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setP0(value: Vector2d): Self = this.set("p0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP1(value: Vector2d): Self = this.set("p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeX(value: Double): Self = this.set("transposeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeY(value: Double): Self = this.set("transposeY", value.asInstanceOf[js.Any])
  }
}
