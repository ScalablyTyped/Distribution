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
  override def apply(T0: /* callback */ QueryCallback): WhereResult[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, operator: java.lang.String): WhereResult[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, operator: java.lang.String, value: Value): WhereResult[TRecord, TResult] = js.native
  def apply(columnName: java.lang.String, value: Value): WhereResult[TRecord, TResult] = js.native
  def apply(left: Raw[_], operator: java.lang.String): WhereResult[TRecord, TResult] = js.native
  def apply(left: Raw[_], operator: java.lang.String, right: Value): WhereResult[TRecord, TResult] = js.native
  def apply(`object`: js.Object): WhereResult[TRecord, TResult] = js.native
  def apply(`object`: stdLib.Partial[TRecord]): WhereResult[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](columnName: T): WhereResult[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](columnName: T, operator: ComparisionOperator): WhereResult[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](
    columnName: T,
    operator: ComparisionOperator,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): WhereResult[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */](
    columnName: T,
    value: /* import warning: ImportType.apply Failed type conversion: TRecord[T] */ js.Any
  ): WhereResult[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](
    columnName: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[TRecordInner, TResultInner]
  ): WhereResult[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](left: Raw[_], operator: java.lang.String, right: QueryBuilder[TRecordInner, TResultInner]): WhereResult[TRecord, TResult] = js.native
  def apply[T /* <: java.lang.String */, TRecordInner, TResultInner](columnName: T, operator: ComparisionOperator, value: QueryBuilder[TRecordInner, TResultInner]): WhereResult[TRecord, TResult] = js.native
}

