package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `Publish` method.
  */
@js.native
trait SchemaPublishResponse extends StObject {
  
  /**
    * The server-assigned ID of each published message, in the same order as
    * the messages in the request. IDs are guaranteed to be unique within the
    * topic.
    */
  var messageIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPublishResponse {
  
  @scala.inline
  def apply(): SchemaPublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishResponse]
  }
  
  @scala.inline
  implicit class SchemaPublishResponseMutableBuilder[Self <: SchemaPublishResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageIds(value: js.Array[String]): Self = StObject.set(x, "messageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdsUndefined: Self = StObject.set(x, "messageIds", js.undefined)
    
    @scala.inline
    def setMessageIdsVarargs(value: String*): Self = StObject.set(x, "messageIds", js.Array(value :_*))
  }
}
