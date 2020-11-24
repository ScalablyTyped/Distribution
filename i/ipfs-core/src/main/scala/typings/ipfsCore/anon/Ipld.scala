package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.IPLD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ipld extends js.Object {
  
  var ipld: IPLD = js.native
  
  var preload: typings.ipfsCore.componentsMod.Preload = js.native
}
object Ipld {
  
  @scala.inline
  def apply(ipld: IPLD, preload: typings.ipfsCore.componentsMod.Preload): Ipld = {
    val __obj = js.Dynamic.literal(ipld = ipld.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipld]
  }
  
  @scala.inline
  implicit class IpldOps[Self <: Ipld] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setPreload(value: typings.ipfsCore.componentsMod.Preload): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
