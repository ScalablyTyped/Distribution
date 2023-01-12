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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-dev-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  open class JestDevServerError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def getServers(): js.Array[ChildProcess] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[ChildProcess]]
  
  inline def setup(options: js.Array[JestDevServerOptions]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setup(options: JestDevServerOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def teardown(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("teardown")().asInstanceOf[js.Promise[Unit]]
  
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
      * Path to resource to wait for activity on before considering the server running. Must be used in conjunction with host and port.
      * @default null
      *
      * ```js
      * module.exports = {
      *   command: 'npm run start --port 3000',
      *   host: 'customhost.com',
      *   port: 3000,
      *   path: 'thing',
      * }
      * ```
      */
    var path: js.UndefOr[String] = js.undefined
    
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
    var waitOnScheme: js.UndefOr[PartialWaitOnOptions] = js.undefined
  }
  object JestDevServerOptions {
    
    inline def apply(command: String): JestDevServerOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestDevServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JestDevServerOptions] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLaunchTimeout(value: Double): Self = StObject.set(x, "launchTimeout", value.asInstanceOf[js.Any])
      
      inline def setLaunchTimeoutUndefined: Self = StObject.set(x, "launchTimeout", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: https | http | tcp | socket): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setUsedPortAction(value: ask | error | ignore | kill): Self = StObject.set(x, "usedPortAction", value.asInstanceOf[js.Any])
      
      inline def setUsedPortActionUndefined: Self = StObject.set(x, "usedPortAction", js.undefined)
      
      inline def setWaitOnScheme(value: PartialWaitOnOptions): Self = StObject.set(x, "waitOnScheme", value.asInstanceOf[js.Any])
      
      inline def setWaitOnSchemeUndefined: Self = StObject.set(x, "waitOnScheme", js.undefined)
    }
  }
}
