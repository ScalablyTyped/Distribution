package typings
package ldapDashFiltersLib.ldapDashFiltersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var escapeChars: js.Array[java.lang.String]
  var name: java.lang.String
  def approx(value: java.lang.String): Filter
  def contains(value: java.lang.String): Filter
  def endsWith(value: java.lang.String): Filter
  def equalTo(value: java.lang.String): Filter
  def escape(value: java.lang.String): java.lang.String
  def gte(value: java.lang.String): Filter
  def lte(value: java.lang.String): Filter
  def present(): Filter
  def raw(value: java.lang.String): Filter
  def startsWith(value: java.lang.String): Filter
}

object Attribute {
  @scala.inline
  def apply(
    approx: java.lang.String => Filter,
    contains: java.lang.String => Filter,
    endsWith: java.lang.String => Filter,
    equalTo: java.lang.String => Filter,
    escape: java.lang.String => java.lang.String,
    escapeChars: js.Array[java.lang.String],
    gte: java.lang.String => Filter,
    lte: java.lang.String => Filter,
    name: java.lang.String,
    present: () => Filter,
    raw: java.lang.String => Filter,
    startsWith: java.lang.String => Filter
  ): Attribute = {
    val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equalTo = js.Any.fromFunction1(equalTo), escape = js.Any.fromFunction1(escape), escapeChars = escapeChars, gte = js.Any.fromFunction1(gte), lte = js.Any.fromFunction1(lte), name = name, present = js.Any.fromFunction0(present), raw = js.Any.fromFunction1(raw), startsWith = js.Any.fromFunction1(startsWith))
  
    __obj.asInstanceOf[Attribute]
  }
}

