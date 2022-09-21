package typings.karma.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.log4js.mod.Appender
import typings.node.httpsMod.ServerOptions
import typings.node.nodeHttpMod.IncomingMessage
import typings.node.nodeHttpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigOptions extends StObject {
  
  /**
    * @description Enable or disable watching files and executing the tests whenever one of these files changes.
    * @default true
    */
  var autoWatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description When Karma is watching the files for changes, it tries to batch multiple changes into a single run
    * so that the test runner doesn't try to start and restart running tests more than it should.
    * The configuration setting tells Karma how long to wait (in milliseconds) after any changes have occurred
    * before starting the test process again.
    * @default 250
    */
  var autoWatchBatchDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * @default ''
    * @description The root path location that will be used to resolve all relative paths defined in <code>files</code> and <code>exclude</code>.
    * If the basePath configuration is a relative path then it will be resolved to
    * the <code>__dirname</code> of the configuration file.
    */
  var basePath: js.UndefOr[String] = js.undefined
  
  /**
    * This is the same as middleware except that these middleware will be run before karma's own middleware.
    * @default []
    */
  var beforeMiddleware: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Configure how the browser console is logged with the following properties, all of which are optional
    */
  var browserConsoleLogOptions: js.UndefOr[BrowserConsoleLogOptions] = js.undefined
  
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
  var browserDisconnectTimeout: js.UndefOr[Double] = js.undefined
  
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
  var browserDisconnectTolerance: js.UndefOr[Double] = js.undefined
  
  /**
    * @default 10000
    * @description How long will Karma wait for a message from a browser before disconnecting from it (in ms).
    * <p>
    * If, during test execution, Karma does not receive any message from a browser within
    * <code>browserNoActivityTimeout</code> (ms), it will disconnect from the browser
    * </p>
    */
  var browserNoActivityTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Timeout for the client socket connection (in ms)
    * @default 20000
    */
  var browserSocketTimeout: js.UndefOr[Double] = js.undefined
  
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
  var browsers: js.UndefOr[js.Array[AutomatedBrowsers | String]] = js.undefined
  
  /**
    * @default 60000
    * @description Timeout for capturing a browser (in ms).
    * <p>
    * The <code>captureTimeout</code> value represents the maximum boot-up time allowed for a
    * browser to start and connect to Karma. If any browser does not get captured within the timeout, Karma
    * will kill it and try to launch it again and, after three attempts to capture it, Karma will give up.
    * </p>
    */
  var captureTimeout: js.UndefOr[Double] = js.undefined
  
  var client: js.UndefOr[ClientOptions] = js.undefined
  
  /**
    * @default true
    * @description Enable or disable colors in the output (reporters and logs).
    */
  var colors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default 'Infinity'
    * @description How many browsers Karma launches in parallel.
    * Especially on services like SauceLabs and Browserstack, it makes sense only to launch a limited
    * amount of browsers at once, and only start more when those have finished. Using this configuration,
    * you can specify how many browsers should be running at once at any given point in time.
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  
  /**
    * When true, this will append the crossorigin attribute to generated script tags,
    * which enables better error reporting for JavaScript files served from a different origin
    * @default true
    */
  var crossOriginAttribute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If null (default), uses karma's own client_with_context.html file (which is used when client.runInParent set to true).
    * @default undefined
    */
  var customClientContextFile: js.UndefOr[String] = js.undefined
  
  /**
    * If null (default), uses karma's own context.html file.
    * @default undefined
    */
  var customContextFile: js.UndefOr[String] = js.undefined
  
  /**
    * If null (default), uses karma's own debug.html file.
    * @default undefined
    */
  var customDebugFile: js.UndefOr[String] = js.undefined
  
  /**
    * Custom HTTP headers that will be set upon serving files by Karma's web server.
    * Custom headers are useful, especially with upcoming browser features like Service Workers.
    * @default undefined
    */
  var customHeaders: js.UndefOr[js.Array[CustomHeaders]] = js.undefined
  
  var customLaunchers: js.UndefOr[StringDictionary[CustomLauncher]] = js.undefined
  
  /**
    * When true, this will start the karma server in another process, writing no output to the console.
    * The server can be stopped using the karma stop command.
    * @default false
    */
  var detached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default []
    * @description List of files/patterns to exclude from loaded files.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Enable or disable failure on running empty test-suites.
    * If disabled the program will return exit-code 0 and display a warning.
    * @default true
    */
  var failOnEmptyTestSuite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable failure on failing tests.
    * @default true
    */
  var failOnFailingTestSuite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable failure on tests deliberately disabled, eg fit() or xit() tests in jasmine.
    * Use this to prevent accidental disabling tests needed to validate production.
    * @default true
    */
  var failOnSkippedTests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default []
    * @description List of files/patterns to load in the browser.
    */
  var files: js.UndefOr[js.Array[FilePattern | String]] = js.undefined
  
  /**
    * Force socket.io to use JSONP polling instead of XHR polling
    * @default false
    */
  var forceJSONP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A new error message line
    * @default undefined
    */
  var formatError: js.UndefOr[js.Function1[/* msg */ String, String]] = js.undefined
  
  /**
    * @default []
    * @description List of test frameworks you want to use. Typically, you will set this to ['jasmine'], ['mocha'] or ['qunit']...
    * Please note just about all frameworks in Karma require an additional plugin/framework library to be installed (via NPM).
    */
  var frameworks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @default 'localhost'
    * @description Hostname to be used when capturing browsers.
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * Module used for Karma webserver
    * @default undefined
    */
  var httpModule: js.UndefOr[String] = js.undefined
  
  /**
    * @default {}
    * @description Options object to be used by Node's https class.
    * Object description can be found in the
    * [NodeJS.org API docs](https://nodejs.org/api/tls.html#tls_tls_createserver_options_secureconnectionlistener)
    */
  var httpsServerOptions: js.UndefOr[
    ServerOptions[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ] = js.undefined
  
  /**
    * Address that the server will listen on. Change to 'localhost' to only listen to the loopback, or '::' to listen on all IPv6 interfaces
    * @default '0.0.0.0' or `LISTEN_ADDR`
    */
  var listenAddress: js.UndefOr[String] = js.undefined
  
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
  var logLevel: js.UndefOr[String] = js.undefined
  
  /**
    * @default [{type: 'console'}]
    * @description A list of log appenders to be used. See the documentation for [log4js] for more information.
    */
  var loggers: js.UndefOr[StringDictionary[Appender] | js.Array[Appender]] = js.undefined
  
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
  var middleware: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @default {}
    * @description Redefine default mapping from file extensions to MIME-type.
    * Set property name to required MIME, provide Array of extensions (without dots) as it's value.
    */
  var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
    * Socket.io pingTimeout in ms, https://socket.io/docs/server-api/#new-Server-httpServer-options.
    * Very slow networks may need values up to 60000. Larger values delay discovery of deadlock in tests or browser crashes.
    * @default 5000
    */
  var pingTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * @default ['karma-*']
    * @description List of plugins to load. A plugin can be a string (in which case it will be required
    * by Karma) or an inlined plugin - Object.
    * By default, Karma loads all sibling NPM modules which have a name starting with karma-*.
    * Note: Just about all plugins in Karma require an additional library to be installed (via NPM).
    */
  var plugins: js.UndefOr[js.Array[PluginName | InlinePluginDef]] = js.undefined
  
  /**
    * @default 9876
    * @description The port where the web server will be listening.
    */
  var port: js.UndefOr[Double] = js.undefined
  
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
  var preprocessors: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  
  /**
    * How long will Karma wait for browser process to terminate before sending a SIGKILL signal
    * @default 2000
    */
  var processKillTimeout: js.UndefOr[Double] = js.undefined
  
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
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * @default {}
    * @description A map of path-proxy pairs
    * The proxy can be specified directly by the target url or path, or with an object to configure more options
    */
  var proxies: js.UndefOr[PathProxyPairs] = js.undefined
  
  /**
    * Called when requesting Proxy
    * @default undefined
    */
  var proxyReq: js.UndefOr[
    js.Function4[/* proxyReq */ Any, /* req */ Any, /* res */ Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  /**
    * Called when respnsing Proxy
    * @default undefined
    */
  var proxyRes: js.UndefOr[js.Function3[/* proxyRes */ Any, /* req */ Any, /* res */ Any, Unit]] = js.undefined
  
  /**
    * @default true
    * @description Whether or not Karma or any browsers should raise an error when an inavlid SSL certificate is found.
    */
  var proxyValidateSSL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default 0
    * @description Karma will report all the tests that are slower than given time limit (in ms).
    * This is disabled by default (since the default value is 0).
    */
  var reportSlowerThan: js.UndefOr[Double] = js.undefined
  
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
  var reporters: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When Karma is watching the files for changes, it will delay a new run
    * until the current run is finished. Enabling this setting
    * will cancel the current run and start a new run immediately when a change is detected.
    */
  var restartOnFileChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When a browser crashes, karma will try to relaunch. This defines how many times karma should relaunch a browser before giving up.
    * @default 2
    */
  var retryLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * @default false
    * @description Continuous Integration mode.
    * If true, Karma will start and capture all configured browsers, run tests and then exit with an exit code of 0 or 1 depending
    * on whether all tests passed or any tests failed.
    */
  var singleRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default ['polling', 'websocket']
    * @description An array of allowed transport methods between the browser and testing server. This configuration setting
    * is handed off to [socket.io](http://socket.io/) (which manages the communication
    * between browsers and the testing server).
    */
  var transports: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For use when the Karma server needs to be run behind a proxy that changes the base url, etc
    */
  var upstreamProxy: js.UndefOr[UpstreamProxy] = js.undefined
  
  /**
    * @default '/'
    * @description The base url, where Karma runs.
    * All of Karma's urls get prefixed with the urlRoot. This is helpful when using proxies, as
    * sometimes you might want to proxy a url that is already taken by Karma.
    */
  var urlRoot: js.UndefOr[String] = js.undefined
}
object ConfigOptions {
  
  inline def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setAutoWatch(value: Boolean): Self = StObject.set(x, "autoWatch", value.asInstanceOf[js.Any])
    
    inline def setAutoWatchBatchDelay(value: Double): Self = StObject.set(x, "autoWatchBatchDelay", value.asInstanceOf[js.Any])
    
    inline def setAutoWatchBatchDelayUndefined: Self = StObject.set(x, "autoWatchBatchDelay", js.undefined)
    
    inline def setAutoWatchUndefined: Self = StObject.set(x, "autoWatch", js.undefined)
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setBeforeMiddleware(value: js.Array[String]): Self = StObject.set(x, "beforeMiddleware", value.asInstanceOf[js.Any])
    
    inline def setBeforeMiddlewareUndefined: Self = StObject.set(x, "beforeMiddleware", js.undefined)
    
    inline def setBeforeMiddlewareVarargs(value: String*): Self = StObject.set(x, "beforeMiddleware", js.Array(value*))
    
    inline def setBrowserConsoleLogOptions(value: BrowserConsoleLogOptions): Self = StObject.set(x, "browserConsoleLogOptions", value.asInstanceOf[js.Any])
    
    inline def setBrowserConsoleLogOptionsUndefined: Self = StObject.set(x, "browserConsoleLogOptions", js.undefined)
    
    inline def setBrowserDisconnectTimeout(value: Double): Self = StObject.set(x, "browserDisconnectTimeout", value.asInstanceOf[js.Any])
    
    inline def setBrowserDisconnectTimeoutUndefined: Self = StObject.set(x, "browserDisconnectTimeout", js.undefined)
    
    inline def setBrowserDisconnectTolerance(value: Double): Self = StObject.set(x, "browserDisconnectTolerance", value.asInstanceOf[js.Any])
    
    inline def setBrowserDisconnectToleranceUndefined: Self = StObject.set(x, "browserDisconnectTolerance", js.undefined)
    
    inline def setBrowserNoActivityTimeout(value: Double): Self = StObject.set(x, "browserNoActivityTimeout", value.asInstanceOf[js.Any])
    
    inline def setBrowserNoActivityTimeoutUndefined: Self = StObject.set(x, "browserNoActivityTimeout", js.undefined)
    
    inline def setBrowserSocketTimeout(value: Double): Self = StObject.set(x, "browserSocketTimeout", value.asInstanceOf[js.Any])
    
    inline def setBrowserSocketTimeoutUndefined: Self = StObject.set(x, "browserSocketTimeout", js.undefined)
    
    inline def setBrowsers(value: js.Array[AutomatedBrowsers | String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: (AutomatedBrowsers | String)*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setCaptureTimeout(value: Double): Self = StObject.set(x, "captureTimeout", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeoutUndefined: Self = StObject.set(x, "captureTimeout", js.undefined)
    
    inline def setClient(value: ClientOptions): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setCrossOriginAttribute(value: Boolean): Self = StObject.set(x, "crossOriginAttribute", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginAttributeUndefined: Self = StObject.set(x, "crossOriginAttribute", js.undefined)
    
    inline def setCustomClientContextFile(value: String): Self = StObject.set(x, "customClientContextFile", value.asInstanceOf[js.Any])
    
    inline def setCustomClientContextFileUndefined: Self = StObject.set(x, "customClientContextFile", js.undefined)
    
    inline def setCustomContextFile(value: String): Self = StObject.set(x, "customContextFile", value.asInstanceOf[js.Any])
    
    inline def setCustomContextFileUndefined: Self = StObject.set(x, "customContextFile", js.undefined)
    
    inline def setCustomDebugFile(value: String): Self = StObject.set(x, "customDebugFile", value.asInstanceOf[js.Any])
    
    inline def setCustomDebugFileUndefined: Self = StObject.set(x, "customDebugFile", js.undefined)
    
    inline def setCustomHeaders(value: js.Array[CustomHeaders]): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setCustomHeadersVarargs(value: CustomHeaders*): Self = StObject.set(x, "customHeaders", js.Array(value*))
    
    inline def setCustomLaunchers(value: StringDictionary[CustomLauncher]): Self = StObject.set(x, "customLaunchers", value.asInstanceOf[js.Any])
    
    inline def setCustomLaunchersUndefined: Self = StObject.set(x, "customLaunchers", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setFailOnEmptyTestSuite(value: Boolean): Self = StObject.set(x, "failOnEmptyTestSuite", value.asInstanceOf[js.Any])
    
    inline def setFailOnEmptyTestSuiteUndefined: Self = StObject.set(x, "failOnEmptyTestSuite", js.undefined)
    
    inline def setFailOnFailingTestSuite(value: Boolean): Self = StObject.set(x, "failOnFailingTestSuite", value.asInstanceOf[js.Any])
    
    inline def setFailOnFailingTestSuiteUndefined: Self = StObject.set(x, "failOnFailingTestSuite", js.undefined)
    
    inline def setFailOnSkippedTests(value: Boolean): Self = StObject.set(x, "failOnSkippedTests", value.asInstanceOf[js.Any])
    
    inline def setFailOnSkippedTestsUndefined: Self = StObject.set(x, "failOnSkippedTests", js.undefined)
    
    inline def setFiles(value: js.Array[FilePattern | String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: (FilePattern | String)*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setForceJSONP(value: Boolean): Self = StObject.set(x, "forceJSONP", value.asInstanceOf[js.Any])
    
    inline def setForceJSONPUndefined: Self = StObject.set(x, "forceJSONP", js.undefined)
    
    inline def setFormatError(value: /* msg */ String => String): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
    
    inline def setFormatErrorUndefined: Self = StObject.set(x, "formatError", js.undefined)
    
    inline def setFrameworks(value: js.Array[String]): Self = StObject.set(x, "frameworks", value.asInstanceOf[js.Any])
    
    inline def setFrameworksUndefined: Self = StObject.set(x, "frameworks", js.undefined)
    
    inline def setFrameworksVarargs(value: String*): Self = StObject.set(x, "frameworks", js.Array(value*))
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setHttpModule(value: String): Self = StObject.set(x, "httpModule", value.asInstanceOf[js.Any])
    
    inline def setHttpModuleUndefined: Self = StObject.set(x, "httpModule", js.undefined)
    
    inline def setHttpsServerOptions(
      value: ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "httpsServerOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpsServerOptionsUndefined: Self = StObject.set(x, "httpsServerOptions", js.undefined)
    
    inline def setListenAddress(value: String): Self = StObject.set(x, "listenAddress", value.asInstanceOf[js.Any])
    
    inline def setListenAddressUndefined: Self = StObject.set(x, "listenAddress", js.undefined)
    
    inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLoggers(value: StringDictionary[Appender] | js.Array[Appender]): Self = StObject.set(x, "loggers", value.asInstanceOf[js.Any])
    
    inline def setLoggersUndefined: Self = StObject.set(x, "loggers", js.undefined)
    
    inline def setLoggersVarargs(value: Appender*): Self = StObject.set(x, "loggers", js.Array(value*))
    
    inline def setMiddleware(value: js.Array[String]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setMiddlewareVarargs(value: String*): Self = StObject.set(x, "middleware", js.Array(value*))
    
    inline def setMime(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    
    inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
    
    inline def setPlugins(value: js.Array[PluginName | InlinePluginDef]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (PluginName | InlinePluginDef)*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPreprocessors(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
    
    inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
    
    inline def setProcessKillTimeout(value: Double): Self = StObject.set(x, "processKillTimeout", value.asInstanceOf[js.Any])
    
    inline def setProcessKillTimeoutUndefined: Self = StObject.set(x, "processKillTimeout", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProxies(value: PathProxyPairs): Self = StObject.set(x, "proxies", value.asInstanceOf[js.Any])
    
    inline def setProxiesUndefined: Self = StObject.set(x, "proxies", js.undefined)
    
    inline def setProxyReq(value: (/* proxyReq */ Any, /* req */ Any, /* res */ Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "proxyReq", js.Any.fromFunction4(value))
    
    inline def setProxyReqUndefined: Self = StObject.set(x, "proxyReq", js.undefined)
    
    inline def setProxyRes(value: (/* proxyRes */ Any, /* req */ Any, /* res */ Any) => Unit): Self = StObject.set(x, "proxyRes", js.Any.fromFunction3(value))
    
    inline def setProxyResUndefined: Self = StObject.set(x, "proxyRes", js.undefined)
    
    inline def setProxyValidateSSL(value: Boolean): Self = StObject.set(x, "proxyValidateSSL", value.asInstanceOf[js.Any])
    
    inline def setProxyValidateSSLUndefined: Self = StObject.set(x, "proxyValidateSSL", js.undefined)
    
    inline def setReportSlowerThan(value: Double): Self = StObject.set(x, "reportSlowerThan", value.asInstanceOf[js.Any])
    
    inline def setReportSlowerThanUndefined: Self = StObject.set(x, "reportSlowerThan", js.undefined)
    
    inline def setReporters(value: js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
    
    inline def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value*))
    
    inline def setRestartOnFileChange(value: Boolean): Self = StObject.set(x, "restartOnFileChange", value.asInstanceOf[js.Any])
    
    inline def setRestartOnFileChangeUndefined: Self = StObject.set(x, "restartOnFileChange", js.undefined)
    
    inline def setRetryLimit(value: Double): Self = StObject.set(x, "retryLimit", value.asInstanceOf[js.Any])
    
    inline def setRetryLimitUndefined: Self = StObject.set(x, "retryLimit", js.undefined)
    
    inline def setSingleRun(value: Boolean): Self = StObject.set(x, "singleRun", value.asInstanceOf[js.Any])
    
    inline def setSingleRunUndefined: Self = StObject.set(x, "singleRun", js.undefined)
    
    inline def setTransports(value: js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    inline def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value*))
    
    inline def setUpstreamProxy(value: UpstreamProxy): Self = StObject.set(x, "upstreamProxy", value.asInstanceOf[js.Any])
    
    inline def setUpstreamProxyUndefined: Self = StObject.set(x, "upstreamProxy", js.undefined)
    
    inline def setUrlRoot(value: String): Self = StObject.set(x, "urlRoot", value.asInstanceOf[js.Any])
    
    inline def setUrlRootUndefined: Self = StObject.set(x, "urlRoot", js.undefined)
  }
}
