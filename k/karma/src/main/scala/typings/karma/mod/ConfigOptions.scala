package typings.karma.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.mod.Appender
import typings.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
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
  var httpsServerOptions: js.UndefOr[ServerOptions] = js.undefined
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
    js.Function4[/* proxyReq */ js.Any, /* req */ js.Any, /* res */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  /**
    * Called when respnsing Proxy
    * @default undefined
    */
  var proxyRes: js.UndefOr[js.Function3[/* proxyRes */ js.Any, /* req */ js.Any, /* res */ js.Any, Unit]] = js.undefined
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
  @scala.inline
  def apply(
    autoWatch: js.UndefOr[Boolean] = js.undefined,
    autoWatchBatchDelay: js.UndefOr[Double] = js.undefined,
    basePath: String = null,
    beforeMiddleware: js.Array[String] = null,
    browserConsoleLogOptions: BrowserConsoleLogOptions = null,
    browserDisconnectTimeout: js.UndefOr[Double] = js.undefined,
    browserDisconnectTolerance: js.UndefOr[Double] = js.undefined,
    browserNoActivityTimeout: js.UndefOr[Double] = js.undefined,
    browserSocketTimeout: js.UndefOr[Double] = js.undefined,
    browsers: js.Array[AutomatedBrowsers | String] = null,
    captureTimeout: js.UndefOr[Double] = js.undefined,
    client: ClientOptions = null,
    colors: js.UndefOr[Boolean] = js.undefined,
    concurrency: js.UndefOr[Double] = js.undefined,
    crossOriginAttribute: js.UndefOr[Boolean] = js.undefined,
    customClientContextFile: String = null,
    customContextFile: String = null,
    customDebugFile: String = null,
    customHeaders: js.Array[CustomHeaders] = null,
    customLaunchers: StringDictionary[CustomLauncher] = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    failOnEmptyTestSuite: js.UndefOr[Boolean] = js.undefined,
    failOnFailingTestSuite: js.UndefOr[Boolean] = js.undefined,
    failOnSkippedTests: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[FilePattern | String] = null,
    forceJSONP: js.UndefOr[Boolean] = js.undefined,
    formatError: /* msg */ String => String = null,
    frameworks: js.Array[String] = null,
    hostname: String = null,
    httpModule: String = null,
    httpsServerOptions: ServerOptions = null,
    listenAddress: String = null,
    logLevel: String = null,
    loggers: StringDictionary[Appender] | js.Array[Appender] = null,
    middleware: js.Array[String] = null,
    mime: StringDictionary[js.Array[String]] = null,
    pingTimeout: js.UndefOr[Double] = js.undefined,
    plugins: js.Array[PluginName | InlinePluginDef] = null,
    port: js.UndefOr[Double] = js.undefined,
    preprocessors: StringDictionary[String | js.Array[String]] = null,
    processKillTimeout: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    proxies: PathProxyPairs = null,
    proxyReq: (/* proxyReq */ js.Any, /* req */ js.Any, /* res */ js.Any, /* options */ js.Object) => Unit = null,
    proxyRes: (/* proxyRes */ js.Any, /* req */ js.Any, /* res */ js.Any) => Unit = null,
    proxyValidateSSL: js.UndefOr[Boolean] = js.undefined,
    reportSlowerThan: js.UndefOr[Double] = js.undefined,
    reporters: js.Array[String] = null,
    restartOnFileChange: js.UndefOr[Boolean] = js.undefined,
    retryLimit: js.UndefOr[Double] = js.undefined,
    singleRun: js.UndefOr[Boolean] = js.undefined,
    transports: js.Array[String] = null,
    upstreamProxy: UpstreamProxy = null,
    urlRoot: String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWatch)) __obj.updateDynamic("autoWatch")(autoWatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWatchBatchDelay)) __obj.updateDynamic("autoWatchBatchDelay")(autoWatchBatchDelay.get.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (beforeMiddleware != null) __obj.updateDynamic("beforeMiddleware")(beforeMiddleware.asInstanceOf[js.Any])
    if (browserConsoleLogOptions != null) __obj.updateDynamic("browserConsoleLogOptions")(browserConsoleLogOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(browserDisconnectTimeout)) __obj.updateDynamic("browserDisconnectTimeout")(browserDisconnectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserDisconnectTolerance)) __obj.updateDynamic("browserDisconnectTolerance")(browserDisconnectTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserNoActivityTimeout)) __obj.updateDynamic("browserNoActivityTimeout")(browserNoActivityTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(browserSocketTimeout)) __obj.updateDynamic("browserSocketTimeout")(browserSocketTimeout.get.asInstanceOf[js.Any])
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (!js.isUndefined(captureTimeout)) __obj.updateDynamic("captureTimeout")(captureTimeout.get.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crossOriginAttribute)) __obj.updateDynamic("crossOriginAttribute")(crossOriginAttribute.get.asInstanceOf[js.Any])
    if (customClientContextFile != null) __obj.updateDynamic("customClientContextFile")(customClientContextFile.asInstanceOf[js.Any])
    if (customContextFile != null) __obj.updateDynamic("customContextFile")(customContextFile.asInstanceOf[js.Any])
    if (customDebugFile != null) __obj.updateDynamic("customDebugFile")(customDebugFile.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (customLaunchers != null) __obj.updateDynamic("customLaunchers")(customLaunchers.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnEmptyTestSuite)) __obj.updateDynamic("failOnEmptyTestSuite")(failOnEmptyTestSuite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnFailingTestSuite)) __obj.updateDynamic("failOnFailingTestSuite")(failOnFailingTestSuite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnSkippedTests)) __obj.updateDynamic("failOnSkippedTests")(failOnSkippedTests.get.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceJSONP)) __obj.updateDynamic("forceJSONP")(forceJSONP.get.asInstanceOf[js.Any])
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (frameworks != null) __obj.updateDynamic("frameworks")(frameworks.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (httpModule != null) __obj.updateDynamic("httpModule")(httpModule.asInstanceOf[js.Any])
    if (httpsServerOptions != null) __obj.updateDynamic("httpsServerOptions")(httpsServerOptions.asInstanceOf[js.Any])
    if (listenAddress != null) __obj.updateDynamic("listenAddress")(listenAddress.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (loggers != null) __obj.updateDynamic("loggers")(loggers.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (!js.isUndefined(pingTimeout)) __obj.updateDynamic("pingTimeout")(pingTimeout.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (preprocessors != null) __obj.updateDynamic("preprocessors")(preprocessors.asInstanceOf[js.Any])
    if (!js.isUndefined(processKillTimeout)) __obj.updateDynamic("processKillTimeout")(processKillTimeout.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxies != null) __obj.updateDynamic("proxies")(proxies.asInstanceOf[js.Any])
    if (proxyReq != null) __obj.updateDynamic("proxyReq")(js.Any.fromFunction4(proxyReq))
    if (proxyRes != null) __obj.updateDynamic("proxyRes")(js.Any.fromFunction3(proxyRes))
    if (!js.isUndefined(proxyValidateSSL)) __obj.updateDynamic("proxyValidateSSL")(proxyValidateSSL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reportSlowerThan)) __obj.updateDynamic("reportSlowerThan")(reportSlowerThan.get.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (!js.isUndefined(restartOnFileChange)) __obj.updateDynamic("restartOnFileChange")(restartOnFileChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryLimit)) __obj.updateDynamic("retryLimit")(retryLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleRun)) __obj.updateDynamic("singleRun")(singleRun.get.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (upstreamProxy != null) __obj.updateDynamic("upstreamProxy")(upstreamProxy.asInstanceOf[js.Any])
    if (urlRoot != null) __obj.updateDynamic("urlRoot")(urlRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

