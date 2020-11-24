package typings.jestDevServer.mod

import typings.jestDevServer.anon.PartialWaitOnOptions
import typings.jestDevServer.jestDevServerStrings.ask
import typings.jestDevServer.jestDevServerStrings.error
import typings.jestDevServer.jestDevServerStrings.http
import typings.jestDevServer.jestDevServerStrings.https
import typings.jestDevServer.jestDevServerStrings.ignore
import typings.jestDevServer.jestDevServerStrings.kill
import typings.jestDevServer.jestDevServerStrings.socket
import typings.jestDevServer.jestDevServerStrings.tcp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var command: String = js.native
  
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
  var debug: js.UndefOr[Boolean] = js.native
  
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
  var host: js.UndefOr[String] = js.native
  
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
  var launchTimeout: js.UndefOr[Double] = js.native
  
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
  var port: js.UndefOr[Double] = js.native
  
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
  var protocol: js.UndefOr[https | http | tcp | socket] = js.native
  
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
  var usedPortAction: js.UndefOr[ask | error | ignore | kill] = js.native
  
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
  var waitOnScheme: js.UndefOr[PartialWaitOnOptions] = js.native
}
object JestDevServerOptions {
  
  @scala.inline
  def apply(command: String): JestDevServerOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestDevServerOptions]
  }
  
  @scala.inline
  implicit class JestDevServerOptionsOps[Self <: JestDevServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLaunchTimeout(value: Double): Self = this.set("launchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTimeout: Self = this.set("launchTimeout", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: https | http | tcp | socket): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setUsedPortAction(value: ask | error | ignore | kill): Self = this.set("usedPortAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedPortAction: Self = this.set("usedPortAction", js.undefined)
    
    @scala.inline
    def setWaitOnScheme(value: PartialWaitOnOptions): Self = this.set("waitOnScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitOnScheme: Self = this.set("waitOnScheme", js.undefined)
  }
}
