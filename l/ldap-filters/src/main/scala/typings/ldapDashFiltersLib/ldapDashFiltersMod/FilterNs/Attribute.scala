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
    approx: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    contains: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    endsWith: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    equalTo: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    escape: js.Function1[java.lang.String, java.lang.String],
    escapeChars: js.Array[java.lang.String],
    gte: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    lte: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    name: java.lang.String,
    present: js.Function0[ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    raw: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter],
    startsWith: js.Function1[java.lang.String, ldapDashFiltersLib.ldapDashFiltersMod.Filter]
  ): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approx")(approx)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("endsWith")(endsWith)
    __obj.updateDynamic("equalTo")(equalTo)
    __obj.updateDynamic("escape")(escape)
    __obj.updateDynamic("escapeChars")(escapeChars)
    __obj.updateDynamic("gte")(gte)
    __obj.updateDynamic("lte")(lte)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("present")(present)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("startsWith")(startsWith)
    __obj.asInstanceOf[Attribute]
  }
}

