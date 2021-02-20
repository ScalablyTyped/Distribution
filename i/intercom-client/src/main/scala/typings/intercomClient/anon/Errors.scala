package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.errorDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors extends StObject {
  
  var errors: js.Array[Code] = js.native
  
  var request_id: String = js.native
  
  var `type`: errorDotlist = js.native
}
object Errors {
  
  @scala.inline
  def apply(errors: js.Array[Code], request_id: String, `type`: errorDotlist): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[Code]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Code*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: errorDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
