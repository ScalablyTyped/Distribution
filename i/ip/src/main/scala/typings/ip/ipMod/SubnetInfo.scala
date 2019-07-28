package typings.ip.ipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetInfo extends js.Object {
  var broadcastAddress: String
  var firstAddress: String
  var lastAddress: String
  var length: Double
  var networkAddress: String
  var numHosts: Double
  var subnetMask: String
  var subnetMaskLength: Double
  def contains(ip: String): Boolean
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
    val __obj = js.Dynamic.literal(broadcastAddress = broadcastAddress, contains = js.Any.fromFunction1(contains), firstAddress = firstAddress, lastAddress = lastAddress, length = length, networkAddress = networkAddress, numHosts = numHosts, subnetMask = subnetMask, subnetMaskLength = subnetMaskLength)
  
    __obj.asInstanceOf[SubnetInfo]
  }
}

