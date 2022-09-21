package typings.koaMorgan

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaMorgan.koaMorganStrings.combined
import typings.koaMorgan.koaMorganStrings.common
import typings.koaMorgan.koaMorganStrings.dev
import typings.koaMorgan.koaMorganStrings.short
import typings.koaMorgan.koaMorganStrings.tiny
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a
    * custom format function which adheres to the signature.
    */
  inline def apply(custom: js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], String]): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(custom.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a string
    * of a predefined name (see below for the names), or a string of a format string containing defined tokens.
    */
  inline def apply(format: String): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(format: String, options: Options): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  /**
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    */
  inline def apply(format: combined): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(format: combined, options: Options): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  /**
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    */
  inline def apply(format: common): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(format: common, options: Options): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  /**
    * Concise output colored by response status for development use. The :status token will be colored red for server error codes,
    * yellow for client error codes, cyan for redirection codes, and uncolored for all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    */
  inline def apply(format: dev): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(format: dev, options: Options): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  /**
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    */
  inline def apply(format: short): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(format: short, options: Options): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  /**
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    */
  inline def apply(format: tiny): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(format: tiny, options: Options): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compile a format string in token notation into a format function
    */
  inline def compile(format: String): FormatFn = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFn]
  
  /**
    * Define a named custom format by specifying a format string in token notation
    */
  inline def format(name: String, fmt: String): KoaMorgan = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(name.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any])).asInstanceOf[KoaMorgan]
  /**
    * Define a named custom format by specifying a format function
    */
  inline def format(name: String, fmt: FormatFn): KoaMorgan = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(name.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any])).asInstanceOf[KoaMorgan]
  
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  inline def token(name: String, callback: TokenCallbackFn): KoaMorgan = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[KoaMorgan]
  
  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    String
  ]
  
  /**
    * Public interface of morgan logger
    */
  @js.native
  trait KoaMorgan extends StObject {
    
    /**
      * Create a new morgan logger middleware function using the given format and options. The
      * format argument may be a string of a predefined name (see below for the names),
      * or a string of a format string containing defined tokens.
      */
    def apply(format: String): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(format: String, options: Options): Middleware[DefaultState, DefaultContext, Any] = js.native
    /**
      * Standard Apache combined log output.
      * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
      */
    def apply(format: combined): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(format: combined, options: Options): Middleware[DefaultState, DefaultContext, Any] = js.native
    /**
      * Standard Apache common log output.
      * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
      */
    def apply(format: common): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(format: common, options: Options): Middleware[DefaultState, DefaultContext, Any] = js.native
    /**
      * Concise output colored by response status for development use. The :status token will be colored red for
      * server error codes, yellow for client error codes, cyan for redirection codes, and uncolored for all other codes.
      * :method :url :status :response-time ms - :res[content-length]
      */
    def apply(format: dev): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(format: dev, options: Options): Middleware[DefaultState, DefaultContext, Any] = js.native
    /**
      * Shorter than default, also including response time.
      * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
      */
    def apply(format: short): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(format: short, options: Options): Middleware[DefaultState, DefaultContext, Any] = js.native
    /**
      * The minimal output.
      * :method :url :status :res[content-length] - :response-time ms
      */
    def apply(format: tiny): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(format: tiny, options: Options): Middleware[DefaultState, DefaultContext, Any] = js.native
    /**
      * Create a new morgan logger middleware function using the given format and options. The format argument may be a
      * custom format function which adheres to the signature.
      */
    def apply(format: FormatFn): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(format: FormatFn, options: Options): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    /**
      * Compile a format string in token notation into a format function
      */
    def compile(format: String): FormatFn = js.native
    
    /**
      * Define a named custom format by specifying a format string in token notation
      */
    def format(name: String, fmt: String): KoaMorgan = js.native
    /**
      * Define a named custom format by specifying a format function
      */
    def format(name: String, fmt: FormatFn): KoaMorgan = js.native
    
    /**
      * Define a custom token which can be used in custom morgan logging formats.
      */
    def token(name: String, callback: TokenCallbackFn): KoaMorgan = js.native
  }
  
  /**
    * Morgan accepts these properties in the options object.
    */
  trait Options extends StObject {
    
    /**
      * Buffer duration before writing logs to the stream, defaults to false. When set to true, defaults to 1000 ms.
      */
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write log line on request instead of response. This means that a requests will be logged even if the server
      * crashes, but data from the response cannot be logged (like the response code).
      */
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to determine if logging is skipped, defaults to false. This function will be called as skip(req, res).
      */
    var skip: js.UndefOr[
        js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], Boolean]
      ] = js.undefined
    
    /**
      * Output stream for writing log lines, defaults to process.stdout.
      */
    var stream: js.UndefOr[StreamOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setSkip(value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setStream(value: StreamOptions): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  type StreamOptions = typings.morgan.mod.StreamOptions
  
  type TokenCallbackFn = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    String
  ]
  
  type TokenIndexer = typings.morgan.mod.TokenIndexer[IncomingMessage, ServerResponse[IncomingMessage]]
}
