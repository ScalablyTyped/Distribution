package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserRewardedContentAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_USER_REWARDED_CONTENT`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. User rewarded content status for video ads.
    */
  var userRewardedContent: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserRewardedContentAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaUserRewardedContentAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRewardedContentAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaUserRewardedContentAssignedTargetingOptionDetails](x: Self) {
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    inline def setUserRewardedContent(value: String): Self = StObject.set(x, "userRewardedContent", value.asInstanceOf[js.Any])
    
    inline def setUserRewardedContentNull: Self = StObject.set(x, "userRewardedContent", null)
    
    inline def setUserRewardedContentUndefined: Self = StObject.set(x, "userRewardedContent", js.undefined)
  }
}
