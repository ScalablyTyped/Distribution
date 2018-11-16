package typings
package linq4jsLib.Linq4JSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderDirection extends js.Object

@JSGlobal("Linq4JS.OrderDirection")
@js.native
object OrderDirection extends js.Object {
  @js.native
  sealed trait Ascending
    extends linq4jsLib.Linq4JSNs.OrderDirection
  
  @js.native
  sealed trait Descending
    extends linq4jsLib.Linq4JSNs.OrderDirection
  
  /* 0 */ val Ascending: Ascending with scala.Double = js.native
  /* 1 */ val Descending: Descending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[linq4jsLib.Linq4JSNs.OrderDirection with scala.Double] = js.native
}

