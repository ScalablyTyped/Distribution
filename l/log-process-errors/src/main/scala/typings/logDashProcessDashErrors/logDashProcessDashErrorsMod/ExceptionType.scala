package typings.logDashProcessDashErrors.logDashProcessDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.uncaughtException
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.unhandledRejection
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.rejectionHandled
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.multipleResolves
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.warning
*/
trait ExceptionType extends js.Object

object ExceptionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multipleResolves: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.multipleResolves = this.cast("multipleResolves")
  @scala.inline
  def rejectionHandled: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.rejectionHandled = this.cast("rejectionHandled")
  @scala.inline
  def uncaughtException: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.uncaughtException = this.cast("uncaughtException")
  @scala.inline
  def unhandledRejection: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.unhandledRejection = this.cast("unhandledRejection")
  @scala.inline
  def warning: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.warning = this.cast("warning")
}

