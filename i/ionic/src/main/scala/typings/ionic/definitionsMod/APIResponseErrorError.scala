package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIResponseErrorError extends StObject {
  
  var details: js.UndefOr[js.Array[APIResponseErrorDetails]] = js.undefined
  
  var link: String | Null
  
  var message: String
  
  var `type`: String
}
object APIResponseErrorError {
  
  inline def apply(message: String, `type`: String): APIResponseErrorError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], link = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseErrorError]
  }
  
  extension [Self <: APIResponseErrorError](x: Self) {
    
    inline def setDetails(value: js.Array[APIResponseErrorDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: APIResponseErrorDetails*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkNull: Self = StObject.set(x, "link", null)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
