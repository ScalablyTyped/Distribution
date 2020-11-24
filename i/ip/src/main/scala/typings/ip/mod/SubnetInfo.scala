package typings.ip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetInfo extends js.Object {
  
  var broadcastAddress: String = js.native
  
  def contains(ip: String): Boolean = js.native
  
  var firstAddress: String = js.native
  
  var lastAddress: String = js.native
  
  var length: Double = js.native
  
  var networkAddress: String = js.native
  
  var numHosts: Double = js.native
  
  var subnetMask: String = js.native
  
  var subnetMaskLength: Double = js.native
}
object SubnetInfo {
  
  @scala.inline
  def apply(
    broadcastAddress: String,
    contains: String => Boolean,
    firstAddress: String,
    lastAddress: String,
    length: Double,
    networkAddress: String,
    numHosts: Double,
    subnetMask: String,
    subnetMaskLength: Double
  ): SubnetInfo = {
    val __obj = js.Dynamic.literal(broadcastAddress = broadcastAddress.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), firstAddress = firstAddress.asInstanceOf[js.Any], lastAddress = lastAddress.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], networkAddress = networkAddress.asInstanceOf[js.Any], numHosts = numHosts.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any], subnetMaskLength = subnetMaskLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetInfo]
  }
  
  @scala.inline
  implicit class SubnetInfoOps[Self <: SubnetInfo] (val x: Self) extends AnyVal {
    
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
    def setBroadcastAddress(value: String): Self = this.set("broadcastAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: String => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstAddress(value: String): Self = this.set("firstAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAddress(value: String): Self = this.set("lastAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAddress(value: String): Self = this.set("networkAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumHosts(value: Double): Self = this.set("numHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMask(value: String): Self = this.set("subnetMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetMaskLength(value: Double): Self = this.set("subnetMaskLength", value.asInstanceOf[js.Any])
  }
}
