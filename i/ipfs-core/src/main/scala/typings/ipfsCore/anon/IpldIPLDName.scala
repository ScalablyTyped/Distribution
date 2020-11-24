package typings.ipfsCore.anon

import typings.ipfsCore.componentsMod.IPLD
import typings.ipfsCore.componentsMod.Name_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpldIPLDName extends js.Object {
  
  var ipld: IPLD = js.native
  
  var name: js.UndefOr[Name_] = js.native
}
object IpldIPLDName {
  
  @scala.inline
  def apply(ipld: IPLD): IpldIPLDName = {
    val __obj = js.Dynamic.literal(ipld = ipld.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpldIPLDName]
  }
  
  @scala.inline
  implicit class IpldIPLDNameOps[Self <: IpldIPLDName] (val x: Self) extends AnyVal {
    
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
    def setName(value: Name_): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
