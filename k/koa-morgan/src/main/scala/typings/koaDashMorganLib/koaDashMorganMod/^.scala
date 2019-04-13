package typings
package koaDashMorganLib.koaDashMorganMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-morgan", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a
    * custom format function which adheres to the signature.
    */
  def apply(
    custom: js.Function2[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      java.lang.String
    ]
  ): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a string
    * of a predefined name (see below for the names), or a string of a format string containing defined tokens.
    */
  def apply(format: java.lang.String): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(format: java.lang.String, options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.combined): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.combined, options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.common): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.common, options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * Concise output colored by response status for development use. The :status token will be colored red for server error codes,
    * yellow for client error codes, cyan for redirection codes, and uncolored for all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.dev): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.dev, options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.short): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.short, options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.tiny): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.tiny, options: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  /**
    * Compile a format string in token notation into a format function
    */
  def compile(format: java.lang.String): FormatFn = js.native
  /**
    * Define a named custom format by specifying a format string in token notation
    */
  def format(name: java.lang.String, fmt: java.lang.String): KoaMorgan = js.native
  /**
    * Define a named custom format by specifying a format function
    */
  def format(name: java.lang.String, fmt: FormatFn): KoaMorgan = js.native
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  def token(name: java.lang.String, callback: TokenCallbackFn): KoaMorgan = js.native
}

