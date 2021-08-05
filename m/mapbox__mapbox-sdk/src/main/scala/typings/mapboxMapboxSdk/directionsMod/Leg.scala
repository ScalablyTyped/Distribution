package typings.mapboxMapboxSdk.directionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leg extends StObject {
  
  /**
    * An annotations object that contains additional details about each line segment along the route geometry.
    * Each entry in an annotations field corresponds to a coordinate along the route geometry.
    */
  var annotation: js.Array[DirectionsAnnotation]
  
  /**
    * Number indicating the distance traveled in meters
    */
  var distance: Double
  
  /**
    * Number indicating the estimated travel time in seconds
    */
  var duration: Double
  
  /**
    * Depending on the steps parameter, either an Array of RouteStep objects (true, default) or an empty array (false)
    */
  var steps: js.Array[Step]
  
  /**
    * Depending on the summary parameter, either a String summarizing the route (true, default) or an empty String (false)
    */
  var summary: String
  
  var weight: Double
}
object Leg {
  
  inline def apply(
    annotation: js.Array[DirectionsAnnotation],
    distance: Double,
    duration: Double,
    steps: js.Array[Step],
    summary: String,
    weight: Double
  ): Leg = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
  
  extension [Self <: Leg](x: Self) {
    
    inline def setAnnotation(value: js.Array[DirectionsAnnotation]): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationVarargs(value: DirectionsAnnotation*): Self = StObject.set(x, "annotation", js.Array(value :_*))
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
