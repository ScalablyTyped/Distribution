package typings.jestDevServer

import typings.jestDevServer.anon.PartialWaitOnOptions
import typings.jestDevServer.jestDevServerStrings.ask
import typings.jestDevServer.jestDevServerStrings.error
import typings.jestDevServer.jestDevServerStrings.http
import typings.jestDevServer.jestDevServerStrings.https
import typings.jestDevServer.jestDevServerStrings.ignore
import typings.jestDevServer.jestDevServerStrings.kill
import typings.jestDevServer.jestDevServerStrings.socket
import typings.jestDevServer.jestDevServerStrings.tcp
import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-dev-server", "ERROR_NO_COMMAND")
  @js.native
  val ERROR_NO_COMMAND: typings.jestDevServer.jestDevServerStrings.ERROR_NO_COMMAND = js.native
  
  @JSImport("jest-dev-server", "ERROR_PORT_USED")
  @js.native
  val ERROR_PORT_USED: typings.jestDevServer.jestDevServerStrings.ERROR_PORT_USED = js.native
  
  @JSImport("jest-dev-server", "ERROR_TIMEOUT")
  @js.native
  val ERROR_TIMEOUT: typings.jestDevServer.jestDevServerStrings.ERROR_TIMEOUT = js.native
  
  @JSImport("jest-dev-server", "JestDevServerError")
  @js.native
  class JestDevServerError () extends Error
  
  @JSImport("jest-dev-server", "getServers")
  @js.native
  def getServers(): js.Array[ChildProcess] = js.native
  
  @JSImport("jest-dev-server", "setup")
  @js.native
  def setup(options: js.Array[JestDevServerOptions]): js.Promise[Unit] = js.native
  @JSImport("jest-dev-server", "setup")
  @js.native
  def setup(options: JestDevServerOptions): js.Promise[Unit] = js.native
  
  @JSImport("jest-dev-server", "teardown")
  @js.native
  def teardown(): js.Promise[Unit] = js.native
  
  @js.native
  trait JestDevServerOptions extends StObject {
    
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
    implicit class JestDevServerOptionsMutableBuilder[Self <: JestDevServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLaunchTimeout(value: Double): Self = StObject.set(x, "launchTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTimeoutUndefined: Self = StObject.set(x, "launchTimeout", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: https | http | tcp | socket): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setUsedPortAction(value: ask | error | ignore | kill): Self = StObject.set(x, "usedPortAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedPortActionUndefined: Self = StObject.set(x, "usedPortAction", js.undefined)
      
      @scala.inline
      def setWaitOnScheme(value: PartialWaitOnOptions): Self = StObject.set(x, "waitOnScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitOnSchemeUndefined: Self = StObject.set(x, "waitOnScheme", js.undefined)
    }
  }
}
