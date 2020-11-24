package typings.konva.arcMod

import typings.konva.shapeMod.ShapeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcConfig extends ShapeConfig {
  
  var angle: Double = js.native
  
  var clockwise: js.UndefOr[Boolean] = js.native
  
  var innerRadius: Double = js.native
  
  var outerRadius: Double = js.native
}
object ArcConfig {
  
  @scala.inline
  def apply(angle: Double, innerRadius: Double, outerRadius: Double): ArcConfig = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcConfig]
  }
  
  @scala.inline
  implicit class ArcConfigOps[Self <: ArcConfig] (val x: Self) extends AnyVal {
    
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
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadius(value: Double): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
  }
}
