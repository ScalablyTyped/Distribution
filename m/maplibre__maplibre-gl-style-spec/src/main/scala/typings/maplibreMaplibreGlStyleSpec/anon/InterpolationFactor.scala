package typings.maplibreMaplibreGlStyleSpec.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationFactor extends StObject {
  
  def evaluate(param0: ZoomAny): Any
  
  var interpolationFactor: Any
  
  var interpolationType: BaseName
  
  var kind: String
  
  var zoomStops: Any
}
object InterpolationFactor {
  
  inline def apply(
    evaluate: ZoomAny => Any,
    interpolationFactor: Any,
    interpolationType: BaseName,
    kind: String,
    zoomStops: Any
  ): InterpolationFactor = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), interpolationFactor = interpolationFactor.asInstanceOf[js.Any], interpolationType = interpolationType.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], zoomStops = zoomStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationFactor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolationFactor] (val x: Self) extends AnyVal {
    
    inline def setEvaluate(value: ZoomAny => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setInterpolationFactor(value: Any): Self = StObject.set(x, "interpolationFactor", value.asInstanceOf[js.Any])
    
    inline def setInterpolationType(value: BaseName): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setZoomStops(value: Any): Self = StObject.set(x, "zoomStops", value.asInstanceOf[js.Any])
  }
}
