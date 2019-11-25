package typings.atJestTypes.buildConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJestTypes.atJestTypesStrings.always
  - typings.atJestTypes.atJestTypesStrings.failure
  - typings.atJestTypes.atJestTypesStrings.success
  - typings.atJestTypes.atJestTypesStrings.change
  - typings.atJestTypes.atJestTypesStrings.`success-change`
  - typings.atJestTypes.atJestTypesStrings.`failure-change`
*/
trait NotifyMode extends js.Object

object NotifyMode {
  @scala.inline
  def always: typings.atJestTypes.atJestTypesStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.atJestTypes.atJestTypesStrings.change = this.cast("change")
  @scala.inline
  def failure: typings.atJestTypes.atJestTypesStrings.failure = this.cast("failure")
  @scala.inline
  def `failure-change`: typings.atJestTypes.atJestTypesStrings.`failure-change` = this.cast("failure-change")
  @scala.inline
  def success: typings.atJestTypes.atJestTypesStrings.success = this.cast("success")
  @scala.inline
  def `success-change`: typings.atJestTypes.atJestTypesStrings.`success-change` = this.cast("success-change")
}

