package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreMaplibreGlStyleSpec.anon.Name
  - typings.maplibreMaplibreGlStyleSpec.anon.Base
  - typings.maplibreMaplibreGlStyleSpec.anon.ControlPoints
*/
trait InterpolationType extends StObject
object InterpolationType {
  
  inline def Base(base: Double): typings.maplibreMaplibreGlStyleSpec.anon.Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = "exponential")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Base]
  }
  
  inline def ControlPoints(controlPoints: js.Tuple4[Double, Double, Double, Double]): typings.maplibreMaplibreGlStyleSpec.anon.ControlPoints = {
    val __obj = js.Dynamic.literal(controlPoints = controlPoints.asInstanceOf[js.Any], name = "cubic-bezier")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.ControlPoints]
  }
  
  inline def Name(): typings.maplibreMaplibreGlStyleSpec.anon.Name = {
    val __obj = js.Dynamic.literal(name = "linear")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Name]
  }
}
