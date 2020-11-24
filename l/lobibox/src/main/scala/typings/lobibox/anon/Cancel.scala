package typings.lobibox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends js.Object {
  
  var cancel: js.UndefOr[Class] = js.native
  
  var no: js.UndefOr[Class] = js.native
  
  var ok: js.UndefOr[Class] = js.native
  
  var yes: js.UndefOr[Class] = js.native
}
object Cancel {
  
  @scala.inline
  def apply(): Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Class): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setNo(value: Class): Self = this.set("no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo: Self = this.set("no", js.undefined)
    
    @scala.inline
    def setOk(value: Class): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
    
    @scala.inline
    def setYes(value: Class): Self = this.set("yes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYes: Self = this.set("yes", js.undefined)
  }
}
