package typings.jsforce.httpApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpApiOptions extends js.Object {
  
  var noContentResponse: js.UndefOr[js.Object] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var transport: js.UndefOr[js.Object] = js.native
}
object HttpApiOptions {
  
  @scala.inline
  def apply(): HttpApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpApiOptions]
  }
  
  @scala.inline
  implicit class HttpApiOptionsOps[Self <: HttpApiOptions] (val x: Self) extends AnyVal {
    
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
    def setNoContentResponse(value: js.Object): Self = this.set("noContentResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoContentResponse: Self = this.set("noContentResponse", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setTransport(value: js.Object): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}
