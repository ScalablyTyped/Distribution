package typings.instagramPrivateApi.directThreadBroadcastOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExistingThreadOptions extends js.Object {
  
  var threadIds: (js.Array[String | Double]) | String | Double = js.native
}
object ExistingThreadOptions {
  
  @scala.inline
  def apply(threadIds: (js.Array[String | Double]) | String | Double): ExistingThreadOptions = {
    val __obj = js.Dynamic.literal(threadIds = threadIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingThreadOptions]
  }
  
  @scala.inline
  implicit class ExistingThreadOptionsOps[Self <: ExistingThreadOptions] (val x: Self) extends AnyVal {
    
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
    def setThreadIdsVarargs(value: (String | Double)*): Self = this.set("threadIds", js.Array(value :_*))
    
    @scala.inline
    def setThreadIds(value: (js.Array[String | Double]) | String | Double): Self = this.set("threadIds", value.asInstanceOf[js.Any])
  }
}
