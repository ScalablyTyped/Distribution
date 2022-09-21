package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1CostProjection extends StObject {
  
  /**
    * An approximate projection on amount saved or amount incurred. Negative cost units indicate cost savings and positive cost units indicate increase. See google.type.Money documentation for positive/negative units. A user's permissions may affect whether the cost is computed using list prices or custom contract prices.
    */
  var cost: js.UndefOr[SchemaGoogleTypeMoney] = js.undefined
  
  /**
    * Duration for which this cost applies.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1CostProjection {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1CostProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1CostProjection]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1CostProjection](x: Self) {
    
    inline def setCost(value: SchemaGoogleTypeMoney): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
