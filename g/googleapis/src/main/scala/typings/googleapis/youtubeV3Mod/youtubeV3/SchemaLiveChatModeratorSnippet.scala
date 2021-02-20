package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatModeratorSnippet extends StObject {
  
  /**
    * The ID of the live chat this moderator can act on.
    */
  var liveChatId: js.UndefOr[String] = js.native
  
  /**
    * Details about the moderator.
    */
  var moderatorDetails: js.UndefOr[SchemaChannelProfileDetails] = js.native
}
object SchemaLiveChatModeratorSnippet {
  
  @scala.inline
  def apply(): SchemaLiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatModeratorSnippet]
  }
  
  @scala.inline
  implicit class SchemaLiveChatModeratorSnippetMutableBuilder[Self <: SchemaLiveChatModeratorSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    @scala.inline
    def setModeratorDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "moderatorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeratorDetailsUndefined: Self = StObject.set(x, "moderatorDetails", js.undefined)
  }
}
