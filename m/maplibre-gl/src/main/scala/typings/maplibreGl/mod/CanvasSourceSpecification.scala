package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.canvas
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasSourceSpecification extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var canvas: String | HTMLCanvasElement
  
  var coordinates: js.Tuple4[
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double]
  ]
  
  var `type`: canvas
}
object CanvasSourceSpecification {
  
  inline def apply(
    canvas: String | HTMLCanvasElement,
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ]
  ): CanvasSourceSpecification = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[CanvasSourceSpecification]
  }
  
  extension [Self <: CanvasSourceSpecification](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setCanvas(value: String | HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(
      value: js.Tuple4[
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double]
        ]
    ): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setType(value: canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
