package typings.maplibreMaplibreGlStyleSpec.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationType extends StObject {
  
  def evaluate(_underscore: Any, feature: Any): Any
  
  var interpolationFactor: Unit
  
  var interpolationType: Unit
  
  var kind: String
  
  var zoomStops: Unit
}
object InterpolationType {
  
  inline def apply(
    evaluate: (Any, Any) => Any,
    interpolationFactor: Unit,
    interpolationType: Unit,
    kind: String,
    zoomStops: Unit
  ): InterpolationType = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), interpolationFactor = interpolationFactor.asInstanceOf[js.Any], interpolationType = interpolationType.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], zoomStops = zoomStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolationType] (val x: Self) extends AnyVal {
    
    inline def setEvaluate(value: (Any, Any) => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction2(value))
    
    inline def setInterpolationFactor(value: Unit): Self = StObject.set(x, "interpolationFactor", value.asInstanceOf[js.Any])
    
    inline def setInterpolationType(value: Unit): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setZoomStops(value: Unit): Self = StObject.set(x, "zoomStops", value.asInstanceOf[js.Any])
  }
}
