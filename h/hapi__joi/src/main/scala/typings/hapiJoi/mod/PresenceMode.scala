package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiJoi.hapiJoiStrings.optional
  - typings.hapiJoi.hapiJoiStrings.required
  - typings.hapiJoi.hapiJoiStrings.forbidden
*/
trait PresenceMode extends js.Object

object PresenceMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typings.hapiJoi.hapiJoiStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def optional: typings.hapiJoi.hapiJoiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typings.hapiJoi.hapiJoiStrings.required = this.cast("required")
}

