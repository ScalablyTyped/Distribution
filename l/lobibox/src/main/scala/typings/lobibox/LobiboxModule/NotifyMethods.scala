package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyMethods extends js.Object {
  
  var remove: js.UndefOr[js.Function0[_]] = js.native
}
object NotifyMethods {
  
  @scala.inline
  def apply(): NotifyMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyMethods]
  }
  
  @scala.inline
  implicit class NotifyMethodsOps[Self <: NotifyMethods] (val x: Self) extends AnyVal {
    
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
    def setRemove(value: () => _): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
}
