package typings.historyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashChange extends js.Object {
  
  var hashChange: js.UndefOr[js.Any] = js.native
  
  var pushState: js.UndefOr[js.Any] = js.native
}
object HashChange {
  
  @scala.inline
  def apply(): HashChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashChange]
  }
  
  @scala.inline
  implicit class HashChangeOps[Self <: HashChange] (val x: Self) extends AnyVal {
    
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
    def setHashChange(value: js.Any): Self = this.set("hashChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashChange: Self = this.set("hashChange", js.undefined)
    
    @scala.inline
    def setPushState(value: js.Any): Self = this.set("pushState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushState: Self = this.set("pushState", js.undefined)
  }
}
