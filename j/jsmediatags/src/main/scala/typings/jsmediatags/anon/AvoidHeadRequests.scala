package typings.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvoidHeadRequests extends js.Object {
  
  var avoidHeadRequests: Boolean = js.native
  
  var disallowedXhrHeaders: js.Array[String] = js.native
  
  var timeoutInSec: Double = js.native
}
object AvoidHeadRequests {
  
  @scala.inline
  def apply(avoidHeadRequests: Boolean, disallowedXhrHeaders: js.Array[String], timeoutInSec: Double): AvoidHeadRequests = {
    val __obj = js.Dynamic.literal(avoidHeadRequests = avoidHeadRequests.asInstanceOf[js.Any], disallowedXhrHeaders = disallowedXhrHeaders.asInstanceOf[js.Any], timeoutInSec = timeoutInSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvoidHeadRequests]
  }
  
  @scala.inline
  implicit class AvoidHeadRequestsOps[Self <: AvoidHeadRequests] (val x: Self) extends AnyVal {
    
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
    def setAvoidHeadRequests(value: Boolean): Self = this.set("avoidHeadRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowedXhrHeadersVarargs(value: String*): Self = this.set("disallowedXhrHeaders", js.Array(value :_*))
    
    @scala.inline
    def setDisallowedXhrHeaders(value: js.Array[String]): Self = this.set("disallowedXhrHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInSec(value: Double): Self = this.set("timeoutInSec", value.asInstanceOf[js.Any])
  }
}
