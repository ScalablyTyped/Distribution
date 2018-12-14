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

