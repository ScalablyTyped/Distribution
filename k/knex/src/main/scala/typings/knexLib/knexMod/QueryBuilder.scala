package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilder[TRecord /* <: js.Object */, TResult]
  extends ChainableInterface[ResolveResult[TResult]]
     with QueryInterface[TRecord, TResult] {
  // [TODO] Doesn't seem to be available
  // or: QueryBuilder;
  var and: QueryBuilder[TRecord, TResult] = js.native
  // TODO: Promise?
  def columnInfo(): js.Promise[ColumnInfo] = js.native
  def columnInfo(column: java.lang.String): js.Promise[ColumnInfo] = js.native
  def forShare(tableNames: java.lang.String*): QueryBuilder[TRecord, TResult] = js.native
  def forShare(tableNames: js.Array[java.lang.String]): QueryBuilder[TRecord, TResult] = js.native
  def forUpdate(tableNames: java.lang.String*): QueryBuilder[TRecord, TResult] = js.native
  def forUpdate(tableNames: js.Array[java.lang.String]): QueryBuilder[TRecord, TResult] = js.native
  def noWait(): QueryBuilder[TRecord, TResult] = js.native
  def on(event: java.lang.String, callback: js.Function): QueryBuilder[TRecord, TResult] = js.native
  def queryContext(context: js.Any): QueryBuilder[TRecord, TResult] = js.native
  def skipLocked(): QueryBuilder[TRecord, TResult] = js.native
  def toSQL(): Sql = js.native
}

