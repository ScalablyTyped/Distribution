package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Persistent extends js.Object {
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var suppressRebuildEvent: js.UndefOr[Boolean] = js.native
}
object Persistent {
  
  @scala.inline
  def apply(): Persistent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Persistent]
  }
  
  @scala.inline
  implicit class PersistentOps[Self <: Persistent] (val x: Self) extends AnyVal {
    
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
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    
    @scala.inline
    def setSuppressRebuildEvent(value: Boolean): Self = this.set("suppressRebuildEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressRebuildEvent: Self = this.set("suppressRebuildEvent", js.undefined)
  }
}
