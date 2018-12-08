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

