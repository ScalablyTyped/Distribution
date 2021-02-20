package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
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
  implicit class StarConfigMutableBuilder[Self <: StarConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPoints(value: Double): Self = StObject.set(x, "numPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
  }
}
