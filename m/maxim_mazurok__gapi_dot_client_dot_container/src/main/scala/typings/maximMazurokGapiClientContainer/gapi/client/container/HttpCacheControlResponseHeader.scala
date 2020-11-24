package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpCacheControlResponseHeader extends js.Object {
  
  /** 14.6 response cache age, in seconds since the response is generated */
  var age: js.UndefOr[String] = js.native
  
  /** 14.9 request and response directives */
  var directive: js.UndefOr[String] = js.native
  
  /** 14.21 response cache expires, in RFC 1123 date format */
  var expires: js.UndefOr[String] = js.native
}
object HttpCacheControlResponseHeader {
  
  @scala.inline
  def apply(): HttpCacheControlResponseHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCacheControlResponseHeader]
  }
  
  @scala.inline
  implicit class HttpCacheControlResponseHeaderOps[Self <: HttpCacheControlResponseHeader] (val x: Self) extends AnyVal {
    
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
    def setAge(value: String): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    
    @scala.inline
    def setDirective(value: String): Self = this.set("directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirective: Self = this.set("directive", js.undefined)
    
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
  }
}
