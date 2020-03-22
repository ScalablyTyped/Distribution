package typings.knex.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knex[TRecord /* <: js.Object */, TResult]
  extends EventEmitter
     with QueryInterface[TRecord, TResult] {
  var VERSION: String = js.native
  var __knex__ : String = js.native
  var client: js.Any = js.native
  var fn: FunctionHelper = js.native
  var migrate: Migrator = js.native
  @JSName("raw")
  var raw_Original: RawBuilder[TRecord, _] = js.native
  @JSName("ref")
  var ref_Original: RefBuilder = js.native
  var schema: SchemaBuilder = js.native
  var seed: Seeder = js.native
  def apply[TRecord2, TResult2](): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: AliasDict, options: TableOptions): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: TableDescriptor, options: TableOptions): QueryBuilder[TRecord2, TResult2] = js.native
  def batchInsert(tableName: TableDescriptor, data: js.Array[_]): QueryBuilder[TRecord, js.Object] = js.native
  def batchInsert(tableName: TableDescriptor, data: js.Array[_], chunkSize: Double): QueryBuilder[TRecord, js.Object] = js.native
  def destroy(): js.Promise[Unit] = js.native
  def destroy(callback: js.Function): Unit = js.native
  def initialize(): Unit = js.native
  def initialize(config: Config[_]): Unit = js.native
  def queryBuilder[TRecord2, TResult2](): QueryBuilder[TRecord2, TResult2] = js.native
  def raw[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: Value): Raw[TResult2] = js.native
  def ref[TSrc /* <: String */](src: TSrc): Ref[
    TSrc, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in TSrc ]: TSrc}
    */ typings.knex.knexStrings.Knex with js.Any
  ] = js.native
  def transaction(): js.Promise[Transaction[_, _]] = js.native
  def transaction(transactionScope: Null, config: js.Any): js.Promise[Transaction[_, _]] = js.native
  def transaction[T](transactionScope: js.Function1[/* trx */ Transaction[_, _], js.Promise[T] | Unit]): js.Promise[T] = js.native
  def transaction[T](transactionScope: js.Function1[/* trx */ Transaction[_, _], js.Promise[T] | Unit], config: js.Any): js.Promise[T] = js.native
  def transactionProvider(): js.Function0[js.Promise[Transaction[_, _]]] = js.native
  def transactionProvider(config: js.Any): js.Function0[js.Promise[Transaction[_, _]]] = js.native
}

