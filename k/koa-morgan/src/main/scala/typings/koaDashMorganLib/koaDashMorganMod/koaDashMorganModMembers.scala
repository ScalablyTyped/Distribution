package typings
package koaDashMorganLib.koaDashMorganMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-morgan", JSImport.Namespace)
@js.native
object koaDashMorganModMembers extends js.Object {
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
  ): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a string
    * of a predefined name (see below for the names), or a string of a format string containing defined tokens.
    */
  def apply(format: java.lang.String): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(format: java.lang.String, options: koaDashMorganLib.koaDashMorganMod.morganNs.Options): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * Standard Apache combined log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.combined): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(
    format: koaDashMorganLib.koaDashMorganLibStrings.combined,
    options: koaDashMorganLib.koaDashMorganMod.morganNs.Options
  ): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * Standard Apache common log output.
    * :remote-addr - :remote-user [:date] ":method :url HTTP/:http-version" :status :res[content-length]
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.common): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(
    format: koaDashMorganLib.koaDashMorganLibStrings.common,
    options: koaDashMorganLib.koaDashMorganMod.morganNs.Options
  ): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * Concise output colored by response status for development use. The :status token will be colored red for server error codes,
    * yellow for client error codes, cyan for redirection codes, and uncolored for all other codes.
    * :method :url :status :response-time ms - :res[content-length]
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.dev): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(
    format: koaDashMorganLib.koaDashMorganLibStrings.dev,
    options: koaDashMorganLib.koaDashMorganMod.morganNs.Options
  ): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * Shorter than default, also including response time.
    * :remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.short): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(
    format: koaDashMorganLib.koaDashMorganLibStrings.short,
    options: koaDashMorganLib.koaDashMorganMod.morganNs.Options
  ): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * The minimal output.
    * :method :url :status :res[content-length] - :response-time ms
    */
  def apply(format: koaDashMorganLib.koaDashMorganLibStrings.tiny): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  def apply(
    format: koaDashMorganLib.koaDashMorganLibStrings.tiny,
    options: koaDashMorganLib.koaDashMorganMod.morganNs.Options
  ): koaLib.koaMod.ApplicationNs.Middleware[_, js.Object] = js.native
  /**
    * Compile a format string in token notation into a format function
    */
  def compile(format: java.lang.String): koaDashMorganLib.koaDashMorganMod.morganNs.FormatFn = js.native
  /**
    * Define a named custom format by specifying a format string in token notation
    */
  def format(name: java.lang.String, fmt: java.lang.String): koaDashMorganLib.koaDashMorganMod.morganNs.KoaMorgan = js.native
  /**
    * Define a named custom format by specifying a format function
    */
  def format(name: java.lang.String, fmt: koaDashMorganLib.koaDashMorganMod.morganNs.FormatFn): koaDashMorganLib.koaDashMorganMod.morganNs.KoaMorgan = js.native
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  def token(name: java.lang.String, callback: koaDashMorganLib.koaDashMorganMod.morganNs.TokenCallbackFn): koaDashMorganLib.koaDashMorganMod.morganNs.KoaMorgan = js.native
}

