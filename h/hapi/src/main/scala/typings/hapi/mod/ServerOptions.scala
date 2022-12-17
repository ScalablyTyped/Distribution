package typings.hapi.mod

import org.scalablytyped.runtime.Instantiable1
import typings.catbox.mod.ClientOptions
import typings.hapi.anon.Concurrent
import typings.hapi.anon.Encoding
import typings.hapi.anon.IsCaseSensitive
import typings.hapi.anon.Log
import typings.hapi.anon.Parser
import typings.hapi.hapiBooleans.`false`
import typings.mimos.mod.MimosOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions extends StObject {
  
  /**
    * Default value: '0.0.0.0' (all available network interfaces).
    * Sets the hostname or IP address the server will listen on. If not configured, defaults to host if present, otherwise to all available network interfaces. Set to '127.0.0.1' or 'localhost' to
    * restrict the server to only those coming from the same host.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptionsaddress)
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Default value: {}.
    * Provides application-specific configuration which can later be accessed via server.settings.app. The framework does not interact with this object. It is simply a reference made available
    * anywhere a server reference is provided. Note the difference between server.settings.app which is used to store static configuration values and server.app which is meant for storing run-time
    * state.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptionsapp)
    */
  var app: js.UndefOr[ServerOptionsApp] = js.undefined
  
  /**
    * Default value: true.
    * Used to disable the automatic initialization of the listener. When false, indicates that the listener will be started manually outside the framework.
    * Cannot be set to true along with a port value.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptionsautolisten)
    */
  var autoListen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default value: { engine: require('catbox-memory' }.
    * Sets up server-side caching providers. Every server includes a default cache for storing application state. By default, a simple memory-based cache is created which has limited capacity and
    * capabilities. hapi uses catbox for its cache implementation which includes support for common storage solutions (e.g. Redis, MongoDB, Memcached, Riak, among others). Caching is only utilized
    * if methods and plugins explicitly store their state in the cache. The server cache configuration only defines the storage container itself. The configuration can be assigned one or more
    * (array):
    * * a class or prototype function (usually obtained by calling require() on a catbox strategy such as require('catbox-redis')). A new catbox client will be created internally using this
    * function.
    * * a configuration object with the following:
    * * * engine - a class, a prototype function, or a catbox engine object.
    * * * name - an identifier used later when provisioning or configuring caching for server methods or plugins. Each cache name must be unique. A single item may omit the name option which defines
    * the default cache. If every cache includes a name, a default memory cache is provisioned as well.
    * * * shared - if true, allows multiple cache users to share the same segment (e.g. multiple methods using the same cache storage container). Default to false.
    * * * partition - (optional) string used to isolate cached data. Defaults to 'hapi-cache'.
    * * * other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptionscache)
    */
  var cache: js.UndefOr[CacheProvider[ClientOptions] | ServerOptionsCache | js.Array[ServerOptionsCache]] = js.undefined
  
  /**
    * Default value: { minBytes: 1024 }.
    * Defines server handling of content encoding requests. If false, response content encoding is disabled and no compression is performed by the server.
    */
  var compression: js.UndefOr[Boolean | ServerOptionsCompression] = js.undefined
  
  /**
    * Default value: { request: ['implementation'] }.
    * Determines which logged events are sent to the console. This should only be used for development and does not affect which events are actually logged internally and recorded. Set to false to
    * disable all console logging, or to an object with:
    * * log - a string array of server log tags to be displayed via console.error() when the events are logged via server.log() as well as internally generated server logs. Defaults to no output.
    * * request - a string array of request log tags to be displayed via console.error() when the events are logged via request.log() as well as internally generated request logs. For example, to
    * display all errors, set the option to ['error']. To turn off all console debug messages set it to false. To display all request logs, set it to '*'. Defaults to uncaught errors thrown in
    * external code (these errors are handled automatically and result in an Internal Server Error response) or runtime errors due to developer error. For example, to display all errors, set the log
    * or request to ['error']. To turn off all output set the log or request to false. To display all server logs, set the log or request to '*'. To disable all debug information, set debug to
    * false.
    */
  var debug: js.UndefOr[`false` | Log] = js.undefined
  
  /**
    * Default value: the operating system hostname and if not available, to 'localhost'.
    * The public hostname or IP address. Used to set server.info.host and server.info.uri and as address is none provided.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Default value: none.
    * An optional node HTTP (or HTTPS) http.Server object (or an object with a compatible interface).
    * If the listener needs to be manually started, set autoListen to false.
    * If the listener uses TLS, set tls to true.
    */
  var listener: js.UndefOr[
    typings.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ] = js.undefined
  
  /**
    * Default value: { sampleInterval: 0 }.
    * Server excessive load handling limits where:
    * * sampleInterval - the frequency of sampling in milliseconds. When set to 0, the other load options are ignored. Defaults to 0 (no sampling).
    * * maxHeapUsedBytes - maximum V8 heap size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    * * maxRssBytes - maximum process RSS size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    * * maxEventLoopDelay - maximum event loop delay duration in milliseconds over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    */
  var load: js.UndefOr[Concurrent] = js.undefined
  
  /**
    * Default value: none.
    * Options passed to the mimos module when generating the mime database used by the server (and accessed via server.mime):
    * * override - an object hash that is merged into the built in mime information specified here. Each key value pair represents a single mime object. Each override value must contain:
    * * key - the lower-cased mime-type string (e.g. 'application/javascript').
    * * value - an object following the specifications outlined here. Additional values include:
    * * * type - specify the type value of result objects, defaults to key.
    * * * predicate - method with signature function(mime) when this mime type is found in the database, this function will execute to allows customizations.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptionsmime)
    */
  var mime: js.UndefOr[MimosOptions] = js.undefined
  
  /**
    * Default value: {}.
    * Plugin-specific configuration which can later be accessed via server.settings.plugins. plugins is an object where each key is a plugin name and the value is the configuration. Note the
    * difference between server.settings.plugins which is used to store static configuration values and server.plugins which is meant for storing run-time state.
    */
  var plugins: js.UndefOr[PluginSpecificConfiguration] = js.undefined
  
  /**
    * Default value: 0 (an ephemeral port).
    * The TCP port the server will listen to. Defaults the next available port when the server is started (and assigned to server.info.port).
    * If port is a string containing a '/' character, it is used as a UNIX domain socket path. If it starts with '\.\pipe', it is used as a Windows named pipe.
    */
  var port: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Query parameter configuration.
    */
  var query: js.UndefOr[Parser] = js.undefined
  
  /**
    * Default value: { isCaseSensitive: true, stripTrailingSlash: false }.
    * Controls how incoming request URIs are matched against the routing table:
    * * isCaseSensitive - determines whether the paths '/example' and '/EXAMPLE' are considered different resources. Defaults to true.
    * * stripTrailingSlash - removes trailing slashes on incoming paths. Defaults to false.
    */
  var router: js.UndefOr[IsCaseSensitive] = js.undefined
  
  /**
    * Default value: none.
    * A route options object used as the default configuration for every route.
    */
  var routes: js.UndefOr[RouteOptions] = js.undefined
  
  /**
    * Default value:
    * {
    *     strictHeader: true,
    *     ignoreErrors: false,
    *     isSecure: true,
    *     isHttpOnly: true,
    *     isSameSite: 'Strict',
    *     encoding: 'none'
    * }
    * Sets the default configuration for every state (cookie) set explicitly via server.state() or implicitly (without definition) using the state configuration object.
    */
  // TODO I am not sure if I need to use all the server.state() definition (like the default value) OR only the options below. The v16 use "any" here.
  // state?: ServerStateCookieOptions;
  var state: js.UndefOr[Encoding] = js.undefined
  
  /**
    * Default value: none.
    * Used to create an HTTPS connection. The tls object is passed unchanged to the node HTTPS server as described in the node HTTPS documentation.
    */
  var tls: js.UndefOr[
    Boolean | (typings.node.httpsMod.ServerOptions[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ] = js.undefined
  
  /**
    * Default value: constructed from runtime server information.
    * The full public URI without the path (e.g. 'http://example.com:8080'). If present, used as the server server.info.uri, otherwise constructed from the server settings.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object ServerOptions {
  
  inline def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  extension [Self <: ServerOptions](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setApp(value: ServerOptionsApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setAutoListen(value: Boolean): Self = StObject.set(x, "autoListen", value.asInstanceOf[js.Any])
    
    inline def setAutoListenUndefined: Self = StObject.set(x, "autoListen", js.undefined)
    
    inline def setCache(value: CacheProvider[ClientOptions] | ServerOptionsCache | js.Array[ServerOptionsCache]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCacheVarargs(value: ServerOptionsCache*): Self = StObject.set(x, "cache", js.Array(value*))
    
    inline def setCompression(value: Boolean | ServerOptionsCompression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setDebug(value: `false` | Log): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setListener(
      value: typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    inline def setLoad(value: Concurrent): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setMime(value: MimosOptions): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setPlugins(value: PluginSpecificConfiguration): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setQuery(value: Parser): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRouter(value: IsCaseSensitive): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    inline def setRoutes(value: RouteOptions): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    inline def setState(value: Encoding): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTls(
      value: Boolean | (typings.node.httpsMod.ServerOptions[
          Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ])
    ): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
