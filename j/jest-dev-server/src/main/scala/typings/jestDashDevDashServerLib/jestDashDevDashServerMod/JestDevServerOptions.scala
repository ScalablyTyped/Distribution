package typings
package jestDashDevDashServerLib.jestDashDevDashServerMod

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
  var command: java.lang.String
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
  var debug: js.UndefOr[scala.Boolean] = js.undefined
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
  var host: js.UndefOr[java.lang.String] = js.undefined
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
  var launchTimeout: js.UndefOr[scala.Double] = js.undefined
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
  var port: js.UndefOr[scala.Double] = js.undefined
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
  var protocol: js.UndefOr[
    jestDashDevDashServerLib.jestDashDevDashServerLibStrings.https | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.http | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.tcp | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.socket
  ] = js.undefined
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
  var usedPortAction: js.UndefOr[
    jestDashDevDashServerLib.jestDashDevDashServerLibStrings.ask | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.error | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.ignore | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.kill
  ] = js.undefined
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
  var waitOnScheme: js.UndefOr[stdLib.Partial[waitDashOnLib.waitDashOnMod.WaitOnOptions]] = js.undefined
}

object JestDevServerOptions {
  @scala.inline
  def apply(
    command: java.lang.String,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    launchTimeout: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    protocol: jestDashDevDashServerLib.jestDashDevDashServerLibStrings.https | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.http | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.tcp | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.socket = null,
    usedPortAction: jestDashDevDashServerLib.jestDashDevDashServerLibStrings.ask | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.error | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.ignore | jestDashDevDashServerLib.jestDashDevDashServerLibStrings.kill = null,
    waitOnScheme: stdLib.Partial[waitDashOnLib.waitDashOnMod.WaitOnOptions] = null
  ): JestDevServerOptions = {
    val __obj = js.Dynamic.literal(command = command)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (host != null) __obj.updateDynamic("host")(host)
    if (launchTimeout != null) __obj.updateDynamic("launchTimeout")(launchTimeout.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (usedPortAction != null) __obj.updateDynamic("usedPortAction")(usedPortAction.asInstanceOf[js.Any])
    if (waitOnScheme != null) __obj.updateDynamic("waitOnScheme")(waitOnScheme)
    __obj.asInstanceOf[JestDevServerOptions]
  }
}

