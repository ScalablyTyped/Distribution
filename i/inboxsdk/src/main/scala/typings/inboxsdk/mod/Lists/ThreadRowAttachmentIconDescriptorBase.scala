package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowAttachmentIconDescriptorBase extends js.Object {
  
  var tooltip: js.UndefOr[String] = js.native
}
object ThreadRowAttachmentIconDescriptorBase {
  
  @scala.inline
  def apply(): ThreadRowAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptorBase]
  }
  
  @scala.inline
  implicit class ThreadRowAttachmentIconDescriptorBaseOps[Self <: ThreadRowAttachmentIconDescriptorBase] (val x: Self) extends AnyVal {
    
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
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
