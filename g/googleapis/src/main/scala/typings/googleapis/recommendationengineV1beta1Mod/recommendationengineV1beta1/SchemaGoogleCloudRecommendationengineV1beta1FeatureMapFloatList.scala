package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1FeatureMapFloatList extends StObject {
  
  /**
    * Float feature value.
    */
  var value: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1FeatureMapFloatList {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1FeatureMapFloatList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1FeatureMapFloatList]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1FeatureMapFloatList](x: Self) {
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
