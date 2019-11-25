package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiJoi.atHapiJoiStrings.optional
  - typings.atHapiJoi.atHapiJoiStrings.required
  - typings.atHapiJoi.atHapiJoiStrings.forbidden
*/
trait PresenceMode extends js.Object

object PresenceMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typings.atHapiJoi.atHapiJoiStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def optional: typings.atHapiJoi.atHapiJoiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typings.atHapiJoi.atHapiJoiStrings.required = this.cast("required")
}

