package typings.ipfsCore.pinAddAllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSettings extends js.Object {
  
  var lock: js.UndefOr[Boolean] = js.native
}
object AddSettings {
  
  @scala.inline
  def apply(): AddSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSettings]
  }
  
  @scala.inline
  implicit class AddSettingsOps[Self <: AddSettings] (val x: Self) extends AnyVal {
    
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
    def setLock(value: Boolean): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
  }
}
