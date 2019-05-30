package typings
package knexLib.knexMod

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
  def apply(columnName: java.lang.String, operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, value: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(left: Raw[_], operator: java.lang.String): QueryBuilder[TRecord, TResult] = js.native
  def apply(left: Raw[_], operator: java.lang.String, right: Value): QueryBuilder[TRecord, TResult] = js.native
  def apply(`object`: js.Object): QueryBuilder[TRecord, TResult] = js.native
  def apply(`object`: SafePartial[TRecord]): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](columnName: T): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
}

