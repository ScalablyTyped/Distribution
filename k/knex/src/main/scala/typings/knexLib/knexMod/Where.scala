package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- knexLib.knexMod.WhereNull because Already inherited */ @js.native
trait Where
  extends WhereWrapped
     with WhereRaw {
  /* InferMemberOverrides */
  override def apply(T0: /* callback */ QueryCallback): QueryBuilder = js.native
  def apply(columnName: java.lang.String): QueryBuilder = js.native
  def apply(columnName: java.lang.String, operator: java.lang.String): QueryBuilder = js.native
  def apply(columnName: java.lang.String, operator: java.lang.String, value: knexLib.Value): QueryBuilder = js.native
  def apply(columnName: java.lang.String, operator: java.lang.String, value: QueryBuilder): QueryBuilder = js.native
  def apply(columnName: java.lang.String, value: knexLib.Value): QueryBuilder = js.native
  def apply(left: Raw, operator: java.lang.String): QueryBuilder = js.native
  def apply(left: Raw, operator: java.lang.String, right: knexLib.Value): QueryBuilder = js.native
  def apply(left: Raw, operator: java.lang.String, right: QueryBuilder): QueryBuilder = js.native
  def apply(`object`: js.Object): QueryBuilder = js.native
}

