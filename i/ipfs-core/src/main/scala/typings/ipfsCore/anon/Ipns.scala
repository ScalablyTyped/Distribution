package typings.ipfsCore.anon

import typings.ipfsCore.initMod.ConstructorOptions
import typings.ipfsCore.ipnsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ipns extends js.Object {
  
  var ipns: ^ = js.native
  
  var options: ConstructorOptions[_, _] = js.native
}
object Ipns {
  
  @scala.inline
  def apply(ipns: ^, options: ConstructorOptions[_, _]): Ipns = {
    val __obj = js.Dynamic.literal(ipns = ipns.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipns]
  }
  
  @scala.inline
  implicit class IpnsOps[Self <: Ipns] (val x: Self) extends AnyVal {
    
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
    def setIpns(value: ^): Self = this.set("ipns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ConstructorOptions[_, _]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
