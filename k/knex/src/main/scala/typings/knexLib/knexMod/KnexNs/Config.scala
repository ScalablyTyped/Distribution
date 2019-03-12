package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var acquireConnectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var asyncStackTraces: js.UndefOr[scala.Boolean] = js.undefined
  var client: js.UndefOr[
    java.lang.String | (org.scalablytyped.runtime.Instantiable1[/* config */ Config, Client])
  ] = js.undefined
  var connection: js.UndefOr[
    java.lang.String | ConnectionConfig | MariaSqlConnectionConfig | MySqlConnectionConfig | MsSqlConnectionConfig | Sqlite3ConnectionConfig | SocketConnectionConfig
  ] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var dialect: js.UndefOr[java.lang.String] = js.undefined
  var migrations: js.UndefOr[MigratorConfig] = js.undefined
  var pool: js.UndefOr[PoolConfig] = js.undefined
  var postProcessResponse: js.UndefOr[js.Function2[/* result */ js.Any, /* queryContext */ js.Any, _]] = js.undefined
  var searchPath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var seeds: js.UndefOr[SeedsConfig] = js.undefined
  var useNullAsDefault: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var wrapIdentifier: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* origImpl */ js.Function1[/* value */ java.lang.String, java.lang.String], 
      /* queryContext */ js.Any, 
      java.lang.String
    ]
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    acquireConnectionTimeout: scala.Int | scala.Double = null,
    asyncStackTraces: js.UndefOr[scala.Boolean] = js.undefined,
    client: java.lang.String | (org.scalablytyped.runtime.Instantiable1[/* config */ Config, Client]) = null,
    connection: java.lang.String | ConnectionConfig | MariaSqlConnectionConfig | MySqlConnectionConfig | MsSqlConnectionConfig | Sqlite3ConnectionConfig | SocketConnectionConfig = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dialect: java.lang.String = null,
    migrations: MigratorConfig = null,
    pool: PoolConfig = null,
    postProcessResponse: (/* result */ js.Any, /* queryContext */ js.Any) => _ = null,
    searchPath: java.lang.String | js.Array[java.lang.String] = null,
    seeds: SeedsConfig = null,
    useNullAsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    wrapIdentifier: (/* value */ java.lang.String, /* origImpl */ js.Function1[/* value */ java.lang.String, java.lang.String], /* queryContext */ js.Any) => java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (acquireConnectionTimeout != null) __obj.updateDynamic("acquireConnectionTimeout")(acquireConnectionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncStackTraces)) __obj.updateDynamic("asyncStackTraces")(asyncStackTraces)
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dialect != null) __obj.updateDynamic("dialect")(dialect)
    if (migrations != null) __obj.updateDynamic("migrations")(migrations)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (postProcessResponse != null) __obj.updateDynamic("postProcessResponse")(js.Any.fromFunction2(postProcessResponse))
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (seeds != null) __obj.updateDynamic("seeds")(seeds)
    if (!js.isUndefined(useNullAsDefault)) __obj.updateDynamic("useNullAsDefault")(useNullAsDefault)
    if (version != null) __obj.updateDynamic("version")(version)
    if (wrapIdentifier != null) __obj.updateDynamic("wrapIdentifier")(js.Any.fromFunction3(wrapIdentifier))
    __obj.asInstanceOf[Config]
  }
}

