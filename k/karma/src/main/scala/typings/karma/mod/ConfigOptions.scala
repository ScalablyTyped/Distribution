package typings.karma.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.mod.Appender
import typings.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  /**
    * @description Enable or disable watching files and executing the tests whenever one of these files changes.
    * @default true
    */
  var autoWatch: js.UndefOr[Boolean] = js.native
  
  /**
    * @description When Karma is watching the files for changes, it tries to batch multiple changes into a single run
    * so that the test runner doesn't try to start and restart running tests more than it should.
    * The configuration setting tells Karma how long to wait (in milliseconds) after any changes have occurred
    * before starting the test process again.
    * @default 250
    */
  var autoWatchBatchDelay: js.UndefOr[Double] = js.native
  
  /**
    * @default ''
    * @description The root path location that will be used to resolve all relative paths defined in <code>files</code> and <code>exclude</code>.
    * If the basePath configuration is a relative path then it will be resolved to
    * the <code>__dirname</code> of the configuration file.
    */
  var basePath: js.UndefOr[String] = js.native
  
  /**
    * This is the same as middleware except that these middleware will be run before karma's own middleware.
    * @default []
    */
  var beforeMiddleware: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Configure how the browser console is logged with the following properties, all of which are optional
    */
  var browserConsoleLogOptions: js.UndefOr[BrowserConsoleLogOptions] = js.native
  
  /**
    * @default 2000
    * @description How long does Karma wait for a browser to reconnect (in ms).
    * <p>
    * With a flaky connection it is pretty common that the browser disconnects,
    * but the actual test execution is still running without any problems. Karma does not treat a disconnection
    * as immediate failure and will wait <code>browserDisconnectTimeout</code> (ms).
    * If the browser reconnects during that time, everything is fine.
    * </p>
    */
  var browserDisconnectTimeout: js.UndefOr[Double] = js.native
  
  /**
    * @default 0
    * @description The number of disconnections tolerated.
    * <p>
    * The <code>disconnectTolerance</code> value represents the maximum number of tries a browser will attempt
    * in the case of a disconnection. Usually any disconnection is considered a failure,
    * but this option allows you to define a tolerance level when there is a flaky network link between
    * the Karma server and the browsers.
    * </p>
    */
  var browserDisconnectTolerance: js.UndefOr[Double] = js.native
  
  /**
    * @default 10000
    * @description How long will Karma wait for a message from a browser before disconnecting from it (in ms).
    * <p>
    * If, during test execution, Karma does not receive any message from a browser within
    * <code>browserNoActivityTimeout</code> (ms), it will disconnect from the browser
    * </p>
    */
  var browserNoActivityTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Timeout for the client socket connection (in ms)
    * @default 20000
    */
  var browserSocketTimeout: js.UndefOr[Double] = js.native
  
  /**
    * @default []
    * Possible Values:
    * <ul>
    *     <li>Chrome (launcher comes installed with Karma)</li>
    *     <li>ChromeCanary (launcher comes installed with Karma)</li>
    *     <li>PhantomJS (launcher comes installed with Karma)</li>
    *     <li>Firefox (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>FirefoxHeadless (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>FirefoxDeveloper (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>FirefoxDeveloperHeadless (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>FirefoxAurora (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>FirefoxAuroraHeadless (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>FirefoxNightly (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>FirefoxNightlyHeadless (launcher requires karma-firefox-launcher plugin)</li>
    *     <li>Opera (launcher requires karma-opera-launcher plugin)</li>
    *     <li>Internet Explorer (launcher requires karma-ie-launcher plugin)</li>
    *     <li>Safari (launcher requires karma-safari-launcher plugin)</li>
    * </ul>
    * @description A list of browsers to launch and capture. When Karma starts up, it will also start up each browser
    * which is placed within this setting. Once Karma is shut down, it will shut down these browsers as well.
    * You can capture any browser manually by opening the browser and visiting the URL where
    * the Karma web server is listening (by default it is <code>http://localhost:9876/</code>).
    */
  var browsers: js.UndefOr[js.Array[AutomatedBrowsers | String]] = js.native
  
  /**
    * @default 60000
    * @description Timeout for capturing a browser (in ms).
    * <p>
    * The <code>captureTimeout</code> value represents the maximum boot-up time allowed for a
    * browser to start and connect to Karma. If any browser does not get captured within the timeout, Karma
    * will kill it and try to launch it again and, after three attempts to capture it, Karma will give up.
    * </p>
    */
  var captureTimeout: js.UndefOr[Double] = js.native
  
  var client: js.UndefOr[ClientOptions] = js.native
  
  /**
    * @default true
    * @description Enable or disable colors in the output (reporters and logs).
    */
  var colors: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 'Infinity'
    * @description How many browsers Karma launches in parallel.
    * Especially on services like SauceLabs and Browserstack, it makes sense only to launch a limited
    * amount of browsers at once, and only start more when those have finished. Using this configuration,
    * you can specify how many browsers should be running at once at any given point in time.
    */
  var concurrency: js.UndefOr[Double] = js.native
  
  /**
    * When true, this will append the crossorigin attribute to generated script tags,
    * which enables better error reporting for JavaScript files served from a different origin
    * @default true
    */
  var crossOriginAttribute: js.UndefOr[Boolean] = js.native
  
  /**
    * If null (default), uses karma's own client_with_context.html file (which is used when client.runInParent set to true).
    * @default undefined
    */
  var customClientContextFile: js.UndefOr[String] = js.native
  
  /**
    * If null (default), uses karma's own context.html file.
    * @default undefined
    */
  var customContextFile: js.UndefOr[String] = js.native
  
  /**
    * If null (default), uses karma's own debug.html file.
    * @default undefined
    */
  var customDebugFile: js.UndefOr[String] = js.native
  
  /**
    * Custom HTTP headers that will be set upon serving files by Karma's web server.
    * Custom headers are useful, especially with upcoming browser features like Service Workers.
    * @default undefined
    */
  var customHeaders: js.UndefOr[js.Array[CustomHeaders]] = js.native
  
  var customLaunchers: js.UndefOr[StringDictionary[CustomLauncher]] = js.native
  
  /**
    * When true, this will start the karma server in another process, writing no output to the console.
    * The server can be stopped using the karma stop command.
    * @default false
    */
  var detached: js.UndefOr[Boolean] = js.native
  
  /**
    * @default []
    * @description List of files/patterns to exclude from loaded files.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Enable or disable failure on running empty test-suites.
    * If disabled the program will return exit-code 0 and display a warning.
    * @default true
    */
  var failOnEmptyTestSuite: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable failure on failing tests.
    * @default true
    */
  var failOnFailingTestSuite: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable failure on tests deliberately disabled, eg fit() or xit() tests in jasmine.
    * Use this to prevent accidental disabling tests needed to validate production.
    * @default true
    */
  var failOnSkippedTests: js.UndefOr[Boolean] = js.native
  
  /**
    * @default []
    * @description List of files/patterns to load in the browser.
    */
  var files: js.UndefOr[js.Array[FilePattern | String]] = js.native
  
  /**
    * Force socket.io to use JSONP polling instead of XHR polling
    * @default false
    */
  var forceJSONP: js.UndefOr[Boolean] = js.native
  
  /**
    * A new error message line
    * @default undefined
    */
  var formatError: js.UndefOr[js.Function1[/* msg */ String, String]] = js.native
  
  /**
    * @default []
    * @description List of test frameworks you want to use. Typically, you will set this to ['jasmine'], ['mocha'] or ['qunit']...
    * Please note just about all frameworks in Karma require an additional plugin/framework library to be installed (via NPM).
    */
  var frameworks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @default 'localhost'
    * @description Hostname to be used when capturing browsers.
    */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * Module used for Karma webserver
    * @default undefined
    */
  var httpModule: js.UndefOr[String] = js.native
  
  /**
    * @default {}
    * @description Options object to be used by Node's https class.
    * Object description can be found in the
    * [NodeJS.org API docs](https://nodejs.org/api/tls.html#tls_tls_createserver_options_secureconnectionlistener)
    */
  var httpsServerOptions: js.UndefOr[ServerOptions] = js.native
  
  /**
    * Address that the server will listen on. Change to 'localhost' to only listen to the loopback, or '::' to listen on all IPv6 interfaces
    * @default '0.0.0.0' or `LISTEN_ADDR`
    */
  var listenAddress: js.UndefOr[String] = js.native
  
  /**
    * @default config.LOG_INFO
    * Possible values:
    * <ul>
    *   <li>config.LOG_DISABLE</li>
    *   <li>config.LOG_ERROR</li>
    *   <li>config.LOG_WARN</li>
    *   <li>config.LOG_INFO</li>
    *   <li>config.LOG_DEBUG</li>
    * </ul>
    * @description Level of logging.
    */
  var logLevel: js.UndefOr[String] = js.native
  
  /**
    * @default [{type: 'console'}]
    * @description A list of log appenders to be used. See the documentation for [log4js] for more information.
    */
  var loggers: js.UndefOr[StringDictionary[Appender] | js.Array[Appender]] = js.native
  
  /**
    * @default []
    * @description List of names of additional middleware you want the
    * Karma server to use. Middleware will be used in the order listed.
    * You must have installed the middleware via a plugin/framework
    * (either inline or via NPM). Additional information can be found in
    * [plugins](http://karma-runner.github.io/2.0/config/plugins.html).
    * The plugin must provide an express/connect middleware function
    * (details about this can be found in the
    * [Express](http://expressjs.com/guide/using-middleware.html) docs).
    */
  var middleware: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @default {}
    * @description Redefine default mapping from file extensions to MIME-type.
    * Set property name to required MIME, provide Array of extensions (without dots) as it's value.
    */
  var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  /**
    * Socket.io pingTimeout in ms, https://socket.io/docs/server-api/#new-Server-httpServer-options.
    * Very slow networks may need values up to 60000. Larger values delay discovery of deadlock in tests or browser crashes.
    * @default 5000
    */
  var pingTimeout: js.UndefOr[Double] = js.native
  
  /**
    * @default ['karma-*']
    * @description List of plugins to load. A plugin can be a string (in which case it will be required
    * by Karma) or an inlined plugin - Object.
    * By default, Karma loads all sibling NPM modules which have a name starting with karma-*.
    * Note: Just about all plugins in Karma require an additional library to be installed (via NPM).
    */
  var plugins: js.UndefOr[js.Array[PluginName | InlinePluginDef]] = js.native
  
  /**
    * @default 9876
    * @description The port where the web server will be listening.
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * @default {'**\/ *.coffee': 'coffee'}
    * @description A map of preprocessors to use.
    *
    * Preprocessors can be loaded through [plugins].
    *
    * Note: Just about all preprocessors in Karma (other than CoffeeScript and some other defaults)
    * require an additional library to be installed (via NPM).
    *
    * Be aware that preprocessors may be transforming the files and file types that are available at run time. For instance,
    * if you are using the "coverage" preprocessor on your source files, if you then attempt to interactively debug
    * your tests, you'll discover that your expected source code is completely changed from what you expected.  Because
    * of that, you'll want to engineer this so that your automated builds use the coverage entry in the "reporters" list,
    * but your interactive debugging does not.
    *
    */
  var preprocessors: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  
  /**
    * How long will Karma wait for browser process to terminate before sending a SIGKILL signal
    * @default 2000
    */
  var processKillTimeout: js.UndefOr[Double] = js.native
  
  /**
    * @default 'http:'
    * Possible Values:
    * <ul>
    *   <li>http:</li>
    *   <li>https:</li>
    * </ul>
    * @description Protocol used for running the Karma webserver.
    * Determines the use of the Node http or https class.
    * Note: Using <code>'https:'</code> requires you to specify <code>httpsServerOptions</code>.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * @default {}
    * @description A map of path-proxy pairs
    * The proxy can be specified directly by the target url or path, or with an object to configure more options
    */
  var proxies: js.UndefOr[PathProxyPairs] = js.native
  
  /**
    * Called when requesting Proxy
    * @default undefined
    */
  var proxyReq: js.UndefOr[
    js.Function4[/* proxyReq */ js.Any, /* req */ js.Any, /* res */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  /**
    * Called when respnsing Proxy
    * @default undefined
    */
  var proxyRes: js.UndefOr[js.Function3[/* proxyRes */ js.Any, /* req */ js.Any, /* res */ js.Any, Unit]] = js.native
  
  /**
    * @default true
    * @description Whether or not Karma or any browsers should raise an error when an inavlid SSL certificate is found.
    */
  var proxyValidateSSL: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 0
    * @description Karma will report all the tests that are slower than given time limit (in ms).
    * This is disabled by default (since the default value is 0).
    */
  var reportSlowerThan: js.UndefOr[Double] = js.native
  
  /**
    * @default ['progress']
    * Possible Values:
    * <ul>
    *   <li>dots</li>
    *   <li>progress</li>
    * </ul>
    * @description A list of reporters to use.
    * Additional reporters, such as growl, junit, teamcity or coverage can be loaded through plugins.
    * Note: Just about all additional reporters in Karma (other than progress) require an additional library to be installed (via NPM).
    */
  var reporters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When Karma is watching the files for changes, it will delay a new run
    * until the current run is finished. Enabling this setting
    * will cancel the current run and start a new run immediately when a change is detected.
    */
  var restartOnFileChange: js.UndefOr[Boolean] = js.native
  
  /**
    * When a browser crashes, karma will try to relaunch. This defines how many times karma should relaunch a browser before giving up.
    * @default 2
    */
  var retryLimit: js.UndefOr[Double] = js.native
  
  /**
    * @default false
    * @description Continuous Integration mode.
    * If true, Karma will start and capture all configured browsers, run tests and then exit with an exit code of 0 or 1 depending
    * on whether all tests passed or any tests failed.
    */
  var singleRun: js.UndefOr[Boolean] = js.native
  
  /**
    * @default ['polling', 'websocket']
    * @description An array of allowed transport methods between the browser and testing server. This configuration setting
    * is handed off to [socket.io](http://socket.io/) (which manages the communication
    * between browsers and the testing server).
    */
  var transports: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * For use when the Karma server needs to be run behind a proxy that changes the base url, etc
    */
  var upstreamProxy: js.UndefOr[UpstreamProxy] = js.native
  
  /**
    * @default '/'
    * @description The base url, where Karma runs.
    * All of Karma's urls get prefixed with the urlRoot. This is helpful when using proxies, as
    * sometimes you might want to proxy a url that is already taken by Karma.
    */
  var urlRoot: js.UndefOr[String] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoWatch(value: Boolean): Self = this.set("autoWatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWatch: Self = this.set("autoWatch", js.undefined)
    
    @scala.inline
    def setAutoWatchBatchDelay(value: Double): Self = this.set("autoWatchBatchDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWatchBatchDelay: Self = this.set("autoWatchBatchDelay", js.undefined)
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setBeforeMiddlewareVarargs(value: String*): Self = this.set("beforeMiddleware", js.Array(value :_*))
    
    @scala.inline
    def setBeforeMiddleware(value: js.Array[String]): Self = this.set("beforeMiddleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeMiddleware: Self = this.set("beforeMiddleware", js.undefined)
    
    @scala.inline
    def setBrowserConsoleLogOptions(value: BrowserConsoleLogOptions): Self = this.set("browserConsoleLogOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserConsoleLogOptions: Self = this.set("browserConsoleLogOptions", js.undefined)
    
    @scala.inline
    def setBrowserDisconnectTimeout(value: Double): Self = this.set("browserDisconnectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserDisconnectTimeout: Self = this.set("browserDisconnectTimeout", js.undefined)
    
    @scala.inline
    def setBrowserDisconnectTolerance(value: Double): Self = this.set("browserDisconnectTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserDisconnectTolerance: Self = this.set("browserDisconnectTolerance", js.undefined)
    
    @scala.inline
    def setBrowserNoActivityTimeout(value: Double): Self = this.set("browserNoActivityTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserNoActivityTimeout: Self = this.set("browserNoActivityTimeout", js.undefined)
    
    @scala.inline
    def setBrowserSocketTimeout(value: Double): Self = this.set("browserSocketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserSocketTimeout: Self = this.set("browserSocketTimeout", js.undefined)
    
    @scala.inline
    def setBrowsersVarargs(value: (AutomatedBrowsers | String)*): Self = this.set("browsers", js.Array(value :_*))
    
    @scala.inline
    def setBrowsers(value: js.Array[AutomatedBrowsers | String]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    
    @scala.inline
    def setCaptureTimeout(value: Double): Self = this.set("captureTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureTimeout: Self = this.set("captureTimeout", js.undefined)
    
    @scala.inline
    def setClient(value: ClientOptions): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    
    @scala.inline
    def setCrossOriginAttribute(value: Boolean): Self = this.set("crossOriginAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOriginAttribute: Self = this.set("crossOriginAttribute", js.undefined)
    
    @scala.inline
    def setCustomClientContextFile(value: String): Self = this.set("customClientContextFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomClientContextFile: Self = this.set("customClientContextFile", js.undefined)
    
    @scala.inline
    def setCustomContextFile(value: String): Self = this.set("customContextFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomContextFile: Self = this.set("customContextFile", js.undefined)
    
    @scala.inline
    def setCustomDebugFile(value: String): Self = this.set("customDebugFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDebugFile: Self = this.set("customDebugFile", js.undefined)
    
    @scala.inline
    def setCustomHeadersVarargs(value: CustomHeaders*): Self = this.set("customHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCustomHeaders(value: js.Array[CustomHeaders]): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setCustomLaunchers(value: StringDictionary[CustomLauncher]): Self = this.set("customLaunchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLaunchers: Self = this.set("customLaunchers", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFailOnEmptyTestSuite(value: Boolean): Self = this.set("failOnEmptyTestSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnEmptyTestSuite: Self = this.set("failOnEmptyTestSuite", js.undefined)
    
    @scala.inline
    def setFailOnFailingTestSuite(value: Boolean): Self = this.set("failOnFailingTestSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnFailingTestSuite: Self = this.set("failOnFailingTestSuite", js.undefined)
    
    @scala.inline
    def setFailOnSkippedTests(value: Boolean): Self = this.set("failOnSkippedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnSkippedTests: Self = this.set("failOnSkippedTests", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: (FilePattern | String)*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[FilePattern | String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setForceJSONP(value: Boolean): Self = this.set("forceJSONP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceJSONP: Self = this.set("forceJSONP", js.undefined)
    
    @scala.inline
    def setFormatError(value: /* msg */ String => String): Self = this.set("formatError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatError: Self = this.set("formatError", js.undefined)
    
    @scala.inline
    def setFrameworksVarargs(value: String*): Self = this.set("frameworks", js.Array(value :_*))
    
    @scala.inline
    def setFrameworks(value: js.Array[String]): Self = this.set("frameworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworks: Self = this.set("frameworks", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setHttpModule(value: String): Self = this.set("httpModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpModule: Self = this.set("httpModule", js.undefined)
    
    @scala.inline
    def setHttpsServerOptions(value: ServerOptions): Self = this.set("httpsServerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsServerOptions: Self = this.set("httpsServerOptions", js.undefined)
    
    @scala.inline
    def setListenAddress(value: String): Self = this.set("listenAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenAddress: Self = this.set("listenAddress", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLoggersVarargs(value: Appender*): Self = this.set("loggers", js.Array(value :_*))
    
    @scala.inline
    def setLoggers(value: StringDictionary[Appender] | js.Array[Appender]): Self = this.set("loggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggers: Self = this.set("loggers", js.undefined)
    
    @scala.inline
    def setMiddlewareVarargs(value: String*): Self = this.set("middleware", js.Array(value :_*))
    
    @scala.inline
    def setMiddleware(value: js.Array[String]): Self = this.set("middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    
    @scala.inline
    def setMime(value: StringDictionary[js.Array[String]]): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingTimeout: Self = this.set("pingTimeout", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (PluginName | InlinePluginDef)*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[PluginName | InlinePluginDef]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPreprocessors(value: StringDictionary[String | js.Array[String]]): Self = this.set("preprocessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreprocessors: Self = this.set("preprocessors", js.undefined)
    
    @scala.inline
    def setProcessKillTimeout(value: Double): Self = this.set("processKillTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessKillTimeout: Self = this.set("processKillTimeout", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProxies(value: PathProxyPairs): Self = this.set("proxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxies: Self = this.set("proxies", js.undefined)
    
    @scala.inline
    def setProxyReq(
      value: (/* proxyReq */ js.Any, /* req */ js.Any, /* res */ js.Any, /* options */ js.Object) => Unit
    ): Self = this.set("proxyReq", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteProxyReq: Self = this.set("proxyReq", js.undefined)
    
    @scala.inline
    def setProxyRes(value: (/* proxyRes */ js.Any, /* req */ js.Any, /* res */ js.Any) => Unit): Self = this.set("proxyRes", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProxyRes: Self = this.set("proxyRes", js.undefined)
    
    @scala.inline
    def setProxyValidateSSL(value: Boolean): Self = this.set("proxyValidateSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyValidateSSL: Self = this.set("proxyValidateSSL", js.undefined)
    
    @scala.inline
    def setReportSlowerThan(value: Double): Self = this.set("reportSlowerThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportSlowerThan: Self = this.set("reportSlowerThan", js.undefined)
    
    @scala.inline
    def setReportersVarargs(value: String*): Self = this.set("reporters", js.Array(value :_*))
    
    @scala.inline
    def setReporters(value: js.Array[String]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
    
    @scala.inline
    def setRestartOnFileChange(value: Boolean): Self = this.set("restartOnFileChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartOnFileChange: Self = this.set("restartOnFileChange", js.undefined)
    
    @scala.inline
    def setRetryLimit(value: Double): Self = this.set("retryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryLimit: Self = this.set("retryLimit", js.undefined)
    
    @scala.inline
    def setSingleRun(value: Boolean): Self = this.set("singleRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleRun: Self = this.set("singleRun", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: String*): Self = this.set("transports", js.Array(value :_*))
    
    @scala.inline
    def setTransports(value: js.Array[String]): Self = this.set("transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
    
    @scala.inline
    def setUpstreamProxy(value: UpstreamProxy): Self = this.set("upstreamProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpstreamProxy: Self = this.set("upstreamProxy", js.undefined)
    
    @scala.inline
    def setUrlRoot(value: String): Self = this.set("urlRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlRoot: Self = this.set("urlRoot", js.undefined)
  }
}
