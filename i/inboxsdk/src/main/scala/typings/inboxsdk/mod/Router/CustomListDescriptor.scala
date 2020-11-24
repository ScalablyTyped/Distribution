package typings.inboxsdk.mod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomListDescriptor extends js.Object {
  
  var hasMore: js.UndefOr[Boolean] = js.native
  
  var threads: js.Array[ThreadDescriptor | String] = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object CustomListDescriptor {
  
  @scala.inline
  def apply(threads: js.Array[ThreadDescriptor | String]): CustomListDescriptor = {
    val __obj = js.Dynamic.literal(threads = threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomListDescriptor]
  }
  
  @scala.inline
  implicit class CustomListDescriptorOps[Self <: CustomListDescriptor] (val x: Self) extends AnyVal {
    
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
    def setThreadsVarargs(value: (ThreadDescriptor | String)*): Self = this.set("threads", js.Array(value :_*))
    
    @scala.inline
    def setThreads(value: js.Array[ThreadDescriptor | String]): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMore(value: Boolean): Self = this.set("hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMore: Self = this.set("hasMore", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
