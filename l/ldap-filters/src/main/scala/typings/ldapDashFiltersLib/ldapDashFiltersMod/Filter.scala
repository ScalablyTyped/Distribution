package typings
package ldapDashFiltersLib.ldapDashFiltersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  def `match`(data: js.Object): scala.Boolean = js.native
  def simplify(): Filter = js.native
  def toString(indent: scala.Boolean): java.lang.String = js.native
  def toString(indent: scala.Double): java.lang.String = js.native
}

