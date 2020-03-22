package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Having[TRecord, TResult]
  extends WhereWrapped[TRecord, TResult]
     with RawQueryBuilder[TRecord, TResult] {
  /* InferMemberOverrides */
  override def apply(T0: /* callback */ QueryCallback[js.Any, js.Array[js.Any]]): QueryBuilder[TRecord, TResult] = js.native
  def apply(tableName: String, column1: String, operator: String, column2: String): QueryBuilder[TRecord, TResult] = js.native
  def apply[K1 /* <: String */, K2 /* <: String */](tableName: String, column1: K1, operator: ComparisonOperator, column2: K2): QueryBuilder[TRecord, TResult] = js.native
}

