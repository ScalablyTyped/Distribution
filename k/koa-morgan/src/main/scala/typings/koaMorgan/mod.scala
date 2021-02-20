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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a
    * custom format function which adheres to the signature.
    */
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(custom: js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, String]): Middleware[DefaultState, DefaultContext] = js.native
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a string
    * of a predefined name (see below for the names), or a string of a format string containing defined tokens.
    */
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: String): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  /**
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    */
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: combined): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: combined, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  /**
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    */
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: common): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: common, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  /**
    * Concise output colored by response status for development use. The :status token will be colored red for server error codes,
    * yellow for client error codes, cyan for redirection codes, and uncolored for all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    */
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: dev): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: dev, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  /**
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    */
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: short): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: short, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  /**
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    */
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: tiny): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-morgan", JSImport.Namespace)
  @js.native
  def apply(format: tiny, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  /**
    * Compile a format string in token notation into a format function
    */
  @JSImport("koa-morgan", "compile")
  @js.native
  def compile(format: String): FormatFn = js.native
  
  /**
    * Define a named custom format by specifying a format string in token notation
    */
  @JSImport("koa-morgan", "format")
  @js.native
  def format(name: String, fmt: String): KoaMorgan = js.native
  /**
    * Define a named custom format by specifying a format function
    */
  @JSImport("koa-morgan", "format")
  @js.native
  def format(name: String, fmt: FormatFn): KoaMorgan = js.native
  
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  @JSImport("koa-morgan", "token")
  @js.native
  def token(name: String, callback: TokenCallbackFn): KoaMorgan = js.native
  
  type FormatFn = js.Function3[/* tokens */ TokenIndexer, /* req */ IncomingMessage, /* res */ ServerResponse, String]
  
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
    def apply(format: String): Middleware[DefaultState, DefaultContext] = js.native
    def apply(format: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
    /**
      * Standard Apache combined log output.
      * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
      */
    def apply(format: combined): Middleware[DefaultState, DefaultContext] = js.native
    def apply(format: combined, options: Options): Middleware[DefaultState, DefaultContext] = js.native
    /**
      * Standard Apache common log output.
      * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
      */
    def apply(format: common): Middleware[DefaultState, DefaultContext] = js.native
    def apply(format: common, options: Options): Middleware[DefaultState, DefaultContext] = js.native
    /**
      * Concise output colored by response status for development use. The :status token will be colored red for
      * server error codes, yellow for client error codes, cyan for redirection codes, and uncolored for all other codes.
      * :method :url :status :response-time ms - :res[content-length]
      */
    def apply(format: dev): Middleware[DefaultState, DefaultContext] = js.native
    def apply(format: dev, options: Options): Middleware[DefaultState, DefaultContext] = js.native
    /**
      * Shorter than default, also including response time.
      * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
      */
    def apply(format: short): Middleware[DefaultState, DefaultContext] = js.native
    def apply(format: short, options: Options): Middleware[DefaultState, DefaultContext] = js.native
    /**
      * The minimal output.
      * :method :url :status :res[content-length] - :response-time ms
      */
    def apply(format: tiny): Middleware[DefaultState, DefaultContext] = js.native
    def apply(format: tiny, options: Options): Middleware[DefaultState, DefaultContext] = js.native
    /**
      * Create a new morgan logger middleware function using the given format and options. The format argument may be a
      * custom format function which adheres to the signature.
      */
    def apply(format: FormatFn): Middleware[DefaultState, DefaultContext] = js.native
    def apply(format: FormatFn, options: Options): Middleware[DefaultState, DefaultContext] = js.native
    
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
  @js.native
  trait Options extends StObject {
    
    /**
      * Buffer duration before writing logs to the stream, defaults to false. When set to true, defaults to 1000 ms.
      */
    var buffer: js.UndefOr[Boolean] = js.native
    
    /**
      * Write log line on request instead of response. This means that a requests will be logged even if the server
      * crashes, but data from the response cannot be logged (like the response code).
      */
    var immediate: js.UndefOr[Boolean] = js.native
    
    /**
      * Function to determine if logging is skipped, defaults to false. This function will be called as skip(req, res).
      */
    var skip: js.UndefOr[js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, Boolean]] = js.native
    
    /**
      * Output stream for writing log lines, defaults to process.stdout.
      */
    var stream: js.UndefOr[StreamOptions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setSkip(value: (/* req */ IncomingMessage, /* res */ ServerResponse) => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setStream(value: StreamOptions): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  type StreamOptions = typings.morgan.mod.StreamOptions
  
  type TokenCallbackFn = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    String
  ]
  
  type TokenIndexer = typings.morgan.mod.TokenIndexer[IncomingMessage, ServerResponse]
}
