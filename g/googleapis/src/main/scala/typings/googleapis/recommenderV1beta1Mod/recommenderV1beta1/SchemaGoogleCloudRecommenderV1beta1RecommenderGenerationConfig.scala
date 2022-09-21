package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1RecommenderGenerationConfig extends StObject {
  
  /**
    * Parameters for this RecommenderGenerationConfig. These configs can be used by or are applied to all subtypes.
    */
  var params: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1RecommenderGenerationConfig {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1RecommenderGenerationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1RecommenderGenerationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1RecommenderGenerationConfig](x: Self) {
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
