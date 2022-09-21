package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1FeatureMap extends StObject {
  
  /**
    * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and values must be UTF-8 encoded strings. For example: `{ "colors": {"value": ["yellow", "green"]\}, "sizes": {"value":["S", "M"]\}`
    */
  var categoricalFeatures: js.UndefOr[
    StringDictionary[SchemaGoogleCloudRecommendationengineV1beta1FeatureMapStringList] | Null
  ] = js.undefined
  
  /**
    * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ "lengths_cm": {"value":[2.3, 15.4]\}, "heights_cm": {"value":[8.1, 6.4]\} \}`
    */
  var numericalFeatures: js.UndefOr[
    StringDictionary[SchemaGoogleCloudRecommendationengineV1beta1FeatureMapFloatList] | Null
  ] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1FeatureMap {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1FeatureMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1FeatureMap]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1FeatureMap](x: Self) {
    
    inline def setCategoricalFeatures(value: StringDictionary[SchemaGoogleCloudRecommendationengineV1beta1FeatureMapStringList]): Self = StObject.set(x, "categoricalFeatures", value.asInstanceOf[js.Any])
    
    inline def setCategoricalFeaturesNull: Self = StObject.set(x, "categoricalFeatures", null)
    
    inline def setCategoricalFeaturesUndefined: Self = StObject.set(x, "categoricalFeatures", js.undefined)
    
    inline def setNumericalFeatures(value: StringDictionary[SchemaGoogleCloudRecommendationengineV1beta1FeatureMapFloatList]): Self = StObject.set(x, "numericalFeatures", value.asInstanceOf[js.Any])
    
    inline def setNumericalFeaturesNull: Self = StObject.set(x, "numericalFeatures", null)
    
    inline def setNumericalFeaturesUndefined: Self = StObject.set(x, "numericalFeatures", js.undefined)
  }
}
