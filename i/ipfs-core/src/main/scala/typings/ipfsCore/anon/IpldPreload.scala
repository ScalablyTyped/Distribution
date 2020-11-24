package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpldPreload extends js.Object {
  
  var ipld: js.Any = js.native
  
  var preload: (js.Function0[Unit] with Start) | Call = js.native
}
object IpldPreload {
  
  @scala.inline
  def apply(ipld: js.Any, preload: (js.Function0[Unit] with Start) | Call): IpldPreload = {
    val __obj = js.Dynamic.literal(ipld = ipld.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpldPreload]
  }
  
  @scala.inline
  implicit class IpldPreloadOps[Self <: IpldPreload] (val x: Self) extends AnyVal {
    
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
    def setPreload(value: (js.Function0[Unit] with Start) | Call): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
}
