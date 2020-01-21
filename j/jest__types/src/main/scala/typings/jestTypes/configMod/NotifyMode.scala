package typings.jestTypes.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.jestTypesStrings.always
  - typings.jestTypes.jestTypesStrings.failure
  - typings.jestTypes.jestTypesStrings.success
  - typings.jestTypes.jestTypesStrings.change
  - typings.jestTypes.jestTypesStrings.`success-change`
  - typings.jestTypes.jestTypesStrings.`failure-change`
*/
trait NotifyMode extends js.Object

object NotifyMode {
  @scala.inline
  def always: typings.jestTypes.jestTypesStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.jestTypes.jestTypesStrings.change = this.cast("change")
  @scala.inline
  def failure: typings.jestTypes.jestTypesStrings.failure = this.cast("failure")
  @scala.inline
  def `failure-change`: typings.jestTypes.jestTypesStrings.`failure-change` = this.cast("failure-change")
  @scala.inline
  def success: typings.jestTypes.jestTypesStrings.success = this.cast("success")
  @scala.inline
  def `success-change`: typings.jestTypes.jestTypesStrings.`success-change` = this.cast("success-change")
}

