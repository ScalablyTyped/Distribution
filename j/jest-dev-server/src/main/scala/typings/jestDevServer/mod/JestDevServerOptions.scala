package typings.jestDevServer.mod

import typings.jestDevServer.jestDevServerStrings.ask
import typings.jestDevServer.jestDevServerStrings.error
import typings.jestDevServer.jestDevServerStrings.http
import typings.jestDevServer.jestDevServerStrings.https
import typings.jestDevServer.jestDevServerStrings.ignore
import typings.jestDevServer.jestDevServerStrings.kill
import typings.jestDevServer.jestDevServerStrings.socket
import typings.jestDevServer.jestDevServerStrings.tcp
import typings.std.Partial
import typings.waitOn.mod.WaitOnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestDevServerOptions extends js.Object {
  /**
    * Command to execute to start the port. Directly passed to spawnd.
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start',
    * }
    * ```
    */
  var command: String
  /**
    * Log server output, useful if server is crashing at start.
    * @default false
    * ```js
    * module.exports = {
    *   command: 'npm run start',
    *   debug: true,
    * }
    * ```
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Host to wait for activity on before considering the server running. Must be used in conjunction with port.
    * @default 'localhost'
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   host: 'customhost.com',
    *   port: 3000
    * }
    * ```
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * How many milliseconds to wait for the spawned server to be available before giving up. Defaults to wait-port's default.
    * @default 5000
    * ```js
    * module.exports = {
    *   command: 'npm run start',
    *   launchTimeout: 30000,
    * }
    * ```
    */
  var launchTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Port to wait for activity on before considering the server running. If not provided, the server is assumed to immediately be running.
    * @default null
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   port: 3000,
    * }
    * ```
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * To wait for an HTTP or TCP endpoint before considering the server running, include http or tcp as a protocol. Must be used in conjunction with port.
    * @default 'tcp'
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   protocol: 'http',
    *   port: 3000,
    * }
    * ```
    */
  var protocol: js.UndefOr[https | http | tcp | socket] = js.undefined
  /**
    * It defines the action to take if port is already used:
    * @default 'ask'
    *
    * - ask: a prompt is shown to decide if you want to kill the process or not
    * - error: an errow is thrown
    * - ignore: your test are executed, we assume that the server is already started
    * - kill: the process is automatically killed without a prompt
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   port: 3000,
    *   usedPortAction: 'kill',
    * }
    */
  var usedPortAction: js.UndefOr[ask | error | ignore | kill] = js.undefined
  /**
    * jest-dev-server uses the wait-on npm package to wait for resources to become available before calling callback.
    * @default {}
    *
    * ```js
    * module.exports = {
    *   command: 'npm run start --port 3000',
    *   port: 3000,
    *   usedPortAction: 'kill',
    *   waitOnScheme: {
    *     delay: 1000,
    *   },
    * }
    */
  var waitOnScheme: js.UndefOr[Partial[WaitOnOptions]] = js.undefined
}

object JestDevServerOptions {
  @scala.inline
  def apply(
    command: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    launchTimeout: Int | Double = null,
    port: Int | Double = null,
    protocol: https | http | tcp | socket = null,
    usedPortAction: ask | error | ignore | kill = null,
    waitOnScheme: Partial[WaitOnOptions] = null
  ): JestDevServerOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (launchTimeout != null) __obj.updateDynamic("launchTimeout")(launchTimeout.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (usedPortAction != null) __obj.updateDynamic("usedPortAction")(usedPortAction.asInstanceOf[js.Any])
    if (waitOnScheme != null) __obj.updateDynamic("waitOnScheme")(waitOnScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestDevServerOptions]
  }
}

