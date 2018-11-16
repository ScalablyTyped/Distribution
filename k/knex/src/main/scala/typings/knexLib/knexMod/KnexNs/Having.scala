package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Having
  extends WhereWrapped
     with RawQueryBuilder {
  /* InferMemberOverrides */
  override def apply(T0: /* callback */ QueryCallback): QueryBuilder = js.native
  def apply(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder = js.native
}

