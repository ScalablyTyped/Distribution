package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knex[TRecord /* <: js.Object */, TResult] extends QueryInterface[TRecord, TResult] {
  var VERSION: java.lang.String = js.native
  var __knex__ : java.lang.String = js.native
  var client: js.Any = js.native
  var fn: FunctionHelper = js.native
  var migrate: Migrator = js.native
  @JSName("raw")
  var raw_Original: RawBuilder = js.native
  var schema: SchemaBuilder = js.native
  var seed: js.Any = js.native
  def apply[TRecord2, TResult2](): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TRecord2, TResult2](tableName: Identifier): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def apply[TRecord2, TResult2](tableName: TableName): (QueryBuilder[TRecord2, TResult2]) with ChainableInterface[js.Array[TRecord2]] = js.native
  def batchInsert(tableName: TableName, data: js.Array[_]): QueryBuilder[TRecord, js.Object] = js.native
  def batchInsert(tableName: TableName, data: js.Array[_], chunkSize: scala.Double): QueryBuilder[TRecord, js.Object] = js.native
  def destroy(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def destroy(callback: js.Function): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: js.Function): QueryBuilder[TRecord, TResult] = js.native
  def queryBuilder[TRecord2, TResult2](): QueryBuilder[TRecord2, TResult2] = js.native
  def raw[TResult](sql: java.lang.String, bindings: Value*): Raw[TResult] = js.native
  def raw[TResult](sql: java.lang.String, bindings: js.Array[Value]): Raw[TResult] = js.native
  def raw[TResult](sql: java.lang.String, bindings: ValueMap): Raw[TResult] = js.native
  def raw[TResult](value: Value): Raw[TResult] = js.native
  @JSName("raw")
  def raw_TRecordTResult[TRecord, TResult](sql: java.lang.String, bindings: (QueryBuilder[TRecord, TResult])*): Raw[TResult] = js.native
  @JSName("raw")
  def raw_TRecordTResult[TRecord, TResult](sql: java.lang.String, bindings: js.Array[QueryBuilder[TRecord, TResult]]): Raw[TResult] = js.native
  @JSName("raw")
  def raw_TRecordTResult[TRecord, TResult](sql: java.lang.String, bindings: ValueMap): Raw[TResult] = js.native
  def transaction[T](
    transactionScope: js.Function1[
      /* trx */ Transaction[TResult], 
      js.Promise[T] | bluebirdLib.bluebirdMod.^[T] | scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.^[T] = js.native
}

