package typings.konva.wedgeMod

import typings.konva.shapeMod.ShapeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WedgeConfig extends ShapeConfig {
  
  var angle: Double = js.native
  
  var clockwise: js.UndefOr[Boolean] = js.native
  
  var radius: Double = js.native
}
object WedgeConfig {
  
  @scala.inline
  def apply(angle: Double, radius: Double): WedgeConfig = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[WedgeConfig]
  }
  
  @scala.inline
  implicit class WedgeConfigOps[Self <: WedgeConfig] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
  }
}
