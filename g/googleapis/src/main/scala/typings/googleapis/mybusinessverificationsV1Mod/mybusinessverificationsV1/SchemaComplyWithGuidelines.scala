package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComplyWithGuidelines extends StObject {
  
  /**
    * The reason why the location is being recommended to comply with guidelines.
    */
  var recommendationReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaComplyWithGuidelines {
  
  inline def apply(): SchemaComplyWithGuidelines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComplyWithGuidelines]
  }
  
  extension [Self <: SchemaComplyWithGuidelines](x: Self) {
    
    inline def setRecommendationReason(value: String): Self = StObject.set(x, "recommendationReason", value.asInstanceOf[js.Any])
    
    inline def setRecommendationReasonNull: Self = StObject.set(x, "recommendationReason", null)
    
    inline def setRecommendationReasonUndefined: Self = StObject.set(x, "recommendationReason", js.undefined)
  }
}
