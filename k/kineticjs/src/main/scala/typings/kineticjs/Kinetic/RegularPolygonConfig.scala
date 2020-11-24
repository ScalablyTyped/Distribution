package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegularPolygonConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var radius: Double = js.native
  
  var sides: Double = js.native
}
object RegularPolygonConfig {
  
  @scala.inline
  def apply(radius: Double, sides: Double): RegularPolygonConfig = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularPolygonConfig]
  }
  
  @scala.inline
  implicit class RegularPolygonConfigOps[Self <: RegularPolygonConfig] (val x: Self) extends AnyVal {
    
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSides(value: Double): Self = this.set("sides", value.asInstanceOf[js.Any])
  }
}
