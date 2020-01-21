package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings.required
  - typings.hapiHapi.hapiHapiStrings.optional
  - typings.hapiHapi.hapiHapiStrings.`try`
*/
trait AuthMode extends js.Object

object AuthMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typings.hapiHapi.hapiHapiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typings.hapiHapi.hapiHapiStrings.required = this.cast("required")
  @scala.inline
  def `try`: typings.hapiHapi.hapiHapiStrings.`try` = this.cast("try")
}

