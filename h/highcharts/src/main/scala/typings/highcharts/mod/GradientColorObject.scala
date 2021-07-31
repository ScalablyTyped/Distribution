package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientColorObject
  extends StObject
     with _ColorType {
  
  /**
    * Holds an object that defines the start position and the end position
    * relative to the shape.
    */
  var linearGradient: js.UndefOr[LinearGradientColorObject] = js.undefined
  
  /**
    * Holds an object that defines the center position and the radius.
    */
  var radialGradient: js.UndefOr[RadialGradientColorObject] = js.undefined
  
  /**
    * The first item in each tuple is the position in the gradient, where 0 is
    * the start of the gradient and 1 is the end of the gradient. Multiple
    * stops can be applied. The second item is the color for each stop. This
    * color can also be given in the rgba format.
    */
  var stops: js.Array[GradientColorStopObject]
}
object GradientColorObject {
  
  @scala.inline
  def apply(stops: js.Array[GradientColorStopObject]): GradientColorObject = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorObject]
  }
  
  @scala.inline
  implicit class GradientColorObjectMutableBuilder[Self <: GradientColorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinearGradient(value: LinearGradientColorObject): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearGradientUndefined: Self = StObject.set(x, "linearGradient", js.undefined)
    
    @scala.inline
    def setRadialGradient(value: RadialGradientColorObject): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialGradientUndefined: Self = StObject.set(x, "radialGradient", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[GradientColorStopObject]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: GradientColorStopObject*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
