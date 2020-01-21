package typings.jestGetType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestGetType.jestGetTypeStrings.array
  - typings.jestGetType.jestGetTypeStrings.boolean
  - typings.jestGetType.jestGetTypeStrings.function
  - typings.jestGetType.jestGetTypeStrings.`null`
  - typings.jestGetType.jestGetTypeStrings.number
  - typings.jestGetType.jestGetTypeStrings.`object`
  - typings.jestGetType.jestGetTypeStrings.regexp
  - typings.jestGetType.jestGetTypeStrings.map
  - typings.jestGetType.jestGetTypeStrings.set
  - typings.jestGetType.jestGetTypeStrings.date
  - typings.jestGetType.jestGetTypeStrings.string
  - typings.jestGetType.jestGetTypeStrings.symbol
  - typings.jestGetType.jestGetTypeStrings.undefined
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  def array: typings.jestGetType.jestGetTypeStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.jestGetType.jestGetTypeStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.jestGetType.jestGetTypeStrings.date = this.cast("date")
  @scala.inline
  def function: typings.jestGetType.jestGetTypeStrings.function = this.cast("function")
  @scala.inline
  def map: typings.jestGetType.jestGetTypeStrings.map = this.cast("map")
  @scala.inline
  def `null`: typings.jestGetType.jestGetTypeStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.jestGetType.jestGetTypeStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.jestGetType.jestGetTypeStrings.`object` = this.cast("object")
  @scala.inline
  def regexp: typings.jestGetType.jestGetTypeStrings.regexp = this.cast("regexp")
  @scala.inline
  def set: typings.jestGetType.jestGetTypeStrings.set = this.cast("set")
  @scala.inline
  def string: typings.jestGetType.jestGetTypeStrings.string = this.cast("string")
  @scala.inline
  def symbol: typings.jestGetType.jestGetTypeStrings.symbol = this.cast("symbol")
  @scala.inline
  def undefined: typings.jestGetType.jestGetTypeStrings.undefined = this.cast("undefined")
}

