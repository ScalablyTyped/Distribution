package typings.libratoNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestCountKey extends js.Object {
  
  var requestCountKey: js.UndefOr[String] = js.native
  
  var responseTimeKey: js.UndefOr[String] = js.native
  
  var statusCodeKey: js.UndefOr[String] = js.native
}
object RequestCountKey {
  
  @scala.inline
  def apply(): RequestCountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCountKey]
  }
  
  @scala.inline
  implicit class RequestCountKeyOps[Self <: RequestCountKey] (val x: Self) extends AnyVal {
    
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
    def setRequestCountKey(value: String): Self = this.set("requestCountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCountKey: Self = this.set("requestCountKey", js.undefined)
    
    @scala.inline
    def setResponseTimeKey(value: String): Self = this.set("responseTimeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTimeKey: Self = this.set("responseTimeKey", js.undefined)
    
    @scala.inline
    def setStatusCodeKey(value: String): Self = this.set("statusCodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCodeKey: Self = this.set("statusCodeKey", js.undefined)
  }
}
