package typings.joi.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.joi.joiStrings.any
  - typings.joi.joiStrings.alternatives
  - typings.joi.joiStrings.array
  - typings.joi.joiStrings.boolean
  - typings.joi.joiStrings.binary
  - typings.joi.joiStrings.date
  - typings.joi.joiStrings.function
  - typings.joi.joiStrings.`lazy`
  - typings.joi.joiStrings.number
  - typings.joi.joiStrings.`object`
  - typings.joi.joiStrings.string
*/
trait Types extends js.Object

object Types {
  @scala.inline
  def alternatives: typings.joi.joiStrings.alternatives = this.cast("alternatives")
  @scala.inline
  def any: typings.joi.joiStrings.any = this.cast("any")
  @scala.inline
  def array: typings.joi.joiStrings.array = this.cast("array")
  @scala.inline
  def binary: typings.joi.joiStrings.binary = this.cast("binary")
  @scala.inline
  def boolean: typings.joi.joiStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.joi.joiStrings.date = this.cast("date")
  @scala.inline
  def function: typings.joi.joiStrings.function = this.cast("function")
  @scala.inline
  def `lazy`: typings.joi.joiStrings.`lazy` = this.cast("lazy")
  @scala.inline
  def number: typings.joi.joiStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.joi.joiStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.joi.joiStrings.string = this.cast("string")
}

