package typings.knex.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[SV /* <: js.Object */] extends js.Object {
  var acquireConnectionTimeout: js.UndefOr[Double] = js.undefined
  var asyncStackTraces: js.UndefOr[Boolean] = js.undefined
  var client: js.UndefOr[String | (Instantiable1[/* config */ Config[js.Any], Client])] = js.undefined
  var connection: js.UndefOr[String | StaticConnectionConfig | ConnectionConfigProvider] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var dialect: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[Logger] = js.undefined
  var migrations: js.UndefOr[MigratorConfig] = js.undefined
  var pool: js.UndefOr[PoolConfig] = js.undefined
  var postProcessResponse: js.UndefOr[js.Function2[/* result */ js.Any, /* queryContext */ js.Any, _]] = js.undefined
  var searchPath: js.UndefOr[String | js.Array[String]] = js.undefined
  var seeds: js.UndefOr[SeedsConfig[SV]] = js.undefined
  var useNullAsDefault: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var wrapIdentifier: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* origImpl */ js.Function1[/* value */ String, String], 
      /* queryContext */ js.Any, 
      String
    ]
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply[/* <: js.Object */ SV](
    acquireConnectionTimeout: js.UndefOr[Double] = js.undefined,
    asyncStackTraces: js.UndefOr[Boolean] = js.undefined,
    client: String | (Instantiable1[/* config */ Config[js.Any], Client]) = null,
    connection: String | StaticConnectionConfig | ConnectionConfigProvider = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dialect: String = null,
    log: Logger = null,
    migrations: MigratorConfig = null,
    pool: PoolConfig = null,
    postProcessResponse: (/* result */ js.Any, /* queryContext */ js.Any) => _ = null,
    searchPath: String | js.Array[String] = null,
    seeds: SeedsConfig[SV] = null,
    useNullAsDefault: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    wrapIdentifier: (/* value */ String, /* origImpl */ js.Function1[/* value */ String, String], /* queryContext */ js.Any) => String = null
  ): Config[SV] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acquireConnectionTimeout)) __obj.updateDynamic("acquireConnectionTimeout")(acquireConnectionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncStackTraces)) __obj.updateDynamic("asyncStackTraces")(asyncStackTraces.get.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (dialect != null) __obj.updateDynamic("dialect")(dialect.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (migrations != null) __obj.updateDynamic("migrations")(migrations.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (postProcessResponse != null) __obj.updateDynamic("postProcessResponse")(js.Any.fromFunction2(postProcessResponse))
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (seeds != null) __obj.updateDynamic("seeds")(seeds.asInstanceOf[js.Any])
    if (!js.isUndefined(useNullAsDefault)) __obj.updateDynamic("useNullAsDefault")(useNullAsDefault.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (wrapIdentifier != null) __obj.updateDynamic("wrapIdentifier")(js.Any.fromFunction3(wrapIdentifier))
    __obj.asInstanceOf[Config[SV]]
  }
}

