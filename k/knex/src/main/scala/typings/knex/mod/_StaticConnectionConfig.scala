package typings.knex.mod

import typings.knex.AnonAbortTransactionOnError
import typings.knex.AnonAcquireTimeoutMillis
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
    requestTimeout: Int | Double = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (connectString != null) __obj.updateDynamic("connectString")(connectString.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def MySqlConnectionConfig(
    bigNumberStrings: js.UndefOr[Boolean] = js.undefined,
    charset: String = null,
    connectTimeout: Int | Double = null,
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
    port: Int | Double = null,
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
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(dateStrings)) __obj.updateDynamic("dateStrings")(dateStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(decimalNumbers)) __obj.updateDynamic("decimalNumbers")(decimalNumbers.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(js.Any.fromFunction2(queryFormat))
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
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
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def MariaSqlConnectionConfig(
    charset: String = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    connTimeout: Int | Double = null,
    db: String = null,
    expirationChecker: () => Boolean = null,
    host: String = null,
    keepQueries: js.UndefOr[Boolean] = js.undefined,
    local_infile: js.UndefOr[Boolean] = js.undefined,
    multiStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pingInterval: Int | Double = null,
    port: Int | Double = null,
    protocol: String = null,
    read_default_file: String = null,
    read_default_group: String = null,
    secureAuth: js.UndefOr[Boolean] = js.undefined,
    ssl: Boolean | MariaSslConfiguration = null,
    streamHWM: Int | Double = null,
    unixSocket: String = null,
    user: String = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (connTimeout != null) __obj.updateDynamic("connTimeout")(connTimeout.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepQueries)) __obj.updateDynamic("keepQueries")(keepQueries.asInstanceOf[js.Any])
    if (!js.isUndefined(local_infile)) __obj.updateDynamic("local_infile")(local_infile.asInstanceOf[js.Any])
    if (!js.isUndefined(multiStatements)) __obj.updateDynamic("multiStatements")(multiStatements.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (read_default_file != null) __obj.updateDynamic("read_default_file")(read_default_file.asInstanceOf[js.Any])
    if (read_default_group != null) __obj.updateDynamic("read_default_group")(read_default_group.asInstanceOf[js.Any])
    if (!js.isUndefined(secureAuth)) __obj.updateDynamic("secureAuth")(secureAuth.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (streamHWM != null) __obj.updateDynamic("streamHWM")(streamHWM.asInstanceOf[js.Any])
    if (unixSocket != null) __obj.updateDynamic("unixSocket")(unixSocket.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
  @scala.inline
  def PgConnectionConfig(
    connectionString: String = null,
    connectionTimeoutMillis: Int | Double = null,
    database: String = null,
    host: String = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveInitialDelayMillis: Int | Double = null,
    password: String = null,
    port: Int | Double = null,
    ssl: Boolean | ConnectionOptions = null,
    statement_timeout: `false` | Double = null,
    stream: Duplex = null,
    user: String = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (connectionTimeoutMillis != null) __obj.updateDynamic("connectionTimeoutMillis")(connectionTimeoutMillis.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (keepAliveInitialDelayMillis != null) __obj.updateDynamic("keepAliveInitialDelayMillis")(keepAliveInitialDelayMillis.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
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
    connectionTimeout: Int | Double = null,
    domain: String = null,
    driver: String = null,
    expirationChecker: () => Boolean = null,
    options: AnonAbortTransactionOnError = null,
    parseJSON: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pool: AnonAcquireTimeoutMillis = null,
    port: Int | Double = null,
    requestTimeout: Int | Double = null,
    stream: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(parseJSON)) __obj.updateDynamic("parseJSON")(parseJSON.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
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
    requestTimeout: Int | Double = null
  ): _StaticConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
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
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (expirationChecker != null) __obj.updateDynamic("expirationChecker")(js.Any.fromFunction0(expirationChecker))
    __obj.asInstanceOf[_StaticConnectionConfig]
  }
}

