package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomStops extends StObject {
  
  def evaluate(_underscore: Any, feature: Any): Any
  
  var interpolationFactor: Unit
  
  var interpolationType: Unit
  
  var kind: String
  
  var zoomStops: Unit
}
object ZoomStops {
  
  inline def apply(
    evaluate: (Any, Any) => Any,
    interpolationFactor: Unit,
    interpolationType: Unit,
    kind: String,
    zoomStops: Unit
  ): ZoomStops = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), interpolationFactor = interpolationFactor.asInstanceOf[js.Any], interpolationType = interpolationType.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], zoomStops = zoomStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomStops]
  }
  
  extension [Self <: ZoomStops](x: Self) {
    
    inline def setEvaluate(value: (Any, Any) => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction2(value))
    
    inline def setInterpolationFactor(value: Unit): Self = StObject.set(x, "interpolationFactor", value.asInstanceOf[js.Any])
    
    inline def setInterpolationType(value: Unit): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setZoomStops(value: Unit): Self = StObject.set(x, "zoomStops", value.asInstanceOf[js.Any])
  }
}
