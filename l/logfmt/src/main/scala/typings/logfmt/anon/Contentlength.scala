package typings.logfmt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contentlength extends js.Object {
  
  var content_length: js.UndefOr[String] = js.native
  
  var content_type: js.UndefOr[String] = js.native
  
  var ip: String = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var request_id: js.UndefOr[String] = js.native
  
  var status: Double = js.native
  
  var time: String = js.native
}
object Contentlength {
  
  @scala.inline
  def apply(ip: String, method: String, path: String, status: Double, time: String): Contentlength = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentlength]
  }
  
  @scala.inline
  implicit class ContentlengthOps[Self <: Contentlength] (val x: Self) extends AnyVal {
    
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
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_length(value: String): Self = this.set("content_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_length: Self = this.set("content_length", js.undefined)
    
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_id: Self = this.set("request_id", js.undefined)
  }
}
