package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatMembershipGiftingDetails extends StObject {
  
  /**
    * The number of gift memberships purchased by the user.
    */
  var giftMembershipsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the level of the gift memberships purchased by the user. The Level names are defined by the YouTube channel offering the Membership. In some situations this field isn't filled.
    */
  var giftMembershipsLevelName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatMembershipGiftingDetails {
  
  inline def apply(): SchemaLiveChatMembershipGiftingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMembershipGiftingDetails]
  }
  
  extension [Self <: SchemaLiveChatMembershipGiftingDetails](x: Self) {
    
    inline def setGiftMembershipsCount(value: Double): Self = StObject.set(x, "giftMembershipsCount", value.asInstanceOf[js.Any])
    
    inline def setGiftMembershipsCountNull: Self = StObject.set(x, "giftMembershipsCount", null)
    
    inline def setGiftMembershipsCountUndefined: Self = StObject.set(x, "giftMembershipsCount", js.undefined)
    
    inline def setGiftMembershipsLevelName(value: String): Self = StObject.set(x, "giftMembershipsLevelName", value.asInstanceOf[js.Any])
    
    inline def setGiftMembershipsLevelNameNull: Self = StObject.set(x, "giftMembershipsLevelName", null)
    
    inline def setGiftMembershipsLevelNameUndefined: Self = StObject.set(x, "giftMembershipsLevelName", js.undefined)
  }
}
