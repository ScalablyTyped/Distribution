package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Having[TRecord, TResult] extends WhereWrapped[TRecord, TResult] {
  def apply(column: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(column: String, operator: String, value: QueryBuilder[_, _]): QueryBuilder[TRecord, TResult] = js.native
  def apply(column: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(column: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(column: Raw[_], operator: String, value: QueryBuilder[_, _]): QueryBuilder[TRecord, TResult] = js.native
  def apply(column: Raw[_], operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: String */](
    column: K,
    operator: ComparisonOperator,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TRecord[K] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
}

