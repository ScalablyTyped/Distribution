package typings.knex.mod

import typings.knex.AnonCancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "QueryBuilder")
@js.native
class QueryBuilder[TRecord /* <: js.Object */, TResult] ()
  extends ChainableInterface[ResolveResult[TResult]]
     with QueryInterface[TRecord, TResult] {
  var and: QueryBuilder[TRecord, TResult] = js.native
  var not: QueryBuilder[TRecord, TResult] = js.native
  var or: QueryBuilder[TRecord, TResult] = js.native
  // TODO: Promise?
  def columnInfo(): js.Promise[ColumnInfo] = js.native
  def columnInfo(column: String): js.Promise[ColumnInfo] = js.native
  def forShare(tableNames: String*): QueryBuilder[TRecord, TResult] = js.native
  def forShare(tableNames: js.Array[String]): QueryBuilder[TRecord, TResult] = js.native
  def forUpdate(tableNames: String*): QueryBuilder[TRecord, TResult] = js.native
  def forUpdate(tableNames: js.Array[String]): QueryBuilder[TRecord, TResult] = js.native
  def noWait(): QueryBuilder[TRecord, TResult] = js.native
  def on(event: String, callback: js.Function): QueryBuilder[TRecord, TResult] = js.native
  def queryContext(context: js.Any): QueryBuilder[TRecord, TResult] = js.native
  def skipLocked(): QueryBuilder[TRecord, TResult] = js.native
  def timeout(ms: Double): QueryBuilder[TRecord, TResult] = js.native
  def timeout(ms: Double, options: AnonCancel): QueryBuilder[TRecord, TResult] = js.native
  def toSQL(): Sql = js.native
}

/* static members */
@JSImport("knex", "QueryBuilder")
@js.native
object QueryBuilder extends js.Object {
  def extend(
    methodName: String,
    fn: js.ThisFunction1[/* this */ Knex[_, js.Array[_]], /* repeated */ js.Any, QueryBuilder[_, js.Array[_]]]
  ): Unit = js.native
}

