package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIResponseErrorError extends StObject {
  
  var details: js.UndefOr[js.Array[APIResponseErrorDetails]] = js.native
  
  var link: String | Null = js.native
  
  var message: String = js.native
  
  var `type`: String = js.native
}
object APIResponseErrorError {
  
  @scala.inline
  def apply(message: String, `type`: String): APIResponseErrorError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseErrorError]
  }
  
  @scala.inline
  implicit class APIResponseErrorErrorMutableBuilder[Self <: APIResponseErrorError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: js.Array[APIResponseErrorDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: APIResponseErrorDetails*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNull: Self = StObject.set(x, "link", null)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
