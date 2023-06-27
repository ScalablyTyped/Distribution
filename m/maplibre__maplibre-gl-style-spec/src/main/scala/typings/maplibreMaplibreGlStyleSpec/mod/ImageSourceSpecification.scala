package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSourceSpecification
  extends StObject
     with SourceSpecification {
  
  var coordinates: js.Tuple4[
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double]
  ]
  
  var `type`: image
  
  var url: String
}
object ImageSourceSpecification {
  
  inline def apply(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    url: String
  ): ImageSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageSourceSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageSourceSpecification] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(
      value: js.Tuple4[
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double]
        ]
    ): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
