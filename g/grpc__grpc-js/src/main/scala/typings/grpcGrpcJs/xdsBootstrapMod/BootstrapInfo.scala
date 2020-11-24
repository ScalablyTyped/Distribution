package typings.grpcGrpcJs.xdsBootstrapMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapInfo extends js.Object {
  
  var node: Node = js.native
  
  var xdsServers: js.Array[XdsServerConfig] = js.native
}
object BootstrapInfo {
  
  @scala.inline
  def apply(node: Node, xdsServers: js.Array[XdsServerConfig]): BootstrapInfo = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], xdsServers = xdsServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapInfo]
  }
  
  @scala.inline
  implicit class BootstrapInfoOps[Self <: BootstrapInfo] (val x: Self) extends AnyVal {
    
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
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXdsServersVarargs(value: XdsServerConfig*): Self = this.set("xdsServers", js.Array(value :_*))
    
    @scala.inline
    def setXdsServers(value: js.Array[XdsServerConfig]): Self = this.set("xdsServers", value.asInstanceOf[js.Any])
  }
}
