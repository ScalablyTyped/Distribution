package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDigitalContentLabelAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of the digital content label rating tier.
    */
  var contentRatingTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. ID of the digital content label to be EXCLUDED.
    */
  var excludedTargetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDigitalContentLabelAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaDigitalContentLabelAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDigitalContentLabelAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaDigitalContentLabelAssignedTargetingOptionDetails](x: Self) {
    
    inline def setContentRatingTier(value: String): Self = StObject.set(x, "contentRatingTier", value.asInstanceOf[js.Any])
    
    inline def setContentRatingTierNull: Self = StObject.set(x, "contentRatingTier", null)
    
    inline def setContentRatingTierUndefined: Self = StObject.set(x, "contentRatingTier", js.undefined)
    
    inline def setExcludedTargetingOptionId(value: String): Self = StObject.set(x, "excludedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setExcludedTargetingOptionIdNull: Self = StObject.set(x, "excludedTargetingOptionId", null)
    
    inline def setExcludedTargetingOptionIdUndefined: Self = StObject.set(x, "excludedTargetingOptionId", js.undefined)
  }
}
