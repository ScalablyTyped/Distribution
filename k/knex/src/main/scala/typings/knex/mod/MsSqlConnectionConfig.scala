package typings.knex.mod

import typings.knex.anon.Readonlyencryptbooleanins
import typings.knex.anon.Readonlyminnumbermaxnumbe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mssql: see https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/mssql/index.d.ts
trait MsSqlConnectionConfig extends _StaticConnectionConfig {
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var database: String
  var domain: js.UndefOr[String] = js.undefined
  var driver: js.UndefOr[String] = js.undefined
  var expirationChecker: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var options: js.UndefOr[Readonlyencryptbooleanins] = js.undefined
  var parseJSON: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var pool: js.UndefOr[Readonlyminnumbermaxnumbe] = js.undefined
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
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    domain: String = null,
    driver: String = null,
    expirationChecker: () => Boolean = null,
    options: Readonlyencryptbooleanins = null,
    parseJSON: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pool: Readonlyminnumbermaxnumbe = null,
    port: js.UndefOr[Double] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): MsSqlConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(parseJSON)) __obj.updateDynamic("parseJSON")(parseJSON.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSqlConnectionConfig]
  }
}

