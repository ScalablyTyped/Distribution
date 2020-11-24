package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.IPLD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpldIPLD extends js.Object {
  
  var ipld: IPLD = js.native
}
object IpldIPLD {
  
  @scala.inline
  def apply(ipld: IPLD): IpldIPLD = {
    val __obj = js.Dynamic.literal(ipld = ipld.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpldIPLD]
  }
  
  @scala.inline
  implicit class IpldIPLDOps[Self <: IpldIPLD] (val x: Self) extends AnyVal {
    
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
    def setIpld(value: IPLD): Self = this.set("ipld", value.asInstanceOf[js.Any])
  }
}
