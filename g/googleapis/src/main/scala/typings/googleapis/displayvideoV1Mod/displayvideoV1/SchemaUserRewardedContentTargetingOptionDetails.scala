package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserRewardedContentTargetingOptionDetails extends StObject {
  
  /**
    * Output only. User rewarded content status for video ads.
    */
  var userRewardedContent: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserRewardedContentTargetingOptionDetails {
  
  inline def apply(): SchemaUserRewardedContentTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRewardedContentTargetingOptionDetails]
  }
  
  extension [Self <: SchemaUserRewardedContentTargetingOptionDetails](x: Self) {
    
    inline def setUserRewardedContent(value: String): Self = StObject.set(x, "userRewardedContent", value.asInstanceOf[js.Any])
    
    inline def setUserRewardedContentNull: Self = StObject.set(x, "userRewardedContent", null)
    
    inline def setUserRewardedContentUndefined: Self = StObject.set(x, "userRewardedContent", js.undefined)
  }
}
