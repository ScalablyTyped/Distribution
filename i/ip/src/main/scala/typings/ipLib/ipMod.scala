package typings
package ipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip", JSImport.Namespace)
@js.native
object ipMod extends js.Object {
  def address(): java.lang.String = js.native
  def address(name: java.lang.String): java.lang.String = js.native
  def address(name: java.lang.String, family: java.lang.String): java.lang.String = js.native
  def cidr(cidr: java.lang.String): java.lang.String = js.native
  def cidrSubnet(cidr: java.lang.String): ipLib.SubnetInfo = js.native
  def fromLong(ip: scala.Double): java.lang.String = js.native
  def fromPrefixLen(prefixLength: scala.Double): java.lang.String = js.native
  def fromPrefixLen(prefixLength: scala.Double, family: java.lang.String): java.lang.String = js.native
  def isEqual(ip1: java.lang.String, ip2: java.lang.String): scala.Boolean = js.native
  def isLoopback(ip: java.lang.String): scala.Boolean = js.native
  def isPrivate(ip: java.lang.String): scala.Boolean = js.native
  def isPublic(ip: java.lang.String): scala.Boolean = js.native
  def isV4Format(ip: java.lang.String): scala.Boolean = js.native
  def isV6Format(ip: java.lang.String): scala.Boolean = js.native
  def loopback(): java.lang.String = js.native
  def loopback(family: java.lang.String): java.lang.String = js.native
  def mask(ip: java.lang.String, mask: java.lang.String): java.lang.String = js.native
  def not(ip: java.lang.String): java.lang.String = js.native
  def or(ip: java.lang.String, mask: java.lang.String): java.lang.String = js.native
  def subnet(ip: java.lang.String, subnet: java.lang.String): ipLib.SubnetInfo = js.native
  def toBuffer(ip: java.lang.String): nodeLib.Buffer = js.native
  def toBuffer(ip: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def toBuffer(ip: java.lang.String, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  def toLong(ip: java.lang.String): scala.Double = js.native
  def toString(ip: nodeLib.Buffer): java.lang.String = js.native
  def toString(ip: nodeLib.Buffer, offset: scala.Double): java.lang.String = js.native
  def toString(ip: nodeLib.Buffer, offset: scala.Double, length: scala.Double): java.lang.String = js.native
}

