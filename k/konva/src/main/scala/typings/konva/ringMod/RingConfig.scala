package typings.konva.ringMod

import typings.konva.shapeMod.ShapeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RingConfig extends ShapeConfig {
  
  var clockwise: js.UndefOr[Boolean] = js.native
  
  var innerRadius: Double = js.native
  
  var outerRadius: Double = js.native
}
object RingConfig {
  
  @scala.inline
  def apply(innerRadius: Double, outerRadius: Double): RingConfig = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[RingConfig]
  }
  
  @scala.inline
  implicit class RingConfigOps[Self <: RingConfig] (val x: Self) extends AnyVal {
    
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
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadius(value: Double): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
  }
}
