package typings
package ldapDashFiltersLib.ldapDashFiltersMod.FilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var escapeChars: js.Array[java.lang.String]
  var name: java.lang.String
  def approx(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def contains(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def endsWith(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def equalTo(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def escape(value: java.lang.String): java.lang.String
  def gte(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def lte(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def present(): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def raw(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
  def startsWith(value: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.Filter
}

object Attribute {
  @scala.inline
  def apply(
    approx: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    contains: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    endsWith: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    equalTo: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    escape: java.lang.String => java.lang.String,
    escapeChars: js.Array[java.lang.String],
    gte: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    lte: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    name: java.lang.String,
    present: () => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    raw: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter,
    startsWith: java.lang.String => ldapDashFiltersLib.ldapDashFiltersMod.Filter
  ): Attribute = {
    val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equalTo = js.Any.fromFunction1(equalTo), escape = js.Any.fromFunction1(escape), escapeChars = escapeChars, gte = js.Any.fromFunction1(gte), lte = js.Any.fromFunction1(lte), name = name, present = js.Any.fromFunction0(present), raw = js.Any.fromFunction1(raw), startsWith = js.Any.fromFunction1(startsWith))
  
    __obj.asInstanceOf[Attribute]
  }
}

