package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jo.FilterClause")
@js.native
class FilterClause () extends js.Object {
  def this(property: String) = this()
  var Components: js.Array[String] = js.native
  var FuncReturnType: js.Any = js.native
  var IsClauseEmpty: Boolean = js.native
  var Property: String = js.native
  var PropertyIncluded: Boolean = js.native
  var UsingNot: Boolean = js.native
  var Value: js.Any = js.native
  var transformFunc: js.Function = js.native
  // Concat
  def Concat(concat: typings.jodata.jo.Concat): FilterClause = js.native
  // Arithmetic methods
  def add(amount: Double): FilterClause = js.native
  def ceiling(): FilterClause = js.native
  // Date functions
  def day(): FilterClause = js.native
  def div(amount: Double): FilterClause = js.native
  def endswith(value: String): FilterClause = js.native
  // Logical operators
  def eq(value: String): FilterClause = js.native
  def eq(value: Boolean): FilterClause = js.native
  def eq(value: Double): FilterClause = js.native
  def floor(): FilterClause = js.native
  def ge(value: String): FilterClause = js.native
  def ge(value: Boolean): FilterClause = js.native
  def ge(value: Double): FilterClause = js.native
  def gt(value: String): FilterClause = js.native
  def gt(value: Boolean): FilterClause = js.native
  def gt(value: Double): FilterClause = js.native
  def hour(): FilterClause = js.native
  def indexof(value: String): FilterClause = js.native
  def isEmpty(): Boolean = js.native
  def le(value: String): FilterClause = js.native
  def le(value: Boolean): FilterClause = js.native
  def le(value: Double): FilterClause = js.native
  def length(): FilterClause = js.native
  def lt(value: String): FilterClause = js.native
  def lt(value: Boolean): FilterClause = js.native
  def lt(value: Double): FilterClause = js.native
  def minute(): FilterClause = js.native
  def mod(amount: Double): FilterClause = js.native
  def month(): FilterClause = js.native
  def mul(amount: Double): FilterClause = js.native
  def ne(value: String): FilterClause = js.native
  def ne(value: Boolean): FilterClause = js.native
  def ne(value: Double): FilterClause = js.native
  def not(): FilterClause = js.native
  def replace(find: String, replace: String): FilterClause = js.native
  // Math functions
  def round(): FilterClause = js.native
  def second(): FilterClause = js.native
  def startswith(value: String): FilterClause = js.native
  def sub(amount: Double): FilterClause = js.native
  def substring(position: Double): FilterClause = js.native
  def substring(position: Double, length: Double): FilterClause = js.native
  // String functions
  def substringof(value: String): FilterClause = js.native
  def toLower(): FilterClause = js.native
  def toUpper(): FilterClause = js.native
  def trim(): FilterClause = js.native
  def year(): FilterClause = js.native
}

