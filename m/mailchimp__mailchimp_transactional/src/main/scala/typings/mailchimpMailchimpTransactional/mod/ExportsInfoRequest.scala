package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportsInfoRequest
  extends StObject
     with BaseRequest {
  
  /** an export job identifier */
  var id: String
}
object ExportsInfoRequest {
  
  inline def apply(id: String): ExportsInfoRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportsInfoRequest]
  }
  
  extension [Self <: ExportsInfoRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
