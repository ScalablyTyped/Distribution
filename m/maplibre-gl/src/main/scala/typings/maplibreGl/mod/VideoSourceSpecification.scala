package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSourceSpecification
  extends StObject
     with SourceSpecification {
  
  var coordinates: js.Tuple4[
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double], 
    js.Tuple2[Double, Double]
  ]
  
  var `type`: video
  
  var urls: js.Array[String]
}
object VideoSourceSpecification {
  
  inline def apply(
    coordinates: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    urls: js.Array[String]
  ): VideoSourceSpecification = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[VideoSourceSpecification]
  }
  
  extension [Self <: VideoSourceSpecification](x: Self) {
    
    inline def setCoordinates(
      value: js.Tuple4[
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double], 
          js.Tuple2[Double, Double]
        ]
    ): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
