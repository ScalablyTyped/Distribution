package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpnsFunc extends js.Object {
  
  var ipns: Func = js.native
}
object IpnsFunc {
  
  @scala.inline
  def apply(ipns: Func): IpnsFunc = {
    val __obj = js.Dynamic.literal(ipns = ipns.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpnsFunc]
  }
  
  @scala.inline
  implicit class IpnsFuncOps[Self <: IpnsFunc] (val x: Self) extends AnyVal {
    
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
    def setIpns(value: Func): Self = this.set("ipns", value.asInstanceOf[js.Any])
  }
}
