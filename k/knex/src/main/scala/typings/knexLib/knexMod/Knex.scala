package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knex extends QueryInterface {
  var VERSION: java.lang.String = js.native
  var __knex__ : java.lang.String = js.native
  var client: js.Any = js.native
  var fn: FunctionHelper = js.native
  var migrate: Migrator = js.native
  @JSName("raw")
  var raw_Original: RawBuilder = js.native
  var schema: SchemaBuilder = js.native
  var seed: js.Any = js.native
  def apply(): QueryBuilder = js.native
  def apply(tableName: Identifier): QueryBuilder = js.native
  def apply(tableName: TableName): QueryBuilder = js.native
  def batchInsert(tableName: TableName, data: js.Array[_]): QueryBuilder = js.native
  def batchInsert(tableName: TableName, data: js.Array[_], chunkSize: scala.Double): QueryBuilder = js.native
  def destroy(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def destroy(callback: js.Function): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: js.Function): QueryBuilder = js.native
  def queryBuilder(): QueryBuilder = js.native
  def raw(sql: java.lang.String, bindings: (Value | QueryBuilder)*): Raw = js.native
  def raw(sql: java.lang.String, bindings: js.Array[Value | QueryBuilder]): Raw = js.native
  def raw(sql: java.lang.String, bindings: ValueMap): Raw = js.native
  def raw(value: Value): Raw = js.native
  def transaction[T](
    transactionScope: js.Function1[/* trx */ Transaction, js.Promise[T] | bluebirdLib.bluebirdMod.^[T] | scala.Unit]
  ): bluebirdLib.bluebirdMod.^[T] = js.native
}

