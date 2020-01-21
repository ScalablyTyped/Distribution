package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestTestResult.jestTestResultStrings.passed
  - typings.jestTestResult.jestTestResultStrings.failed
  - typings.jestTestResult.jestTestResultStrings.skipped
  - typings.jestTestResult.jestTestResultStrings.pending
  - typings.jestTestResult.jestTestResultStrings.todo
  - typings.jestTestResult.jestTestResultStrings.disabled
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typings.jestTestResult.jestTestResultStrings.disabled = this.cast("disabled")
  @scala.inline
  def failed: typings.jestTestResult.jestTestResultStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typings.jestTestResult.jestTestResultStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typings.jestTestResult.jestTestResultStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typings.jestTestResult.jestTestResultStrings.skipped = this.cast("skipped")
  @scala.inline
  def todo: typings.jestTestResult.jestTestResultStrings.todo = this.cast("todo")
}

