package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatMessageRetractedDetails extends StObject {
  
  var retractedMessageId: js.UndefOr[String] = js.native
}
object SchemaLiveChatMessageRetractedDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageRetractedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatMessageRetractedDetailsMutableBuilder[Self <: SchemaLiveChatMessageRetractedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetractedMessageId(value: String): Self = StObject.set(x, "retractedMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetractedMessageIdUndefined: Self = StObject.set(x, "retractedMessageId", js.undefined)
  }
}
