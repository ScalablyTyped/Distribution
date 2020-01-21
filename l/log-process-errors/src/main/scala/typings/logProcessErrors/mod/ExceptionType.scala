package typings.logProcessErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.logProcessErrors.logProcessErrorsStrings.uncaughtException
  - typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection
  - typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled
  - typings.logProcessErrors.logProcessErrorsStrings.multipleResolves
  - typings.logProcessErrors.logProcessErrorsStrings.warning
*/
trait ExceptionType extends js.Object

object ExceptionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multipleResolves: typings.logProcessErrors.logProcessErrorsStrings.multipleResolves = this.cast("multipleResolves")
  @scala.inline
  def rejectionHandled: typings.logProcessErrors.logProcessErrorsStrings.rejectionHandled = this.cast("rejectionHandled")
  @scala.inline
  def uncaughtException: typings.logProcessErrors.logProcessErrorsStrings.uncaughtException = this.cast("uncaughtException")
  @scala.inline
  def unhandledRejection: typings.logProcessErrors.logProcessErrorsStrings.unhandledRejection = this.cast("unhandledRejection")
  @scala.inline
  def warning: typings.logProcessErrors.logProcessErrorsStrings.warning = this.cast("warning")
}

