package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesMessageByIdRequest
  extends StObject
     with BaseRequest {
  
  /** the unique id of the message to get - passed as the "_id" field in webhooks, send calls, or search calls */
  var id: String
}
object MessagesMessageByIdRequest {
  
  inline def apply(id: String): MessagesMessageByIdRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesMessageByIdRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesMessageByIdRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
