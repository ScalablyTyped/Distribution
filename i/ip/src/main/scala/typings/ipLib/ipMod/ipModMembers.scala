package typings
package ipLib.ipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip", JSImport.Namespace)
@js.native
object ipModMembers extends js.Object {
  def address(): java.lang.String = js.native
  def address(name: ipLib.ipLibStrings.`private`, family: ipLib.ipLibStrings.ipv4): java.lang.String = js.native
  def address(name: ipLib.ipLibStrings.`private`, family: ipLib.ipLibStrings.ipv6): java.lang.String = js.native
  def address(name: ipLib.ipLibStrings.public, family: ipLib.ipLibStrings.ipv4): java.lang.String = js.native
  def address(name: ipLib.ipLibStrings.public, family: ipLib.ipLibStrings.ipv6): java.lang.String = js.native
  def address(name: java.lang.String): java.lang.String = js.native
  @JSName("address")
  def address_ipv4(name: java.lang.String, family: ipLib.ipLibStrings.ipv4): java.lang.String = js.native
  @JSName("address")
  def address_ipv6(name: java.lang.String, family: ipLib.ipLibStrings.ipv6): java.lang.String = js.native
  @JSName("address")
  def address_private(name: ipLib.ipLibStrings.`private`): java.lang.String = js.native
  @JSName("address")
  def address_public(name: ipLib.ipLibStrings.public): java.lang.String = js.native
  def cidr(cidr: java.lang.String): java.lang.String = js.native
  def cidrSubnet(cidr: java.lang.String): SubnetInfo = js.native
  def fromLong(ip: scala.Double): java.lang.String = js.native
  def fromPrefixLen(prefixLength: scala.Double): java.lang.String = js.native
  @JSName("fromPrefixLen")
  def fromPrefixLen_ipv4(prefixLength: scala.Double, family: ipLib.ipLibStrings.ipv4): java.lang.String = js.native
  @JSName("fromPrefixLen")
  def fromPrefixLen_ipv6(prefixLength: scala.Double, family: ipLib.ipLibStrings.ipv6): java.lang.String = js.native
  def isEqual(ip1: java.lang.String, ip2: java.lang.String): scala.Boolean = js.native
  def isLoopback(ip: java.lang.String): scala.Boolean = js.native
  def isPrivate(ip: java.lang.String): scala.Boolean = js.native
  def isPublic(ip: java.lang.String): scala.Boolean = js.native
  def isV4Format(ip: java.lang.String): scala.Boolean = js.native
  def isV6Format(ip: java.lang.String): scala.Boolean = js.native
  def loopback(): java.lang.String = js.native
  @JSName("loopback")
  def loopback_ipv4(family: ipLib.ipLibStrings.ipv4): java.lang.String = js.native
  @JSName("loopback")
  def loopback_ipv6(family: ipLib.ipLibStrings.ipv6): java.lang.String = js.native
  def mask(ip: java.lang.String, mask: java.lang.String): java.lang.String = js.native
  def not(ip: java.lang.String): java.lang.String = js.native
  def or(ip: java.lang.String, mask: java.lang.String): java.lang.String = js.native
  def subnet(ip: java.lang.String, subnet: java.lang.String): SubnetInfo = js.native
  def toBuffer(ip: java.lang.String): nodeLib.Buffer = js.native
  def toBuffer(ip: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def toBuffer(ip: java.lang.String, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  def toLong(ip: java.lang.String): scala.Double = js.native
  def toString(ip: nodeLib.Buffer): java.lang.String = js.native
  def toString(ip: nodeLib.Buffer, offset: scala.Double): java.lang.String = js.native
  def toString(ip: nodeLib.Buffer, offset: scala.Double, length: scala.Double): java.lang.String = js.native
}

