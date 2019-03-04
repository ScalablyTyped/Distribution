package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knex
  extends knexLib.knexMod.KnexNs.QueryInterface {
  var VERSION: java.lang.String = js.native
  var __knex__ : java.lang.String = js.native
  var client: js.Any = js.native
  var fn: knexLib.knexMod.KnexNs.FunctionHelper = js.native
  var migrate: knexLib.knexMod.KnexNs.Migrator = js.native
  @JSName("raw")
  var raw_Original: knexLib.knexMod.KnexNs.RawBuilder = js.native
  var schema: knexLib.knexMod.KnexNs.SchemaBuilder = js.native
  var seed: js.Any = js.native
  def apply(): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def apply(tableName: knexLib.TableName): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def apply(tableName: Identifier): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def batchInsert(tableName: knexLib.TableName, data: js.Array[_]): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def batchInsert(tableName: knexLib.TableName, data: js.Array[_], chunkSize: scala.Double): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def destroy(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def destroy(callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def queryBuilder(): knexLib.knexMod.KnexNs.QueryBuilder = js.native
  def raw(sql: java.lang.String, bindings: (knexLib.Value | knexLib.knexMod.KnexNs.QueryBuilder)*): knexLib.knexMod.KnexNs.Raw = js.native
  def raw(sql: java.lang.String, bindings: js.Array[knexLib.Value | knexLib.knexMod.KnexNs.QueryBuilder]): knexLib.knexMod.KnexNs.Raw = js.native
  def raw(sql: java.lang.String, bindings: ValueMap): knexLib.knexMod.KnexNs.Raw = js.native
  def raw(value: knexLib.Value): knexLib.knexMod.KnexNs.Raw = js.native
  def transaction[T](
    transactionScope: js.Function1[
      /* trx */ knexLib.knexMod.KnexNs.Transaction, 
      js.Promise[T] | bluebirdLib.bluebirdMod.namespaced[T] | scala.Unit
    ]
  ): bluebirdLib.bluebirdMod.namespaced[T] = js.native
}

