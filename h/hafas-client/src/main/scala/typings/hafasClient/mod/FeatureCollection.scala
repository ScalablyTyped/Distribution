package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureCollection extends StObject {
  
  var features: js.Array[Feature]
  
  var `type`: typings.hafasClient.hafasClientStrings.FeatureCollection
}
object FeatureCollection {
  
  inline def apply(features: js.Array[Feature]): FeatureCollection = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FeatureCollection")
    __obj.asInstanceOf[FeatureCollection]
  }
  
  extension [Self <: FeatureCollection](x: Self) {
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setType(value: typings.hafasClient.hafasClientStrings.FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
