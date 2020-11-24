package typings.ipfsCore.anon

import typings.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddrsArray extends js.Object {
  
  var addrs: js.Array[^] = js.native
  
  var id: typings.cids.mod.^ = js.native
}
object AddrsArray {
  
  @scala.inline
  def apply(addrs: js.Array[^], id: typings.cids.mod.^): AddrsArray = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddrsArray]
  }
  
  @scala.inline
  implicit class AddrsArrayOps[Self <: AddrsArray] (val x: Self) extends AnyVal {
    
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
    def setAddrsVarargs(value: ^ *): Self = this.set("addrs", js.Array(value :_*))
    
    @scala.inline
    def setAddrs(value: js.Array[^]): Self = this.set("addrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: typings.cids.mod.^): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
