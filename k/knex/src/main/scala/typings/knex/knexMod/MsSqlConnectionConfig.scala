package typings.knex.knexMod

import typings.knex.Anon_AbortTransactionOnError
import typings.knex.Anon_AcquireTimeoutMillis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mssql: see https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/mssql/index.d.ts
trait MsSqlConnectionConfig extends js.Object {
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var database: String
  var domain: js.UndefOr[String] = js.undefined
  var driver: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[Anon_AbortTransactionOnError] = js.undefined
  var parseJSON: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var pool: js.UndefOr[Anon_AcquireTimeoutMillis] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var server: String
  var stream: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object MsSqlConnectionConfig {
  @scala.inline
  def apply(
    database: String,
    server: String,
    connectionTimeout: Int | Double = null,
    domain: String = null,
    driver: String = null,
    options: Anon_AbortTransactionOnError = null,
    parseJSON: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pool: Anon_AcquireTimeoutMillis = null,
    port: Int | Double = null,
    requestTimeout: Int | Double = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): MsSqlConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database, server = server)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(parseJSON)) __obj.updateDynamic("parseJSON")(parseJSON)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[MsSqlConnectionConfig]
  }
}

