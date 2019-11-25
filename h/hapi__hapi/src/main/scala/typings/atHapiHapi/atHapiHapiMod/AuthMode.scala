package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiHapi.atHapiHapiStrings.required
  - typings.atHapiHapi.atHapiHapiStrings.optional
  - typings.atHapiHapi.atHapiHapiStrings.`try`
*/
trait AuthMode extends js.Object

object AuthMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typings.atHapiHapi.atHapiHapiStrings.optional = this.cast("optional")
  @scala.inline
  def required: typings.atHapiHapi.atHapiHapiStrings.required = this.cast("required")
  @scala.inline
  def `try`: typings.atHapiHapi.atHapiHapiStrings.`try` = this.cast("try")
}

