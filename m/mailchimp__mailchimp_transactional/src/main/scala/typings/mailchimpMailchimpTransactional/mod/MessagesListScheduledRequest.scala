package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesListScheduledRequest
  extends StObject
     with BaseRequest {
  
  /** an optional recipient address to restrict results to */
  var to: js.UndefOr[String] = js.undefined
}
object MessagesListScheduledRequest {
  
  inline def apply(): MessagesListScheduledRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagesListScheduledRequest]
  }
  
  extension [Self <: MessagesListScheduledRequest](x: Self) {
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
