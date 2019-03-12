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

object IP {
  @scala.inline
  def apply(
    prefixLengthFromSubnetMask: () => scala.Double | ipaddrDotJsLib.ipaddrDotJsLibNumbers.`false`,
    toByteArray: () => js.Array[scala.Double],
    toNormalizedString: () => java.lang.String,
    toString: () => java.lang.String
  ): IP = {
    val __obj = js.Dynamic.literal(prefixLengthFromSubnetMask = js.Any.fromFunction0(prefixLengthFromSubnetMask), toByteArray = js.Any.fromFunction0(toByteArray), toNormalizedString = js.Any.fromFunction0(toNormalizedString), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[IP]
  }
}

