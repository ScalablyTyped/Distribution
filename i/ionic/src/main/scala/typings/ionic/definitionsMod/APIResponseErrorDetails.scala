package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIResponseErrorDetails extends js.Object {
  
  var error_type: String = js.native
  
  var errors: js.Array[String] = js.native
  
  var parameter: String = js.native
}
object APIResponseErrorDetails {
  
  @scala.inline
  def apply(error_type: String, errors: js.Array[String], parameter: String): APIResponseErrorDetails = {
    val __obj = js.Dynamic.literal(error_type = error_type.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseErrorDetails]
  }
  
  @scala.inline
  implicit class APIResponseErrorDetailsOps[Self <: APIResponseErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError_type(value: String): Self = this.set("error_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
  }
}
