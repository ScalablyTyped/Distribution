package typings.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.handlebars.handlebarsStrings.helperMissing
  - typings.handlebars.handlebarsStrings.blockHelperMissing
  - typings.handlebars.handlebarsStrings.each
  - typings.handlebars.handlebarsStrings.`if`
  - typings.handlebars.handlebarsStrings.unless
  - typings.handlebars.handlebarsStrings.`with`
  - typings.handlebars.handlebarsStrings.log
  - typings.handlebars.handlebarsStrings.lookup
*/
trait BuiltinHelperName extends js.Object

object BuiltinHelperName {
  @scala.inline
  def blockHelperMissing: typings.handlebars.handlebarsStrings.blockHelperMissing = this.cast("blockHelperMissing")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def each: typings.handlebars.handlebarsStrings.each = this.cast("each")
  @scala.inline
  def helperMissing: typings.handlebars.handlebarsStrings.helperMissing = this.cast("helperMissing")
  @scala.inline
  def `if`: typings.handlebars.handlebarsStrings.`if` = this.cast("if")
  @scala.inline
  def log: typings.handlebars.handlebarsStrings.log = this.cast("log")
  @scala.inline
  def lookup: typings.handlebars.handlebarsStrings.lookup = this.cast("lookup")
  @scala.inline
  def unless: typings.handlebars.handlebarsStrings.unless = this.cast("unless")
  @scala.inline
  def `with`: typings.handlebars.handlebarsStrings.`with` = this.cast("with")
}

