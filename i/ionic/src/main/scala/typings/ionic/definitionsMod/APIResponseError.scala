package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIResponseError extends APIResponse {
  
  var error: APIResponseErrorError = js.native
  
  var meta: APIResponseMeta = js.native
}
object APIResponseError {
  
  @scala.inline
  def apply(error: APIResponseErrorError, meta: APIResponseMeta): APIResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseError]
  }
  
  @scala.inline
  implicit class APIResponseErrorOps[Self <: APIResponseError] (val x: Self) extends AnyVal {
    
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
    def setError(value: APIResponseErrorError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: APIResponseMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
