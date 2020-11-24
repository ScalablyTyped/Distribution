package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addr extends js.Object {
  
  var addr: js.Any = js.native
  
  var peer: js.Any = js.native
}
object Addr {
  
  @scala.inline
  def apply(addr: js.Any, peer: js.Any): Addr = {
    val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addr]
  }
  
  @scala.inline
  implicit class AddrOps[Self <: Addr] (val x: Self) extends AnyVal {
    
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
    def setAddr(value: js.Any): Self = this.set("addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeer(value: js.Any): Self = this.set("peer", value.asInstanceOf[js.Any])
  }
}
