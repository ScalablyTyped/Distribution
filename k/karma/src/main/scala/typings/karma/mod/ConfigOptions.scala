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
  var browsers: js.UndefOr[js.Array[String]] = js.undefined
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
  var customLaunchers: js.UndefOr[StringDictionary[CustomLauncher]] = js.undefined
  /**
    * @default []
    * @description List of files/patterns to exclude from loaded files.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @default []
    * @description List of files/patterns to load in the browser.
    */
  var files: js.UndefOr[js.Array[FilePattern | String]] = js.undefined
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
    * @default {}
    * @description Options object to be used by Node's https class.
    * Object description can be found in the
    * [NodeJS.org API docs](https://nodejs.org/api/tls.html#tls_tls_createserver_options_secureconnectionlistener)
    */
  var httpsServerOptions: js.UndefOr[ServerOptions] = js.undefined
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
    * @default ['karma-*']
    * @description List of plugins to load. A plugin can be a string (in which case it will be required
    * by Karma) or an inlined plugin - Object.
    * By default, Karma loads all sibling NPM modules which have a name starting with karma-*.
    * Note: Just about all plugins in Karma require an additional library to be installed (via NPM).
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
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
    * @description A map of path-proxy pairs.
    */
  var proxies: js.UndefOr[StringDictionary[String]] = js.undefined
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
    autoWatchBatchDelay: Int | Double = null,
    basePath: String = null,
    browserDisconnectTimeout: Int | Double = null,
    browserDisconnectTolerance: Int | Double = null,
    browserNoActivityTimeout: Int | Double = null,
    browsers: js.Array[String] = null,
    captureTimeout: Int | Double = null,
    client: ClientOptions = null,
    colors: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    customLaunchers: StringDictionary[CustomLauncher] = null,
    exclude: js.Array[String] = null,
    files: js.Array[FilePattern | String] = null,
    frameworks: js.Array[String] = null,
    hostname: String = null,
    httpsServerOptions: ServerOptions = null,
    logLevel: String = null,
    loggers: StringDictionary[Appender] | js.Array[Appender] = null,
    middleware: js.Array[String] = null,
    mime: StringDictionary[js.Array[String]] = null,
    plugins: js.Array[_] = null,
    port: Int | Double = null,
    preprocessors: StringDictionary[String | js.Array[String]] = null,
    protocol: String = null,
    proxies: StringDictionary[String] = null,
    proxyValidateSSL: js.UndefOr[Boolean] = js.undefined,
    reportSlowerThan: Int | Double = null,
    reporters: js.Array[String] = null,
    restartOnFileChange: js.UndefOr[Boolean] = js.undefined,
    singleRun: js.UndefOr[Boolean] = js.undefined,
    transports: js.Array[String] = null,
    urlRoot: String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWatch)) __obj.updateDynamic("autoWatch")(autoWatch.asInstanceOf[js.Any])
    if (autoWatchBatchDelay != null) __obj.updateDynamic("autoWatchBatchDelay")(autoWatchBatchDelay.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (browserDisconnectTimeout != null) __obj.updateDynamic("browserDisconnectTimeout")(browserDisconnectTimeout.asInstanceOf[js.Any])
    if (browserDisconnectTolerance != null) __obj.updateDynamic("browserDisconnectTolerance")(browserDisconnectTolerance.asInstanceOf[js.Any])
    if (browserNoActivityTimeout != null) __obj.updateDynamic("browserNoActivityTimeout")(browserNoActivityTimeout.asInstanceOf[js.Any])
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (captureTimeout != null) __obj.updateDynamic("captureTimeout")(captureTimeout.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (customLaunchers != null) __obj.updateDynamic("customLaunchers")(customLaunchers.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (frameworks != null) __obj.updateDynamic("frameworks")(frameworks.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (httpsServerOptions != null) __obj.updateDynamic("httpsServerOptions")(httpsServerOptions.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (loggers != null) __obj.updateDynamic("loggers")(loggers.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preprocessors != null) __obj.updateDynamic("preprocessors")(preprocessors.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxies != null) __obj.updateDynamic("proxies")(proxies.asInstanceOf[js.Any])
    if (!js.isUndefined(proxyValidateSSL)) __obj.updateDynamic("proxyValidateSSL")(proxyValidateSSL.asInstanceOf[js.Any])
    if (reportSlowerThan != null) __obj.updateDynamic("reportSlowerThan")(reportSlowerThan.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (!js.isUndefined(restartOnFileChange)) __obj.updateDynamic("restartOnFileChange")(restartOnFileChange.asInstanceOf[js.Any])
    if (!js.isUndefined(singleRun)) __obj.updateDynamic("singleRun")(singleRun.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (urlRoot != null) __obj.updateDynamic("urlRoot")(urlRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

