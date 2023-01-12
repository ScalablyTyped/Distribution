package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StarConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var innerRadius: Double
  
  var numPoints: Double
  
  var outerRadius: Double
}
object StarConfig {
  
  inline def apply(innerRadius: Double, numPoints: Double, outerRadius: Double): StarConfig = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], numPoints = numPoints.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StarConfig] (val x: Self) extends AnyVal {
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setNumPoints(value: Double): Self = StObject.set(x, "numPoints", value.asInstanceOf[js.Any])
    
    inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
  }
}
