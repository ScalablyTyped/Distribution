package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Knex[TRecord /* <: js.Object */, TResult]
  extends nodeLib.eventsMod.EventEmitter
     with QueryInterface[TRecord, TResult] {
  var VERSION: java.lang.String = js.native
  var __knex__ : java.lang.String = js.native
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
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def batchInsert(tableName: TableDescriptor, data: js.Array[_]): QueryBuilder[TRecord, js.Object] = js.native
  def batchInsert(tableName: TableDescriptor, data: js.Array[_], chunkSize: scala.Double): QueryBuilder[TRecord, js.Object] = js.native
  def destroy(): js.Promise[scala.Unit] = js.native
  def destroy(callback: js.Function): scala.Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def initialize(): scala.Unit = js.native
  def initialize(config: Config): scala.Unit = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def queryBuilder[TRecord2, TResult2](): QueryBuilder[TRecord2, TResult2] = js.native
  def raw[TResult2](sql: java.lang.String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: java.lang.String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: Value): Raw[TResult2] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def ref[TSrc /* <: java.lang.String */](src: TSrc): Ref[
    TSrc, 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in TSrc ]: TSrc}
    */ knexLib.knexLibStrings.Knex with js.Any
  ] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def transaction(): js.Promise[Transaction[_, _]] = js.native
  def transaction(transactionScope: scala.Null, config: js.Any): js.Promise[Transaction[_, _]] = js.native
  def transaction[T](transactionScope: js.Function1[/* trx */ Transaction[_, _], js.Promise[T] | scala.Unit]): js.Promise[T] = js.native
  def transaction[T](
    transactionScope: js.Function1[/* trx */ Transaction[_, _], js.Promise[T] | scala.Unit],
    config: js.Any
  ): js.Promise[T] = js.native
  def transactionProvider(): js.Function0[js.Promise[Transaction[_, _]]] = js.native
  def transactionProvider(config: js.Any): js.Function0[js.Promise[Transaction[_, _]]] = js.native
}

