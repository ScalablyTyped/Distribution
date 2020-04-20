package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereIn[TRecord, TResult] extends js.Object {
  def apply(columnName: String, values: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnNames: js.Array[String], values: js.Array[js.Array[Value]]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnNames: js.Array[String], values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: /* keyof TRecord */ String */](
    columnName: K,
    values: js.Array[
      DbColumn[
        /* import warning: importer.ImportType#apply Failed type conversion: TRecord[K] */ js.Any
      ]
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: /* keyof TRecord */ String */](columnName: K, values: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](columnName: String, values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](columnNames: js.Array[String], values: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
  def apply[K /* <: /* keyof TRecord */ String */, TRecordInner, TResultInner](
    columnName: K,
    values: QueryBuilder[
      TRecordInner, 
      /* import warning: importer.ImportType#apply Failed type conversion: TRecord[K] */ js.Any
    ]
  ): QueryBuilder[TRecord, TResult] = js.native
}

