package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateResponse extends js.Object {
  
  /** Will be empty if validation succeeds. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** Information about the validated query. Not defined if validation fails. */
  var queryInfo: js.UndefOr[QueryInfo] = js.native
}
object ValidateResponse {
  
  @scala.inline
  def apply(): ValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateResponse]
  }
  
  @scala.inline
  implicit class ValidateResponseOps[Self <: ValidateResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setQueryInfo(value: QueryInfo): Self = this.set("queryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryInfo: Self = this.set("queryInfo", js.undefined)
  }
}
