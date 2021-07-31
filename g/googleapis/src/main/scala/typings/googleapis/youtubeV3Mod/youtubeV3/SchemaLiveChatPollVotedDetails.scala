package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatPollVotedDetails extends StObject {
  
  /**
    * The poll item the user chose.
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * The poll the user voted on.
    */
  var pollId: js.UndefOr[String] = js.undefined
}
object SchemaLiveChatPollVotedDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatPollVotedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollVotedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatPollVotedDetailsMutableBuilder[Self <: SchemaLiveChatPollVotedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setPollId(value: String): Self = StObject.set(x, "pollId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollIdUndefined: Self = StObject.set(x, "pollId", js.undefined)
  }
}
