package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.knuddelsUserappsApiStrings.GET
import typings.knuddelsUserappsApi.knuddelsUserappsApiStrings.POST
import typings.knuddelsUserappsApi.mod.global.ExternalServerResponse
import typings.knuddelsUserappsApi.mod.global.Json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method extends js.Object {
  
  var data: js.UndefOr[Json] = js.native
  
  var method: js.UndefOr[GET | POST] = js.native
  
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
  
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.native
}
object Method {
  
  @scala.inline
  def apply(): Method = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
    
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
    def setData(value: Json): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOnFailure(value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit): Self = this.set("onFailure", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
}
