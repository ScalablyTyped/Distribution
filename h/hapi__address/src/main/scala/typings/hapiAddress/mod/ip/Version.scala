package typings.hapiAddress.mod.ip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiAddress.hapiAddressStrings.ipv4
  - typings.hapiAddress.hapiAddressStrings.ipv6
  - typings.hapiAddress.hapiAddressStrings.ipvfuture
*/
trait Version extends js.Object

object Version {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ipv4: typings.hapiAddress.hapiAddressStrings.ipv4 = this.cast("ipv4")
  @scala.inline
  def ipv6: typings.hapiAddress.hapiAddressStrings.ipv6 = this.cast("ipv6")
  @scala.inline
  def ipvfuture: typings.hapiAddress.hapiAddressStrings.ipvfuture = this.cast("ipvfuture")
}

