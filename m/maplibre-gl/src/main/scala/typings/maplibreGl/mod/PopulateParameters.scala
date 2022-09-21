package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopulateParameters extends StObject {
  
  var availableImages: js.Array[String]
  
  var featureIndex: FeatureIndex
}
object PopulateParameters {
  
  inline def apply(availableImages: js.Array[String], featureIndex: FeatureIndex): PopulateParameters = {
    val __obj = js.Dynamic.literal(availableImages = availableImages.asInstanceOf[js.Any], featureIndex = featureIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopulateParameters]
  }
  
  extension [Self <: PopulateParameters](x: Self) {
    
    inline def setAvailableImages(value: js.Array[String]): Self = StObject.set(x, "availableImages", value.asInstanceOf[js.Any])
    
    inline def setAvailableImagesVarargs(value: String*): Self = StObject.set(x, "availableImages", js.Array(value*))
    
    inline def setFeatureIndex(value: FeatureIndex): Self = StObject.set(x, "featureIndex", value.asInstanceOf[js.Any])
  }
}
