package typings.hapiAddress.mod.ip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiAddress.hapiAddressStrings.optional
  - typings.hapiAddress.hapiAddressStrings.required
  - typings.hapiAddress.hapiAddressStrings.forbidden
*/
trait Cidr extends js.Object

object Cidr {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typings.hapiAddress.hapiAddressStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def optional: typings.hapiAddress.hapiAddressStrings.optional = this.cast("optional")
  @scala.inline
  def required: typings.hapiAddress.hapiAddressStrings.required = this.cast("required")
}

