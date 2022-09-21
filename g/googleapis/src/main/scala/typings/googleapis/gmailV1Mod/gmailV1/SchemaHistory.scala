package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistory extends StObject {
  
  /**
    * The mailbox sequence ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels added to messages in this history record.
    */
  var labelsAdded: js.UndefOr[js.Array[SchemaHistoryLabelAdded]] = js.undefined
  
  /**
    * Labels removed from messages in this history record.
    */
  var labelsRemoved: js.UndefOr[js.Array[SchemaHistoryLabelRemoved]] = js.undefined
  
  /**
    * List of messages changed in this history record. The fields for specific change types, such as `messagesAdded` may duplicate messages in this field. We recommend using the specific change-type fields instead of this.
    */
  var messages: js.UndefOr[js.Array[SchemaMessage]] = js.undefined
  
  /**
    * Messages added to the mailbox in this history record.
    */
  var messagesAdded: js.UndefOr[js.Array[SchemaHistoryMessageAdded]] = js.undefined
  
  /**
    * Messages deleted (not Trashed) from the mailbox in this history record.
    */
  var messagesDeleted: js.UndefOr[js.Array[SchemaHistoryMessageDeleted]] = js.undefined
}
object SchemaHistory {
  
  inline def apply(): SchemaHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistory]
  }
  
  extension [Self <: SchemaHistory](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabelsAdded(value: js.Array[SchemaHistoryLabelAdded]): Self = StObject.set(x, "labelsAdded", value.asInstanceOf[js.Any])
    
    inline def setLabelsAddedUndefined: Self = StObject.set(x, "labelsAdded", js.undefined)
    
    inline def setLabelsAddedVarargs(value: SchemaHistoryLabelAdded*): Self = StObject.set(x, "labelsAdded", js.Array(value*))
    
    inline def setLabelsRemoved(value: js.Array[SchemaHistoryLabelRemoved]): Self = StObject.set(x, "labelsRemoved", value.asInstanceOf[js.Any])
    
    inline def setLabelsRemovedUndefined: Self = StObject.set(x, "labelsRemoved", js.undefined)
    
    inline def setLabelsRemovedVarargs(value: SchemaHistoryLabelRemoved*): Self = StObject.set(x, "labelsRemoved", js.Array(value*))
    
    inline def setMessages(value: js.Array[SchemaMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesAdded(value: js.Array[SchemaHistoryMessageAdded]): Self = StObject.set(x, "messagesAdded", value.asInstanceOf[js.Any])
    
    inline def setMessagesAddedUndefined: Self = StObject.set(x, "messagesAdded", js.undefined)
    
    inline def setMessagesAddedVarargs(value: SchemaHistoryMessageAdded*): Self = StObject.set(x, "messagesAdded", js.Array(value*))
    
    inline def setMessagesDeleted(value: js.Array[SchemaHistoryMessageDeleted]): Self = StObject.set(x, "messagesDeleted", value.asInstanceOf[js.Any])
    
    inline def setMessagesDeletedUndefined: Self = StObject.set(x, "messagesDeleted", js.undefined)
    
    inline def setMessagesDeletedVarargs(value: SchemaHistoryMessageDeleted*): Self = StObject.set(x, "messagesDeleted", js.Array(value*))
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
