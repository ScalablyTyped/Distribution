package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evaluate extends StObject {
  
  def evaluate(param0: ZoomAny, properties: Any): Any
  
  var interpolationFactor: Any
  
  var interpolationType: NameString
  
  var kind: String
  
  var zoomStops: js.Array[Any]
}
object Evaluate {
  
  inline def apply(
    evaluate: (ZoomAny, Any) => Any,
    interpolationFactor: Any,
    interpolationType: NameString,
    kind: String,
    zoomStops: js.Array[Any]
  ): Evaluate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), interpolationFactor = interpolationFactor.asInstanceOf[js.Any], interpolationType = interpolationType.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], zoomStops = zoomStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluate]
  }
  
  extension [Self <: Evaluate](x: Self) {
    
    inline def setEvaluate(value: (ZoomAny, Any) => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction2(value))
    
    inline def setInterpolationFactor(value: Any): Self = StObject.set(x, "interpolationFactor", value.asInstanceOf[js.Any])
    
    inline def setInterpolationType(value: NameString): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setZoomStops(value: js.Array[Any]): Self = StObject.set(x, "zoomStops", value.asInstanceOf[js.Any])
    
    inline def setZoomStopsVarargs(value: Any*): Self = StObject.set(x, "zoomStops", js.Array(value*))
  }
}
