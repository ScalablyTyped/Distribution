package typings
package ldapDashFiltersLib.ldapDashFiltersMod.FilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  var comp: java.lang.String = js.native
  var filters: js.Array[ldapDashFiltersLib.ldapDashFiltersMod.Filter] = js.native
  var `type`: java.lang.String = js.native
  def `match`(data: js.Object): scala.Boolean = js.native
  def toString(indent: scala.Boolean): java.lang.String = js.native
  def toString(indent: scala.Double): java.lang.String = js.native
}

