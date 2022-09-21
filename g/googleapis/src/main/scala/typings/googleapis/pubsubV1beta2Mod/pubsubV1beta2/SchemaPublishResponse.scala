package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublishResponse extends StObject {
  
  /**
    * The server-assigned ID of each published message, in the same order as the messages in the request. IDs are guaranteed to be unique within the topic.
    */
  var messageIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPublishResponse {
  
  inline def apply(): SchemaPublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishResponse]
  }
  
  extension [Self <: SchemaPublishResponse](x: Self) {
    
    inline def setMessageIds(value: js.Array[String]): Self = StObject.set(x, "messageIds", value.asInstanceOf[js.Any])
    
    inline def setMessageIdsNull: Self = StObject.set(x, "messageIds", null)
    
    inline def setMessageIdsUndefined: Self = StObject.set(x, "messageIds", js.undefined)
    
    inline def setMessageIdsVarargs(value: String*): Self = StObject.set(x, "messageIds", js.Array(value*))
  }
}
