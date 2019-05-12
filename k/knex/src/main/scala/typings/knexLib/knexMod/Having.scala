package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Having[TRecord, TResult]
  extends WhereWrapped[TRecord, TResult]
     with RawQueryBuilder[TRecord, TResult] {
  /* InferMemberOverrides */
  override def apply(T0: /* callback */ QueryCallback): WhereResult[TRecord, TResult] = js.native
  def apply(
    tableName: java.lang.String,
    column1: java.lang.String,
    operator: java.lang.String,
    column2: java.lang.String
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply[K1 /* <: java.lang.String */, K2 /* <: java.lang.String */](tableName: java.lang.String, column1: K1, operator: ComparisionOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
}

