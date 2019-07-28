package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereExists[TRecord, TResult] extends js.Object {
  def apply(callback: QueryCallback[_, js.Array[_]]): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](query: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
}

