package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegularPolygonConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var radius: Double
  
  var sides: Double
}
object RegularPolygonConfig {
  
  @scala.inline
  def apply(radius: Double, sides: Double): RegularPolygonConfig = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularPolygonConfig]
  }
  
  @scala.inline
  implicit class RegularPolygonConfigMutableBuilder[Self <: RegularPolygonConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
  }
}
