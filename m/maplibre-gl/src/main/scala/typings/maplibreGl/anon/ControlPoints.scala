package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.`cubic-bezier`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlPoints
  extends StObject
     with typings.maplibreGl.mod.InterpolationType
     with typings.maplibreGl.distStyleSpecMod.InterpolationType {
  
  var controlPoints: js.Tuple4[Double, Double, Double, Double]
  
  var name: `cubic-bezier`
}
object ControlPoints {
  
  inline def apply(controlPoints: js.Tuple4[Double, Double, Double, Double]): ControlPoints = {
    val __obj = js.Dynamic.literal(controlPoints = controlPoints.asInstanceOf[js.Any], name = "cubic-bezier")
    __obj.asInstanceOf[ControlPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlPoints] (val x: Self) extends AnyVal {
    
    inline def setControlPoints(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "controlPoints", value.asInstanceOf[js.Any])
    
    inline def setName(value: `cubic-bezier`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
