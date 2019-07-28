package typings.linq4js.Linq4JSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderDirection extends js.Object

@JSGlobal("Linq4JS.OrderDirection")
@js.native
object OrderDirection extends js.Object {
  @js.native
  sealed trait Ascending extends OrderDirection
  
  @js.native
  sealed trait Descending extends OrderDirection
  
  /* 0 */ val Ascending: typings.linq4js.Linq4JSNs.OrderDirection.Ascending with Double = js.native
  /* 1 */ val Descending: typings.linq4js.Linq4JSNs.OrderDirection.Descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderDirection with Double] = js.native
}

