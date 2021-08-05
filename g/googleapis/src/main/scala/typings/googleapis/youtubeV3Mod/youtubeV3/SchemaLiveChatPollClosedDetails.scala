package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatPollClosedDetails extends StObject {
  
  /**
    * The id of the poll that was closed.
    */
  var pollId: js.UndefOr[String] = js.undefined
}
object SchemaLiveChatPollClosedDetails {
  
  inline def apply(): SchemaLiveChatPollClosedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollClosedDetails]
  }
  
  extension [Self <: SchemaLiveChatPollClosedDetails](x: Self) {
    
    inline def setPollId(value: String): Self = StObject.set(x, "pollId", value.asInstanceOf[js.Any])
    
    inline def setPollIdUndefined: Self = StObject.set(x, "pollId", js.undefined)
  }
}
