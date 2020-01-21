package typings.ip.mod

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
    val __obj = js.Dynamic.literal(broadcastAddress = broadcastAddress.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), firstAddress = firstAddress.asInstanceOf[js.Any], lastAddress = lastAddress.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], networkAddress = networkAddress.asInstanceOf[js.Any], numHosts = numHosts.asInstanceOf[js.Any], subnetMask = subnetMask.asInstanceOf[js.Any], subnetMaskLength = subnetMaskLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubnetInfo]
  }
}

