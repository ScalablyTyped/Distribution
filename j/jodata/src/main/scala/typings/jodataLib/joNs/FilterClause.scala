package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jo.FilterClause")
@js.native
class FilterClause () extends js.Object {
  def this(property: java.lang.String) = this()
  var Components: js.Array[java.lang.String] = js.native
  var FuncReturnType: js.Any = js.native
  var IsClauseEmpty: scala.Boolean = js.native
  var Property: java.lang.String = js.native
  var PropertyIncluded: scala.Boolean = js.native
  var UsingNot: scala.Boolean = js.native
  var Value: js.Any = js.native
  var transformFunc: js.Function = js.native
  // Concat
  def Concat(concat: Concat): FilterClause = js.native
  // Arithmetic methods
  def add(amount: scala.Double): FilterClause = js.native
  def ceiling(): FilterClause = js.native
  // Date functions
  def day(): FilterClause = js.native
  def div(amount: scala.Double): FilterClause = js.native
  def endswith(value: java.lang.String): FilterClause = js.native
  // Logical operators
  def eq(value: java.lang.String): FilterClause = js.native
  // Logical operators
  def eq(value: scala.Boolean): FilterClause = js.native
  // Logical operators
  def eq(value: scala.Double): FilterClause = js.native
  def floor(): FilterClause = js.native
  def ge(value: java.lang.String): FilterClause = js.native
  def ge(value: scala.Boolean): FilterClause = js.native
  def ge(value: scala.Double): FilterClause = js.native
  def gt(value: java.lang.String): FilterClause = js.native
  def gt(value: scala.Boolean): FilterClause = js.native
  def gt(value: scala.Double): FilterClause = js.native
  def hour(): FilterClause = js.native
  def indexof(value: java.lang.String): FilterClause = js.native
  def isEmpty(): scala.Boolean = js.native
  def le(value: java.lang.String): FilterClause = js.native
  def le(value: scala.Boolean): FilterClause = js.native
  def le(value: scala.Double): FilterClause = js.native
  def length(): FilterClause = js.native
  def lt(value: java.lang.String): FilterClause = js.native
  def lt(value: scala.Boolean): FilterClause = js.native
  def lt(value: scala.Double): FilterClause = js.native
  def minute(): FilterClause = js.native
  def mod(amount: scala.Double): FilterClause = js.native
  def month(): FilterClause = js.native
  def mul(amount: scala.Double): FilterClause = js.native
  def ne(value: java.lang.String): FilterClause = js.native
  def ne(value: scala.Boolean): FilterClause = js.native
  def ne(value: scala.Double): FilterClause = js.native
  def not(): FilterClause = js.native
  def replace(find: java.lang.String, replace: java.lang.String): FilterClause = js.native
  // Math functions
  def round(): FilterClause = js.native
  def second(): FilterClause = js.native
  def startswith(value: java.lang.String): FilterClause = js.native
  def sub(amount: scala.Double): FilterClause = js.native
  def substring(position: scala.Double): FilterClause = js.native
  def substring(position: scala.Double, length: scala.Double): FilterClause = js.native
  // String functions
  def substringof(value: java.lang.String): FilterClause = js.native
  def toLower(): FilterClause = js.native
  def toUpper(): FilterClause = js.native
  def trim(): FilterClause = js.native
  def year(): FilterClause = js.native
}

