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
    prefixLengthFromSubnetMask: js.Function0[scala.Double | ipaddrDotJsLib.ipaddrDotJsLibNumbers.`false`],
    toByteArray: js.Function0[js.Array[scala.Double]],
    toNormalizedString: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String]
  ): IP = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prefixLengthFromSubnetMask")(prefixLengthFromSubnetMask)
    __obj.updateDynamic("toByteArray")(toByteArray)
    __obj.updateDynamic("toNormalizedString")(toNormalizedString)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[IP]
  }
}

