package typings
package ipLib.ipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetInfo extends js.Object {
  var broadcastAddress: java.lang.String
  var firstAddress: java.lang.String
  var lastAddress: java.lang.String
  var length: scala.Double
  var networkAddress: java.lang.String
  var numHosts: scala.Double
  var subnetMask: java.lang.String
  var subnetMaskLength: scala.Double
  def contains(ip: java.lang.String): scala.Boolean
}

object SubnetInfo {
  @scala.inline
  def apply(
    broadcastAddress: java.lang.String,
    contains: js.Function1[java.lang.String, scala.Boolean],
    firstAddress: java.lang.String,
    lastAddress: java.lang.String,
    length: scala.Double,
    networkAddress: java.lang.String,
    numHosts: scala.Double,
    subnetMask: java.lang.String,
    subnetMaskLength: scala.Double
  ): SubnetInfo = {
    val __obj = js.Dynamic.literal(broadcastAddress = broadcastAddress, contains = contains, firstAddress = firstAddress, lastAddress = lastAddress, length = length, networkAddress = networkAddress, numHosts = numHosts, subnetMask = subnetMask, subnetMaskLength = subnetMaskLength)
  
    __obj.asInstanceOf[SubnetInfo]
  }
}

