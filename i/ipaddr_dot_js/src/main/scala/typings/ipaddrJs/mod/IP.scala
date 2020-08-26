package typings.ipaddrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Common methods/properties for IPv4 and IPv6 classes.
@js.native
trait IP extends js.Object {
  def prefixLengthFromSubnetMask(): Double | Null = js.native
  def toByteArray(): js.Array[Double] = js.native
  def toNormalizedString(): String = js.native
}

object IP {
  @scala.inline
  def apply(
    prefixLengthFromSubnetMask: () => Double | Null,
    toByteArray: () => js.Array[Double],
    toNormalizedString: () => String
  ): IP = {
    val __obj = js.Dynamic.literal(prefixLengthFromSubnetMask = js.Any.fromFunction0(prefixLengthFromSubnetMask), toByteArray = js.Any.fromFunction0(toByteArray), toNormalizedString = js.Any.fromFunction0(toNormalizedString))
    __obj.asInstanceOf[IP]
  }
  @scala.inline
  implicit class IPOps[Self <: IP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefixLengthFromSubnetMask(value: () => Double | Null): Self = this.set("prefixLengthFromSubnetMask", js.Any.fromFunction0(value))
    @scala.inline
    def setToByteArray(value: () => js.Array[Double]): Self = this.set("toByteArray", js.Any.fromFunction0(value))
    @scala.inline
    def setToNormalizedString(value: () => String): Self = this.set("toNormalizedString", js.Any.fromFunction0(value))
  }
  
}

