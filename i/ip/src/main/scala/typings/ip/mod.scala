package typings.ip

import typings.ip.ipStrings.`private`
import typings.ip.ipStrings.ipv4
import typings.ip.ipStrings.ipv6
import typings.ip.ipStrings.public
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip", "address")
  @js.native
  def address(): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address(name: String): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address(name: `private`, family: ipv4): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address(name: `private`, family: ipv6): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address(name: public, family: ipv4): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address(name: public, family: ipv6): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address_ipv4(name: js.UndefOr[scala.Nothing], family: ipv4): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address_ipv4(name: String, family: ipv4): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address_ipv6(name: js.UndefOr[scala.Nothing], family: ipv6): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address_ipv6(name: String, family: ipv6): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address_private(name: `private`): String = js.native
  @JSImport("ip", "address")
  @js.native
  def address_public(name: public): String = js.native
  
  @JSImport("ip", "cidr")
  @js.native
  def cidr(cidr: String): String = js.native
  
  @JSImport("ip", "cidrSubnet")
  @js.native
  def cidrSubnet(cidr: String): SubnetInfo = js.native
  
  @JSImport("ip", "fromLong")
  @js.native
  def fromLong(ip: Double): String = js.native
  
  @JSImport("ip", "fromPrefixLen")
  @js.native
  def fromPrefixLen(prefixLength: Double): String = js.native
  @JSImport("ip", "fromPrefixLen")
  @js.native
  def fromPrefixLen_ipv4(prefixLength: Double, family: ipv4): String = js.native
  @JSImport("ip", "fromPrefixLen")
  @js.native
  def fromPrefixLen_ipv6(prefixLength: Double, family: ipv6): String = js.native
  
  @JSImport("ip", "isEqual")
  @js.native
  def isEqual(ip1: String, ip2: String): Boolean = js.native
  
  @JSImport("ip", "isLoopback")
  @js.native
  def isLoopback(ip: String): Boolean = js.native
  
  @JSImport("ip", "isPrivate")
  @js.native
  def isPrivate(ip: String): Boolean = js.native
  
  @JSImport("ip", "isPublic")
  @js.native
  def isPublic(ip: String): Boolean = js.native
  
  @JSImport("ip", "isV4Format")
  @js.native
  def isV4Format(ip: String): Boolean = js.native
  
  @JSImport("ip", "isV6Format")
  @js.native
  def isV6Format(ip: String): Boolean = js.native
  
  @JSImport("ip", "loopback")
  @js.native
  def loopback(): String = js.native
  @JSImport("ip", "loopback")
  @js.native
  def loopback_ipv4(family: ipv4): String = js.native
  @JSImport("ip", "loopback")
  @js.native
  def loopback_ipv6(family: ipv6): String = js.native
  
  @JSImport("ip", "mask")
  @js.native
  def mask(ip: String, mask: String): String = js.native
  
  @JSImport("ip", "not")
  @js.native
  def not(ip: String): String = js.native
  
  @JSImport("ip", "or")
  @js.native
  def or(ip: String, mask: String): String = js.native
  
  @JSImport("ip", "subnet")
  @js.native
  def subnet(ip: String, subnet: String): SubnetInfo = js.native
  
  @JSImport("ip", "toBuffer")
  @js.native
  def toBuffer(ip: String): Buffer = js.native
  @JSImport("ip", "toBuffer")
  @js.native
  def toBuffer(ip: String, buffer: js.UndefOr[scala.Nothing], offset: Double): Buffer = js.native
  @JSImport("ip", "toBuffer")
  @js.native
  def toBuffer(ip: String, buffer: Buffer): Buffer = js.native
  @JSImport("ip", "toBuffer")
  @js.native
  def toBuffer(ip: String, buffer: Buffer, offset: Double): Buffer = js.native
  
  @JSImport("ip", "toLong")
  @js.native
  def toLong(ip: String): Double = js.native
  
  @JSImport("ip", "toString")
  @js.native
  def toString_(ip: Buffer): String = js.native
  @JSImport("ip", "toString")
  @js.native
  def toString_(ip: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): String = js.native
  @JSImport("ip", "toString")
  @js.native
  def toString_(ip: Buffer, offset: Double): String = js.native
  @JSImport("ip", "toString")
  @js.native
  def toString_(ip: Buffer, offset: Double, length: Double): String = js.native
  
  @js.native
  trait SubnetInfo extends StObject {
    
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
    implicit class SubnetInfoMutableBuilder[Self <: SubnetInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcastAddress(value: String): Self = StObject.set(x, "broadcastAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFirstAddress(value: String): Self = StObject.set(x, "firstAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastAddress(value: String): Self = StObject.set(x, "lastAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkAddress(value: String): Self = StObject.set(x, "networkAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumHosts(value: Double): Self = StObject.set(x, "numHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetMaskLength(value: Double): Self = StObject.set(x, "subnetMaskLength", value.asInstanceOf[js.Any])
    }
  }
}
