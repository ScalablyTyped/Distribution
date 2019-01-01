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

