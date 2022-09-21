package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesParseRequest
  extends StObject
     with BaseRequest {
  
  /** the full MIME document of an email message */
  var raw_message: String
}
object MessagesParseRequest {
  
  inline def apply(raw_message: String): MessagesParseRequest = {
    val __obj = js.Dynamic.literal(raw_message = raw_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesParseRequest]
  }
  
  extension [Self <: MessagesParseRequest](x: Self) {
    
    inline def setRaw_message(value: String): Self = StObject.set(x, "raw_message", value.asInstanceOf[js.Any])
  }
}
