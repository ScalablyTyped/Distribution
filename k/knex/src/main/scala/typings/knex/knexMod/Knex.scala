package typings.knex.knexMod

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
  var raw_Original: RawBuilder[TRecord, TResult] = js.native
  @JSName("ref")
  var ref_Original: RefBuilder = js.native
  var schema: SchemaBuilder = js.native
  var seed: Seeder = js.native
  def apply[TRecord2, TResult2](): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: AliasDict): QueryBuilder[TRecord2, TResult2] = js.native
  def apply[TRecord2, TResult2](tableName: TableDescriptor): QueryBuilder[TRecord2, TResult2] = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def batchInsert(tableName: TableDescriptor, data: js.Array[_]): QueryBuilder[TRecord, js.Object] = js.native
  def batchInsert(tableName: TableDescriptor, data: js.Array[_], chunkSize: Double): QueryBuilder[TRecord, js.Object] = js.native
  def destroy(): js.Promise[Unit] = js.native
  def destroy(callback: js.Function): Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  def initialize(): Unit = js.native
  def initialize(config: Config): Unit = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def queryBuilder[TRecord2, TResult2](): QueryBuilder[TRecord2, TResult2] = js.native
  def raw[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: Value): Raw[TResult2] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def ref[TSrc /* <: String */](src: TSrc): Ref[
    TSrc, 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TSrc ]: TSrc}
    */ typings.knex.knexStrings.Knex with js.Any
  ] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  def transaction(): js.Promise[Transaction[_, _]] = js.native
  def transaction(transactionScope: Null, config: js.Any): js.Promise[Transaction[_, _]] = js.native
  def transaction[T](transactionScope: js.Function1[/* trx */ Transaction[_, _], js.Promise[T] | Unit]): js.Promise[T] = js.native
  def transaction[T](transactionScope: js.Function1[/* trx */ Transaction[_, _], js.Promise[T] | Unit], config: js.Any): js.Promise[T] = js.native
  def transactionProvider(): js.Function0[js.Promise[Transaction[_, _]]] = js.native
  def transactionProvider(config: js.Any): js.Function0[js.Promise[Transaction[_, _]]] = js.native
}

