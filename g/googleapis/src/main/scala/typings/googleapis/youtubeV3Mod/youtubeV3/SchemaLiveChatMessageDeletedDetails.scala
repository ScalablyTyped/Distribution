package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatMessageDeletedDetails extends StObject {
  
  var deletedMessageId: js.UndefOr[String] = js.undefined
}
object SchemaLiveChatMessageDeletedDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageDeletedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatMessageDeletedDetailsMutableBuilder[Self <: SchemaLiveChatMessageDeletedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedMessageId(value: String): Self = StObject.set(x, "deletedMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedMessageIdUndefined: Self = StObject.set(x, "deletedMessageId", js.undefined)
  }
}
