package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveBroadcastStatistics extends StObject {
  
  /**
    * The total number of live chat messages currently on the broadcast. The property and its value will be present if the broadcast is public, has the live chat feature enabled, and has at least one message. Note that this field will not be filled after the broadcast ends. So this property would not identify the number of chat messages for an archived video of a completed live broadcast.
    */
  var totalChatCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveBroadcastStatistics {
  
  inline def apply(): SchemaLiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastStatistics]
  }
  
  extension [Self <: SchemaLiveBroadcastStatistics](x: Self) {
    
    inline def setTotalChatCount(value: String): Self = StObject.set(x, "totalChatCount", value.asInstanceOf[js.Any])
    
    inline def setTotalChatCountNull: Self = StObject.set(x, "totalChatCount", null)
    
    inline def setTotalChatCountUndefined: Self = StObject.set(x, "totalChatCount", js.undefined)
  }
}
