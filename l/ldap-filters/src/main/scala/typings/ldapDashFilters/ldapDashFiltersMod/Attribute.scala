package typings.ldapDashFilters.ldapDashFiltersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var escapeChars: js.Array[String]
  var name: String
  def approx(value: String): Filter
  def contains(value: String): Filter
  def endsWith(value: String): Filter
  def equalTo(value: String): Filter
  def escape(value: String): String
  def gte(value: String): Filter
  def lte(value: String): Filter
  def present(): Filter
  def raw(value: String): Filter
  def startsWith(value: String): Filter
}

object Attribute {
  @scala.inline
  def apply(
    approx: String => Filter,
    contains: String => Filter,
    endsWith: String => Filter,
    equalTo: String => Filter,
    escape: String => String,
    escapeChars: js.Array[String],
    gte: String => Filter,
    lte: String => Filter,
    name: String,
    present: () => Filter,
    raw: String => Filter,
    startsWith: String => Filter
  ): Attribute = {
    val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equalTo = js.Any.fromFunction1(equalTo), escape = js.Any.fromFunction1(escape), escapeChars = escapeChars, gte = js.Any.fromFunction1(gte), lte = js.Any.fromFunction1(lte), name = name, present = js.Any.fromFunction0(present), raw = js.Any.fromFunction1(raw), startsWith = js.Any.fromFunction1(startsWith))
  
    __obj.asInstanceOf[Attribute]
  }
}

@JSImport("ldap-filters", "attribute")
@js.native
object attribute extends js.Object {
  def apply(name: String): Attribute = js.native
}

