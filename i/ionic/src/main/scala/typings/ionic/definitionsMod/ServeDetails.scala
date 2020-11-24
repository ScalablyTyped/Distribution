package typings.ionic.definitionsMod

import typings.ionicUtilsNetwork.mod.NetworkInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServeDetails extends js.Object {
  
  var custom: Boolean = js.native
  
  var externalAddress: String = js.native
  
  var externalNetworkInterfaces: js.Array[NetworkInterface] = js.native
  
  var externallyAccessible: Boolean = js.native
  
  var localAddress: String = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
}
object ServeDetails {
  
  @scala.inline
  def apply(
    custom: Boolean,
    externalAddress: String,
    externalNetworkInterfaces: js.Array[NetworkInterface],
    externallyAccessible: Boolean,
    localAddress: String,
    port: Double,
    protocol: String
  ): ServeDetails = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], externalAddress = externalAddress.asInstanceOf[js.Any], externalNetworkInterfaces = externalNetworkInterfaces.asInstanceOf[js.Any], externallyAccessible = externallyAccessible.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeDetails]
  }
  
  @scala.inline
  implicit class ServeDetailsOps[Self <: ServeDetails] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAddress(value: String): Self = this.set("externalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalNetworkInterfacesVarargs(value: NetworkInterface*): Self = this.set("externalNetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setExternalNetworkInterfaces(value: js.Array[NetworkInterface]): Self = this.set("externalNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternallyAccessible(value: Boolean): Self = this.set("externallyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
}
