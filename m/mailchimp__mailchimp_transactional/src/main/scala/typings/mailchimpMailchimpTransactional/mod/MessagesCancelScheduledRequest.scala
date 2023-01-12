package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesCancelScheduledRequest
  extends StObject
     with BaseRequest {
  
  /** a scheduled email id, as returned by any of the messages/send calls or messages/list-scheduled */
  var id: String
}
object MessagesCancelScheduledRequest {
  
  inline def apply(id: String): MessagesCancelScheduledRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesCancelScheduledRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesCancelScheduledRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
