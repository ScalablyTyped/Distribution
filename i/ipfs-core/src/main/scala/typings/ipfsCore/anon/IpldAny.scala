package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpldAny extends js.Object {
  
  var ipld: js.Any = js.native
  
  var preload: js.Any = js.native
}
object IpldAny {
  
  @scala.inline
  def apply(ipld: js.Any, preload: js.Any): IpldAny = {
    val __obj = js.Dynamic.literal(ipld = ipld.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpldAny]
  }
  
  @scala.inline
  implicit class IpldAnyOps[Self <: IpldAny] (val x: Self) extends AnyVal {
    
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
    def setIpld(value: js.Any): Self = this.set("ipld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreload(value: js.Any): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
