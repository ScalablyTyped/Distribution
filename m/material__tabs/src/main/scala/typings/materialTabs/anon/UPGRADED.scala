package typings.materialTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UPGRADED extends js.Object {
  
  var UPGRADED: String = js.native
}
object UPGRADED {
  
  @scala.inline
  def apply(UPGRADED: String): UPGRADED = {
    val __obj = js.Dynamic.literal(UPGRADED = UPGRADED.asInstanceOf[js.Any])
    __obj.asInstanceOf[UPGRADED]
  }
  
  @scala.inline
  implicit class UPGRADEDOps[Self <: UPGRADED] (val x: Self) extends AnyVal {
    
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
    def setUPGRADED(value: String): Self = this.set("UPGRADED", value.asInstanceOf[js.Any])
  }
}
