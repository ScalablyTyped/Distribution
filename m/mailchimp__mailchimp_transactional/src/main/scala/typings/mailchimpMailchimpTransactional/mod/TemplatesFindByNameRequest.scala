package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatesFindByNameRequest
  extends StObject
     with BaseRequest {
  
  /** the immutable name of an existing template */
  var name: String
}
object TemplatesFindByNameRequest {
  
  inline def apply(name: String): TemplatesFindByNameRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesFindByNameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplatesFindByNameRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
