package typings.ip

import typings.ip.ipStrings.`private`
import typings.ip.ipStrings.ipv4
import typings.ip.ipStrings.ipv6
import typings.ip.ipStrings.public
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def address(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("address")().asInstanceOf[String]
  inline def address(name: public | `private`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def address(name: public | `private`, family: ipv4 | ipv6): String = (^.asInstanceOf[js.Dynamic].applyDynamic("address")(name.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def address(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def address(name: String, family: ipv4 | ipv6): String = (^.asInstanceOf[js.Dynamic].applyDynamic("address")(name.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def address(name: Unit, family: ipv4 | ipv6): String = (^.asInstanceOf[js.Dynamic].applyDynamic("address")(name.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cidr(cidr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cidr")(cidr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cidrSubnet(cidr: String): SubnetInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cidrSubnet")(cidr.asInstanceOf[js.Any]).asInstanceOf[SubnetInfo]
  
  inline def fromLong(ip: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLong")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromPrefixLen(prefixLength: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrefixLen")(prefixLength.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromPrefixLen(prefixLength: Double, family: ipv4 | ipv6): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrefixLen")(prefixLength.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isEqual(ip1: String, ip2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(ip1.asInstanceOf[js.Any], ip2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLoopback(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoopback")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrivate(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPublic(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublic")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isV4Format(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV4Format")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isV6Format(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV6Format")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loopback(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loopback")().asInstanceOf[String]
  inline def loopback(family: ipv4 | ipv6): String = ^.asInstanceOf[js.Dynamic].applyDynamic("loopback")(family.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mask(ip: String, mask: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(ip.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def not(ip: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def or(ip: String, mask: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(ip.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def subnet(ip: String, subnet: String): SubnetInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("subnet")(ip.asInstanceOf[js.Any], subnet.asInstanceOf[js.Any])).asInstanceOf[SubnetInfo]
  
  inline def toBuffer(ip: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(ip.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(ip: String, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(ip.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def toBuffer(ip: String, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(ip.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def toBuffer(ip: String, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(ip.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def toLong(ip: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toLong")(ip.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toString_(ip: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(ip: Buffer, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(ip.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(ip: Buffer, offset: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(ip.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(ip: Buffer, offset: Unit, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(ip.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait SubnetInfo extends StObject {
    
    var broadcastAddress: String
    
    def contains(ip: String): Boolean
    
    var firstAddress: String
    
    var lastAddress: String
    
    var length: Double
    
    var networkAddress: String
    
    var numHosts: Double
    
    var subnetMask: String
    
    var subnetMaskLength: Double
  }
  object SubnetInfo {
    
    inline def apply(
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
    
    extension [Self <: SubnetInfo](x: Self) {
      
      inline def setBroadcastAddress(value: String): Self = StObject.set(x, "broadcastAddress", value.asInstanceOf[js.Any])
      
      inline def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setFirstAddress(value: String): Self = StObject.set(x, "firstAddress", value.asInstanceOf[js.Any])
      
      inline def setLastAddress(value: String): Self = StObject.set(x, "lastAddress", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setNetworkAddress(value: String): Self = StObject.set(x, "networkAddress", value.asInstanceOf[js.Any])
      
      inline def setNumHosts(value: Double): Self = StObject.set(x, "numHosts", value.asInstanceOf[js.Any])
      
      inline def setSubnetMask(value: String): Self = StObject.set(x, "subnetMask", value.asInstanceOf[js.Any])
      
      inline def setSubnetMaskLength(value: Double): Self = StObject.set(x, "subnetMaskLength", value.asInstanceOf[js.Any])
    }
  }
}
