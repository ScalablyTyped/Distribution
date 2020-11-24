package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var innerRadius: Double = js.native
  
  var numPoints: Double = js.native
  
  var outerRadius: Double = js.native
}
object StarConfig {
  
  @scala.inline
  def apply(innerRadius: Double, numPoints: Double, outerRadius: Double): StarConfig = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], numPoints = numPoints.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarConfig]
  }
  
  @scala.inline
  implicit class StarConfigOps[Self <: StarConfig] (val x: Self) extends AnyVal {
    
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
    def setNumPoints(value: Double): Self = this.set("numPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadius(value: Double): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
  }
}
