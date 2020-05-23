package typings.knex.mod

import typings.knex.anon.Max
import typings.node.eventsMod.EventEmitter
import typings.tarn.mod.Pool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Clients
//
@JSImport("knex", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(config: Config[_]) = this()
  var canCancelQuery: Boolean = js.native
  var config: Config[_] = js.native
  var connectionConfigExpirationChecker: Null | js.Function0[Boolean] = js.native
  var connectionConfigProvider: js.Any = js.native
  var connectionSettings: js.Object = js.native
  var dialect: String = js.native
  var driver: js.Any = js.native
  var driverName: String = js.native
  var logger: Logger = js.native
  var pool: js.UndefOr[Pool[_]] = js.native
  var valueForUndefined: js.Any = js.native
  var version: js.UndefOr[String] = js.native
  def acquireConnection(): js.Any = js.native
  def acquireRawConnection(): js.Promise[_] = js.native
  def assertCanCancelQuery(): Unit = js.native
  def cancelQuery(): Unit = js.native
  def columnBuilder(tableBuilder: js.Any, `type`: js.Any, args: js.Any): ColumnBuilder = js.native
  def columnCompiler(tableBuilder: js.Any, columnBuilder: js.Any): js.Any = js.native
  def customWrapIdentifier(value: js.Any, origImpl: js.Any, queryContext: js.Any): js.Any = js.native
  def database(): js.Any = js.native
  def destroy(callback: js.Any): js.Any = js.native
  def destroyRawConnection(connection: js.Any): js.Promise[Unit] = js.native
  def formatter(builder: js.Any): js.Any = js.native
  def getPoolSettings(poolConfig: js.Any): js.Any = js.native
  def initializeDriver(): Unit = js.native
  def initializePool(): Unit = js.native
  def initializePool(config: js.Object): Unit = js.native
  def poolDefaults(): Max = js.native
  def positionBindings(sql: js.Any): js.Any = js.native
  def postProcessResponse(resp: js.Any, queryContext: js.Any): js.Any = js.native
  def prepBindings(bindings: js.Any): js.Any = js.native
  def query(connection: js.Any, obj: js.Any): js.Any = js.native
  def queryBuilder(): QueryBuilder[_, _] = js.native
  def queryCompiler(builder: js.Any): js.Any = js.native
  def raw(args: js.Any*): js.Any = js.native
  def ref(args: js.Any*): Ref[_, _] = js.native
  def releaseConnection(connection: js.Any): js.Any = js.native
  def runner(builder: js.Any): js.Any = js.native
  def schemaBuilder(): SchemaBuilder = js.native
  def schemaCompiler(builder: SchemaBuilder): js.Any = js.native
  def stream(connection: js.Any, obj: js.Any, stream: js.Any, options: js.Any): js.Any = js.native
  def tableBuilder(`type`: js.Any, tableName: js.Any, fn: js.Any): TableBuilder = js.native
  def tableCompiler(tableBuilder: js.Any): js.Any = js.native
  def transaction(container: js.Any, config: js.Any, outerTx: js.Any): Transaction[_, _] = js.native
  def validateConnection(connection: js.Any): js.Promise[Boolean] = js.native
  def wrapIdentifier(value: js.Any, queryContext: js.Any): js.Any = js.native
  def wrapIdentifierImpl(value: js.Any): String = js.native
}

