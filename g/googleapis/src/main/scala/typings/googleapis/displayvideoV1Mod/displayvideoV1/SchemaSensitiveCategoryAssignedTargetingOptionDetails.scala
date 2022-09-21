package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSensitiveCategoryAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. ID of the sensitive category to be EXCLUDED.
    */
  var excludedTargetingOptionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. An enum for the DV360 Sensitive category content classifier.
    */
  var sensitiveCategory: js.UndefOr[String | Null] = js.undefined
}
object SchemaSensitiveCategoryAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaSensitiveCategoryAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSensitiveCategoryAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaSensitiveCategoryAssignedTargetingOptionDetails](x: Self) {
    
    inline def setExcludedTargetingOptionId(value: String): Self = StObject.set(x, "excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setExcludedTargetingOptionIdNull: Self = StObject.set(x, "excludedTargetingOptionId", null)
    
    inline def setExcludedTargetingOptionIdUndefined: Self = StObject.set(x, "excludedTargetingOptionId", js.undefined)
    
    inline def setSensitiveCategory(value: String): Self = StObject.set(x, "sensitiveCategory", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoryNull: Self = StObject.set(x, "sensitiveCategory", null)
    
    inline def setSensitiveCategoryUndefined: Self = StObject.set(x, "sensitiveCategory", js.undefined)
  }
}
