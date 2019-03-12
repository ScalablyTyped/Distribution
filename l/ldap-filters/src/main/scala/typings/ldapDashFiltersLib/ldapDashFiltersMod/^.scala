package typings
package ldapDashFiltersLib.ldapDashFiltersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldap-filters", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var collapse_not: scala.Boolean = js.native
  var escape_chars: js.Array[java.lang.String] = js.native
  var indent: scala.Double = js.native
  var indent_char: java.lang.String = js.native
  def AND(filters: js.Array[Filter]): ldapDashFiltersLib.ldapDashFiltersMod.FilterNs.Group = js.native
  def NOT(filter: Filter): ldapDashFiltersLib.ldapDashFiltersMod.FilterNs.GroupNot = js.native
  def OR(filters: js.Array[Filter]): ldapDashFiltersLib.ldapDashFiltersMod.FilterNs.Group = js.native
  def attribute(name: java.lang.String): ldapDashFiltersLib.ldapDashFiltersMod.FilterNs.Attribute = js.native
  def escape(value: java.lang.String): java.lang.String = js.native
  def matchApprox(data: java.lang.String, filter: Filter): scala.Boolean = js.native
  def matchApprox(data: js.Array[java.lang.String], filter: Filter): scala.Boolean = js.native
  def matchGTE(data: java.lang.String, filter: Filter): scala.Boolean = js.native
  def matchGTE(data: js.Array[java.lang.String], filter: Filter): scala.Boolean = js.native
  def matchLTE(data: java.lang.String, filter: Filter): scala.Boolean = js.native
  def matchLTE(data: js.Array[java.lang.String], filter: Filter): scala.Boolean = js.native
  def matchString(data: java.lang.String, filter: Filter): scala.Boolean = js.native
  def matchString(data: js.Array[java.lang.String], filter: Filter): scala.Boolean = js.native
  def matchSubstring(data: java.lang.String, filter: Filter): scala.Boolean = js.native
  def matchSubstring(data: js.Array[java.lang.String], filter: Filter): scala.Boolean = js.native
  def parse(input: java.lang.String): Filter = js.native
  def unescape(value: java.lang.String): java.lang.String = js.native
}

