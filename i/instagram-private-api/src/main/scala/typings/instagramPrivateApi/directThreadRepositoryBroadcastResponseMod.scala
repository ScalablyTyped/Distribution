package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadRepositoryBroadcastResponseMod {
  
  trait DirectThreadRepositoryBroadcastResponseMessageMetadata extends StObject {
    
    var client_context: String
    
    var item_id: String
    
    var participant_ids: js.Array[String]
    
    var thread_id: String
    
    var timestamp: String
  }
  object DirectThreadRepositoryBroadcastResponseMessageMetadata {
    
    @scala.inline
    def apply(
      client_context: String,
      item_id: String,
      participant_ids: js.Array[String],
      thread_id: String,
      timestamp: String
    ): DirectThreadRepositoryBroadcastResponseMessageMetadata = {
      val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], participant_ids = participant_ids.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponseMessageMetadata]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryBroadcastResponseMessageMetadataMutableBuilder[Self <: DirectThreadRepositoryBroadcastResponseMessageMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipant_ids(value: js.Array[String]): Self = StObject.set(x, "participant_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticipant_idsVarargs(value: String*): Self = StObject.set(x, "participant_ids", js.Array(value :_*))
      
      @scala.inline
      def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryBroadcastResponsePayload extends StObject {
    
    var client_context: String
    
    var item_id: String
    
    var thread_id: String
    
    var timestamp: String
  }
  object DirectThreadRepositoryBroadcastResponsePayload {
    
    @scala.inline
    def apply(client_context: String, item_id: String, thread_id: String, timestamp: String): DirectThreadRepositoryBroadcastResponsePayload = {
      val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponsePayload]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryBroadcastResponsePayloadMutableBuilder[Self <: DirectThreadRepositoryBroadcastResponsePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectThreadRepositoryBroadcastResponseRootObject extends StObject {
    
    var action: String
    
    var message_metadata: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata]
    
    var payload: DirectThreadRepositoryBroadcastResponsePayload
    
    var status: String
    
    var status_code: String
  }
  object DirectThreadRepositoryBroadcastResponseRootObject {
    
    @scala.inline
    def apply(
      action: String,
      message_metadata: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata],
      payload: DirectThreadRepositoryBroadcastResponsePayload,
      status: String,
      status_code: String
    ): DirectThreadRepositoryBroadcastResponseRootObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], message_metadata = message_metadata.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponseRootObject]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryBroadcastResponseRootObjectMutableBuilder[Self <: DirectThreadRepositoryBroadcastResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage_metadata(value: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata]): Self = StObject.set(x, "message_metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage_metadataVarargs(value: DirectThreadRepositoryBroadcastResponseMessageMetadata*): Self = StObject.set(x, "message_metadata", js.Array(value :_*))
      
      @scala.inline
      def setPayload(value: DirectThreadRepositoryBroadcastResponsePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus_code(value: String): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    }
  }
}
