package typings.ip.ipMod

import typings.ip.ipStrings.`private`
import typings.ip.ipStrings.ipv4
import typings.ip.ipStrings.ipv6
import typings.ip.ipStrings.public
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def address(): String = js.native
  def address(name: String): String = js.native
  def address(name: `private`, family: ipv4): String = js.native
  def address(name: `private`, family: ipv6): String = js.native
  def address(name: public, family: ipv4): String = js.native
  def address(name: public, family: ipv6): String = js.native
  @JSName("address")
  def address_ipv4(name: String, family: ipv4): String = js.native
  @JSName("address")
  def address_ipv6(name: String, family: ipv6): String = js.native
  @JSName("address")
  def address_private(name: `private`): String = js.native
  @JSName("address")
  def address_public(name: public): String = js.native
  def cidr(cidr: String): String = js.native
  def cidrSubnet(cidr: String): SubnetInfo = js.native
  def fromLong(ip: Double): String = js.native
  def fromPrefixLen(prefixLength: Double): String = js.native
  @JSName("fromPrefixLen")
  def fromPrefixLen_ipv4(prefixLength: Double, family: ipv4): String = js.native
  @JSName("fromPrefixLen")
  def fromPrefixLen_ipv6(prefixLength: Double, family: ipv6): String = js.native
  def isEqual(ip1: String, ip2: String): Boolean = js.native
  def isLoopback(ip: String): Boolean = js.native
  def isPrivate(ip: String): Boolean = js.native
  def isPublic(ip: String): Boolean = js.native
  def isV4Format(ip: String): Boolean = js.native
  def isV6Format(ip: String): Boolean = js.native
  def loopback(): String = js.native
  @JSName("loopback")
  def loopback_ipv4(family: ipv4): String = js.native
  @JSName("loopback")
  def loopback_ipv6(family: ipv6): String = js.native
  def mask(ip: String, mask: String): String = js.native
  def not(ip: String): String = js.native
  def or(ip: String, mask: String): String = js.native
  def subnet(ip: String, subnet: String): SubnetInfo = js.native
  def toBuffer(ip: String): Buffer = js.native
  def toBuffer(ip: String, buffer: Buffer): Buffer = js.native
  def toBuffer(ip: String, buffer: Buffer, offset: Double): Buffer = js.native
  def toLong(ip: String): Double = js.native
  def toString(ip: Buffer): String = js.native
  def toString(ip: Buffer, offset: Double): String = js.native
  def toString(ip: Buffer, offset: Double, length: Double): String = js.native
}

