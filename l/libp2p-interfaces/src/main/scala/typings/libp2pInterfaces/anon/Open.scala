package typings.libp2pInterfaces.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Open extends js.Object {
  
  var open: String = js.native
  
  var upgraded: String = js.native
}
object Open {
  
  @scala.inline
  def apply(open: String, upgraded: String): Open = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], upgraded = upgraded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit class OpenOps[Self <: Open] (val x: Self) extends AnyVal {
    
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
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgraded(value: String): Self = this.set("upgraded", value.asInstanceOf[js.Any])
  }
}
