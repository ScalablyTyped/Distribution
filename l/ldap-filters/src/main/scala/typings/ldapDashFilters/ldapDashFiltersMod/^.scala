package typings.ldapDashFilters.ldapDashFiltersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldap-filters", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var collapse_not: Boolean = js.native
  var escape_chars: js.Array[String] = js.native
  var indent: Double = js.native
  var indent_char: String = js.native
  def AND(filters: js.Array[Filter]): Group = js.native
  def NOT(filter: Filter): GroupNot = js.native
  def OR(filters: js.Array[Filter]): Group = js.native
  def attribute(name: String): Attribute = js.native
  def escape(value: String): String = js.native
  def matchApprox(data: String, filter: Filter): Boolean = js.native
  def matchApprox(data: js.Array[String], filter: Filter): Boolean = js.native
  def matchGTE(data: String, filter: Filter): Boolean = js.native
  def matchGTE(data: js.Array[String], filter: Filter): Boolean = js.native
  def matchLTE(data: String, filter: Filter): Boolean = js.native
  def matchLTE(data: js.Array[String], filter: Filter): Boolean = js.native
  def matchString(data: String, filter: Filter): Boolean = js.native
  def matchString(data: js.Array[String], filter: Filter): Boolean = js.native
  def matchSubstring(data: String, filter: Filter): Boolean = js.native
  def matchSubstring(data: js.Array[String], filter: Filter): Boolean = js.native
  def parse(input: String): Filter = js.native
  def unescape(value: String): String = js.native
}

