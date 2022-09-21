package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var dash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineCap: js.UndefOr[String] = js.undefined
  
  var points: Any
}
object LineConfig {
  
  inline def apply(points: Any): LineConfig = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineConfig]
  }
  
  extension [Self <: LineConfig](x: Self) {
    
    inline def setDash(value: js.Array[Double]): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setDashVarargs(value: Double*): Self = StObject.set(x, "dash", js.Array(value*))
    
    inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setPoints(value: Any): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
