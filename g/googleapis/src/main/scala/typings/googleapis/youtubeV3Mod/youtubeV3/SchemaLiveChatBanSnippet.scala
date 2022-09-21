package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatBanSnippet extends StObject {
  
  /**
    * The duration of a ban, only filled if the ban has type TEMPORARY.
    */
  var banDurationSeconds: js.UndefOr[String | Null] = js.undefined
  
  var bannedUserDetails: js.UndefOr[SchemaChannelProfileDetails] = js.undefined
  
  /**
    * The chat this ban is pertinent to.
    */
  var liveChatId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of ban.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatBanSnippet {
  
  inline def apply(): SchemaLiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatBanSnippet]
  }
  
  extension [Self <: SchemaLiveChatBanSnippet](x: Self) {
    
    inline def setBanDurationSeconds(value: String): Self = StObject.set(x, "banDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setBanDurationSecondsNull: Self = StObject.set(x, "banDurationSeconds", null)
    
    inline def setBanDurationSecondsUndefined: Self = StObject.set(x, "banDurationSeconds", js.undefined)
    
    inline def setBannedUserDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "bannedUserDetails", value.asInstanceOf[js.Any])
    
    inline def setBannedUserDetailsUndefined: Self = StObject.set(x, "bannedUserDetails", js.undefined)
    
    inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    inline def setLiveChatIdNull: Self = StObject.set(x, "liveChatId", null)
    
    inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
