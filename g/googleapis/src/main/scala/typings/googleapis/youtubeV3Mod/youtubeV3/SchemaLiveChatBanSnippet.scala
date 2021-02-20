package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatBanSnippet extends StObject {
  
  /**
    * The duration of a ban, only filled if the ban has type TEMPORARY.
    */
  var banDurationSeconds: js.UndefOr[String] = js.native
  
  var bannedUserDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
  
  /**
    * The chat this ban is pertinent to.
    */
  var liveChatId: js.UndefOr[String] = js.native
  
  /**
    * The type of ban.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaLiveChatBanSnippet {
  
  @scala.inline
  def apply(): SchemaLiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatBanSnippet]
  }
  
  @scala.inline
  implicit class SchemaLiveChatBanSnippetMutableBuilder[Self <: SchemaLiveChatBanSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanDurationSeconds(value: String): Self = StObject.set(x, "banDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBanDurationSecondsUndefined: Self = StObject.set(x, "banDurationSeconds", js.undefined)
    
    @scala.inline
    def setBannedUserDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "bannedUserDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannedUserDetailsUndefined: Self = StObject.set(x, "bannedUserDetails", js.undefined)
    
    @scala.inline
    def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
