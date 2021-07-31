package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A record of a change to the user&#39;s mailbox. Each history change may
  * affect multiple messages in multiple ways.
  */
trait SchemaHistory extends StObject {
  
  /**
    * The mailbox sequence ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Labels added to messages in this history record.
    */
  var labelsAdded: js.UndefOr[js.Array[SchemaHistoryLabelAdded]] = js.undefined
  
  /**
    * Labels removed from messages in this history record.
    */
  var labelsRemoved: js.UndefOr[js.Array[SchemaHistoryLabelRemoved]] = js.undefined
  
  /**
    * List of messages changed in this history record. The fields for specific
    * change types, such as messagesAdded may duplicate messages in this field.
    * We recommend using the specific change-type fields instead of this.
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
  
  @scala.inline
  def apply(): SchemaHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistory]
  }
  
  @scala.inline
  implicit class SchemaHistoryMutableBuilder[Self <: SchemaHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelsAdded(value: js.Array[SchemaHistoryLabelAdded]): Self = StObject.set(x, "labelsAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsAddedUndefined: Self = StObject.set(x, "labelsAdded", js.undefined)
    
    @scala.inline
    def setLabelsAddedVarargs(value: SchemaHistoryLabelAdded*): Self = StObject.set(x, "labelsAdded", js.Array(value :_*))
    
    @scala.inline
    def setLabelsRemoved(value: js.Array[SchemaHistoryLabelRemoved]): Self = StObject.set(x, "labelsRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsRemovedUndefined: Self = StObject.set(x, "labelsRemoved", js.undefined)
    
    @scala.inline
    def setLabelsRemovedVarargs(value: SchemaHistoryLabelRemoved*): Self = StObject.set(x, "labelsRemoved", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[SchemaMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesAdded(value: js.Array[SchemaHistoryMessageAdded]): Self = StObject.set(x, "messagesAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesAddedUndefined: Self = StObject.set(x, "messagesAdded", js.undefined)
    
    @scala.inline
    def setMessagesAddedVarargs(value: SchemaHistoryMessageAdded*): Self = StObject.set(x, "messagesAdded", js.Array(value :_*))
    
    @scala.inline
    def setMessagesDeleted(value: js.Array[SchemaHistoryMessageDeleted]): Self = StObject.set(x, "messagesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesDeletedUndefined: Self = StObject.set(x, "messagesDeleted", js.undefined)
    
    @scala.inline
    def setMessagesDeletedVarargs(value: SchemaHistoryMessageDeleted*): Self = StObject.set(x, "messagesDeleted", js.Array(value :_*))
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: SchemaMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
