package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatPollClosedDetails extends StObject {
  
  /**
    * The id of the poll that was closed.
    */
  var pollId: js.UndefOr[String] = js.native
}
object SchemaLiveChatPollClosedDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollClosedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatPollClosedDetailsMutableBuilder[Self <: SchemaLiveChatPollClosedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPollId(value: String): Self = StObject.set(x, "pollId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollIdUndefined: Self = StObject.set(x, "pollId", js.undefined)
  }
}
