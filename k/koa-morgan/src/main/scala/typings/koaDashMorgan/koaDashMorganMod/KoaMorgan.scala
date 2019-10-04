package typings.koaDashMorgan.koaDashMorganMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.koaDashMorgan.koaDashMorganStrings.combined
import typings.koaDashMorgan.koaDashMorganStrings.common
import typings.koaDashMorgan.koaDashMorganStrings.dev
import typings.koaDashMorgan.koaDashMorganStrings.short
import typings.koaDashMorgan.koaDashMorganStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Public interface of morgan logger
  */
@js.native
trait KoaMorgan extends js.Object {
  /**
    * Create a new morgan logger middleware function using the given format and options. The
    * format argument may be a string of a predefined name (see below for the names),
    * or a string of a format string containing defined tokens.
    */
  def apply(format: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(format: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  /**
    * Create a new morgan logger middleware function using the given format and options. The format argument may be a
    * custom format function which adheres to the signature.
    */
  def apply(format: FormatFn): Middleware[DefaultState, DefaultContext] = js.native
  def apply(format: FormatFn, options: Options): Middleware[DefaultState, DefaultContext] = js.native
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

