package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDigitalContentLabelTargetingOptionDetails extends StObject {
  
  /**
    * Output only. An enum for the content label brand safety tiers.
    */
  var contentRatingTier: js.UndefOr[String | Null] = js.undefined
}
object SchemaDigitalContentLabelTargetingOptionDetails {
  
  inline def apply(): SchemaDigitalContentLabelTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDigitalContentLabelTargetingOptionDetails]
  }
  
  extension [Self <: SchemaDigitalContentLabelTargetingOptionDetails](x: Self) {
    
    inline def setContentRatingTier(value: String): Self = StObject.set(x, "contentRatingTier", value.asInstanceOf[js.Any])
    
    inline def setContentRatingTierNull: Self = StObject.set(x, "contentRatingTier", null)
    
    inline def setContentRatingTierUndefined: Self = StObject.set(x, "contentRatingTier", js.undefined)
  }
}
