package typings.keepNetworkTbtcJs.electrumClientMod

import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.ssl
import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.tls
import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.ws
import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.wss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var options: js.UndefOr[js.Any] = js.native
  
  var port: Double = js.native
  
  var protocol: ssl | tls | ws | wss = js.native
  
  var server: String = js.native
}
object Config {
  
  @scala.inline
  def apply(port: Double, protocol: ssl | tls | ws | wss, server: String): Config = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: ssl | tls | ws | wss): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
