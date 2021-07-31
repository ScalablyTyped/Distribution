package typings.mailgunJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponse extends StObject {
  
  var address: String
  
  var message: String
}
object DeleteResponse {
  
  @scala.inline
  def apply(address: String, message: String): DeleteResponse = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponse]
  }
  
  @scala.inline
  implicit class DeleteResponseMutableBuilder[Self <: DeleteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
