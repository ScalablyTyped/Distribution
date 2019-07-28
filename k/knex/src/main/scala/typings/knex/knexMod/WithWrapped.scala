package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithWrapped[TRecord, TResult] extends js.Object {
  def apply(
    alias: String,
    callback: js.Function1[/* queryBuilder */ QueryBuilder[_, js.Array[SafePartial[_]]], _]
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply(alias: String, queryBuilder: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
}

