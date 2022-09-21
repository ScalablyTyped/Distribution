package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1FeatureMapStringList extends StObject {
  
  /**
    * String feature value with a length limit of 128 bytes.
    */
  var value: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1FeatureMapStringList {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1FeatureMapStringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1FeatureMapStringList]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1FeatureMapStringList](x: Self) {
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
