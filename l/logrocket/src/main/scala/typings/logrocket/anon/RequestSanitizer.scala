package typings.logrocket.anon

import typings.logrocket.mod.LR.IRequest
import typings.logrocket.mod.LR.IResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSanitizer extends js.Object {
  
  var isEnabled: js.UndefOr[Boolean] = js.native
  
  var requestSanitizer: js.UndefOr[js.Function1[/* request */ IRequest, Null | IRequest]] = js.native
  
  var responseSanitizer: js.UndefOr[js.Function1[/* response */ IResponse, Null | IResponse]] = js.native
}
object RequestSanitizer {
  
  @scala.inline
  def apply(): RequestSanitizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSanitizer]
  }
  
  @scala.inline
  implicit class RequestSanitizerOps[Self <: RequestSanitizer] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setRequestSanitizer(value: /* request */ IRequest => Null | IRequest): Self = this.set("requestSanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestSanitizer: Self = this.set("requestSanitizer", js.undefined)
    
    @scala.inline
    def setResponseSanitizer(value: /* response */ IResponse => Null | IResponse): Self = this.set("responseSanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResponseSanitizer: Self = this.set("responseSanitizer", js.undefined)
  }
}
