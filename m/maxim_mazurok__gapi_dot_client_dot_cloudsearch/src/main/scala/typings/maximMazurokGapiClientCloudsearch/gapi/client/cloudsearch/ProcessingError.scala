package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingError extends js.Object {
  
  /** Error code indicating the nature of the error. */
  var code: js.UndefOr[String] = js.native
  
  /** Description of the error. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** In case the item fields are invalid, this field contains the details about the validation errors. */
  var fieldViolations: js.UndefOr[js.Array[FieldViolation]] = js.native
}
object ProcessingError {
  
  @scala.inline
  def apply(): ProcessingError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingError]
  }
  
  @scala.inline
  implicit class ProcessingErrorOps[Self <: ProcessingError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setFieldViolationsVarargs(value: FieldViolation*): Self = this.set("fieldViolations", js.Array(value :_*))
    
    @scala.inline
    def setFieldViolations(value: js.Array[FieldViolation]): Self = this.set("fieldViolations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldViolations: Self = this.set("fieldViolations", js.undefined)
  }
}
