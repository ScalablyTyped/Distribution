package typings.jsDataHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionOpts extends js.Object {
  
  var adapter: js.UndefOr[String] = js.native
  
  var pathname: js.UndefOr[String] = js.native
  
  var request: js.UndefOr[js.Function] = js.native
  
  var response: js.UndefOr[js.Function] = js.native
  
  var responseError: js.UndefOr[js.Function] = js.native
}
object IActionOpts {
  
  @scala.inline
  def apply(): IActionOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionOpts]
  }
  
  @scala.inline
  implicit class IActionOptsOps[Self <: IActionOpts] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: String): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    
    @scala.inline
    def setRequest(value: js.Function): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Function): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setResponseError(value: js.Function): Self = this.set("responseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseError: Self = this.set("responseError", js.undefined)
  }
}
