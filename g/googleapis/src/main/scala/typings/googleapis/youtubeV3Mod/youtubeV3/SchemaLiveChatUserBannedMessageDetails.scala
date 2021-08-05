package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatUserBannedMessageDetails extends StObject {
  
  /**
    * The duration of the ban. This property is only present if the banType is
    * temporary.
    */
  var banDurationSeconds: js.UndefOr[String] = js.undefined
  
  /**
    * The type of ban.
    */
  var banType: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the user that was banned.
    */
  var bannedUserDetails: js.UndefOr[SchemaChannelProfileDetails] = js.undefined
}
object SchemaLiveChatUserBannedMessageDetails {
  
  inline def apply(): SchemaLiveChatUserBannedMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatUserBannedMessageDetails]
  }
  
  extension [Self <: SchemaLiveChatUserBannedMessageDetails](x: Self) {
    
    inline def setBanDurationSeconds(value: String): Self = StObject.set(x, "banDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setBanDurationSecondsUndefined: Self = StObject.set(x, "banDurationSeconds", js.undefined)
    
    inline def setBanType(value: String): Self = StObject.set(x, "banType", value.asInstanceOf[js.Any])
    
    inline def setBanTypeUndefined: Self = StObject.set(x, "banType", js.undefined)
    
    inline def setBannedUserDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "bannedUserDetails", value.asInstanceOf[js.Any])
    
    inline def setBannedUserDetailsUndefined: Self = StObject.set(x, "bannedUserDetails", js.undefined)
  }
}
