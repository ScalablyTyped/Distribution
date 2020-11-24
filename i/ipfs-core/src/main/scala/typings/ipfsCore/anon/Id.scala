package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.dhtMod.Multiaddr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends js.Object {
  
  var addrs: js.Array[Multiaddr] = js.native
  
  var id: ^ = js.native
}
object Id {
  
  @scala.inline
  def apply(addrs: js.Array[Multiaddr], id: ^): Id = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    
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
    def setAddrsVarargs(value: Multiaddr*): Self = this.set("addrs", js.Array(value :_*))
    
    @scala.inline
    def setAddrs(value: js.Array[Multiaddr]): Self = this.set("addrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ^): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
