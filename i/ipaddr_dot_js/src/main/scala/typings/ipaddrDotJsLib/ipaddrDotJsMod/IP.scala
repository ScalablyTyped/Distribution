package typings
package ipaddrDotJsLib.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common methods/properties for IPv4 and IPv6 classes.

trait IP extends js.Object {
  def prefixLengthFromSubnetMask(): scala.Double | ipaddrDotJsLib.ipaddrDotJsLibNumbers.`false`
  def toByteArray(): js.Array[scala.Double]
  def toNormalizedString(): java.lang.String
}

