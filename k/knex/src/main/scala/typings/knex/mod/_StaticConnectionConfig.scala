package typings.knex.mod

import typings.knex.anon.Readonlyencryptbooleanins
import typings.knex.anon.Readonlyminnumbermaxnumbe
import typings.knex.knexBooleans.`false`
import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StaticConnectionConfig extends js.Object

object _StaticConnectionConfig {
  @scala.inline
  def OracleDbConnectionConfig(
    host: String,
    user: String,
    connectString: String = null,
    database: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    expirationChecker: () => Boolean = null,
    instanceName: String = null,
    password: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (connectString != null) __obj.updateDynamic("connectString")(connectString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def MySqlConnectionConfig(
    bigNumberStrings: js.UndefOr[Boolean] = js.undefined,
    charset: String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    database: String = null,
    dateStrings: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    decimalNumbers: js.UndefOr[Boolean] = js.undefined,
    expirationChecker: () => Boolean = null,
    flags: String = null,
    host: String = null,
    insecureAuth: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    multipleStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    queryFormat: (/* query */ String, /* values */ js.Any) => String = null,
    socketPath: String = null,
    ssl: String | MariaSslConfiguration = null,
    stringifyObjects: js.UndefOr[Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null,
    trace: js.UndefOr[Boolean] = js.undefined,
    typeCast: js.Any = null,
    user: String = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings.get.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(dateStrings)) __obj.updateDynamic("dateStrings")(dateStrings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decimalNumbers)) __obj.updateDynamic("decimalNumbers")(decimalNumbers.get.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(js.Any.fromFunction2(queryFormat))
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.get.asInstanceOf[js.Any])
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def Sqlite3ConnectionConfig(
    filename: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    expirationChecker: () => Boolean = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def MariaSqlConnectionConfig(
    charset: String = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    connTimeout: js.UndefOr[Double] = js.undefined,
    db: String = null,
    expirationChecker: () => Boolean = null,
    host: String = null,
    keepQueries: js.UndefOr[Boolean] = js.undefined,
    local_infile: js.UndefOr[Boolean] = js.undefined,
    multiStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pingInterval: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    read_default_file: String = null,
    read_default_group: String = null,
    secureAuth: js.UndefOr[Boolean] = js.undefined,
    ssl: Boolean | MariaSslConfiguration = null,
    streamHWM: js.UndefOr[Double] = js.undefined,
    unixSocket: String = null,
    user: String = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connTimeout)) __obj.updateDynamic("connTimeout")(connTimeout.get.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepQueries)) __obj.updateDynamic("keepQueries")(keepQueries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_infile)) __obj.updateDynamic("local_infile")(local_infile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiStatements)) __obj.updateDynamic("multiStatements")(multiStatements.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(pingInterval)) __obj.updateDynamic("pingInterval")(pingInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (read_default_file != null) __obj.updateDynamic("read_default_file")(read_default_file.asInstanceOf[js.Any])
    if (read_default_group != null) __obj.updateDynamic("read_default_group")(read_default_group.asInstanceOf[js.Any])
    if (!js.isUndefined(secureAuth)) __obj.updateDynamic("secureAuth")(secureAuth.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(streamHWM)) __obj.updateDynamic("streamHWM")(streamHWM.get.asInstanceOf[js.Any])
    if (unixSocket != null) __obj.updateDynamic("unixSocket")(unixSocket.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def PgConnectionConfig(
    connectionString: String = null,
    connectionTimeoutMillis: js.UndefOr[Double] = js.undefined,
    database: String = null,
    host: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: js.UndefOr[Double] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeoutMillis)) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInitialDelayMillis)) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (statement_timeout != null) __obj.updateDynamic("statement_timeout")(statement_timeout.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def MsSqlConnectionConfig(
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
  ): _StaticConnectionConfig = {
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
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def ConnectionConfig(
    database: String,
    host: String,
    password: String,
    user: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    domain: String = null,
    instanceName: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def SocketConnectionConfig(
    database: String,
    password: String,
    socketPath: String,
    user: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    expirationChecker: () => Boolean = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], socketPath = socketPath.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
}

