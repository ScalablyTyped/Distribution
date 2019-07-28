package typings.ipaddrDotJs.ipaddrDotJsMod

import typings.ipaddrDotJs.ipaddrDotJsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common methods/properties for IPv4 and IPv6 classes.
trait IP extends js.Object {
  def prefixLengthFromSubnetMask(): Double | `false`
  def toByteArray(): js.Array[Double]
  def toNormalizedString(): String
}

object IP {
  @scala.inline
  def apply(
    prefixLengthFromSubnetMask: () => Double | `false`,
    toByteArray: () => js.Array[Double],
    toNormalizedString: () => String,
    toString: () => String
  ): IP = {
    val __obj = js.Dynamic.literal(prefixLengthFromSubnetMask = js.Any.fromFunction0(prefixLengthFromSubnetMask), toByteArray = js.Any.fromFunction0(toByteArray), toNormalizedString = js.Any.fromFunction0(toNormalizedString), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[IP]
  }
}

