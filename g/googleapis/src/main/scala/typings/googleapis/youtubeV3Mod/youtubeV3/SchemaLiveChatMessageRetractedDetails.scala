package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatMessageRetractedDetails extends StObject {
  
  var retractedMessageId: js.UndefOr[String] = js.undefined
}
object SchemaLiveChatMessageRetractedDetails {
  
  inline def apply(): SchemaLiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageRetractedDetails]
  }
  
  extension [Self <: SchemaLiveChatMessageRetractedDetails](x: Self) {
    
    inline def setRetractedMessageId(value: String): Self = StObject.set(x, "retractedMessageId", value.asInstanceOf[js.Any])
    
    inline def setRetractedMessageIdUndefined: Self = StObject.set(x, "retractedMessageId", js.undefined)
  }
}
