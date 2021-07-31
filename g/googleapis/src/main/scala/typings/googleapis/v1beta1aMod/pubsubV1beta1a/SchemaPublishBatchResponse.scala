package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the PublishBatch method.
  */
trait SchemaPublishBatchResponse extends StObject {
  
  /**
    * The server-assigned ID of each published message, in the same order as
    * the messages in the request. IDs are guaranteed to be unique within the
    * topic.
    */
  var messageIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPublishBatchResponse {
  
  @scala.inline
  def apply(): SchemaPublishBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishBatchResponse]
  }
  
  @scala.inline
  implicit class SchemaPublishBatchResponseMutableBuilder[Self <: SchemaPublishBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageIds(value: js.Array[String]): Self = StObject.set(x, "messageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdsUndefined: Self = StObject.set(x, "messageIds", js.undefined)
    
    @scala.inline
    def setMessageIdsVarargs(value: String*): Self = StObject.set(x, "messageIds", js.Array(value :_*))
  }
}
