package typings.knex.mod

import typings.knex.ReadonlyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Where[TRecord, TResult]
  extends WhereWrapped[TRecord, TResult]
     with WhereRaw[TRecord, TResult]
     with WhereNull[TRecord, TResult] {
  /* InferMemberOverrides */
  override def apply(T0: /* callback */ QueryCallback[js.Any, js.Array[js.Any]]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, operator: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, operator: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(left: Raw[_], operator: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(left: Raw[_], operator: String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(`object`: ReadonlyObject): QueryBuilder[TRecord, TResult] = js.native
  def apply(`object`: DbRecord[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: /* keyof TRecord */ String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: /* keyof TRecord */ String */](columnName: T, operator: ComparisonOperator): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: /* keyof TRecord */ String */](
    columnName: T,
    operator: ComparisonOperator,
    value: DbColumn[
      /* import warning: importer.ImportType#apply Failed type conversion: TRecord[T] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: /* keyof TRecord */ String */](
    columnName: T,
    value: DbColumn[
      /* import warning: importer.ImportType#apply Failed type conversion: TRecord[T] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](columnName: String, operator: String, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](left: Raw[_], operator: String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: /* keyof TRecord */ String */, TRecordInner, TResultInner](columnName: T, operator: ComparisonOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
}

