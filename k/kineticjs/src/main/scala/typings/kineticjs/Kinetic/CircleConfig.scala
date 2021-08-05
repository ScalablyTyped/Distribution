package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var radius: Double
}
object CircleConfig {
  
  inline def apply(radius: Double): CircleConfig = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleConfig]
  }
  
  extension [Self <: CircleConfig](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
