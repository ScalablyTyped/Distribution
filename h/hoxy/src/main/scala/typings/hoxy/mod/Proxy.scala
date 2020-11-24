package typings.hoxy.mod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hoxy", "Proxy")
@js.native
class Proxy protected () extends js.Object {
  protected def this(opts: CreateServerOptions) = this()
  
  /**
    * Stops proxy receiving requests. Finalizes and/or cleans up any
    * resources the proxy uses internally.
    */
  def close(): Unit = js.native
  def close(cb: PossibleErrorCallback): Unit = js.native
  
  /**
    * This is the entry point for intercepting and operating on requests and responses.
    * This first example intercepts all requests:
    * ```javascript
    * proxy.intercept('request', req => console.log(req.url));
    * ```
    * This is more verbose, but identical to the above:
    * ```javascript
    * proxy.intercept({
    *     phase: 'request'
    * }, function(req, resp, cycle) {
    *     console.log(req.url);
    * });
    * ```
    */
  def intercept(opts: String, handler: InterceptionHandler): Unit = js.native
  def intercept(opts: InterceptOptions, handler: InterceptionHandler): Unit = js.native
  
  /**
    * Starts proxy listening on port. Returns itself.
    * A callback may be provided, to run when the proxy has started listening.
    * This method simply passes its arguments to Node's server.listen() method.
    */
  def listen(port: Double): this.type = js.native
  def listen(port: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, host: String): this.type = js.native
  def listen(port: Double, host: String, backlog: Double): this.type = js.native
  def listen(port: Double, host: String, backlog: Double, callback: js.Function0[Unit]): this.type = js.native
  def listen(port: Double, host: String, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * Deals with various logging events.
    *
    * This first example listens for error,
    * warn, and debug logging events, and prints them to stderr:
    * ```javascript
    * proxy.log('error warn debug');
    * ```
    * Or, print logging events to various writable streams:
    * ```javascript
    * proxy.log('error warn debug', process.stderr);
    * proxy.log('info', process.stdout);
    * ```
    *
    * Or, explicitly handle logging event:
    * ```javascript
    * proxy.log('error warn', function(event) {
    *     console.error(event.level + ': ' + event.message);
    *     if (event.error) console.error(event.error.stack);
    * });
    * ```
    */
  def log(levels: String): this.type = js.native
  def log(levels: String, cb: LoggerCallbackFunction): this.type = js.native
  def log(levels: String, cb: Writable): this.type = js.native
  
  /**
    * Get/set proxy-level slow options. If options is provided, it's a setter.
    * If options is not provided, it's a getter.
    * @param opts
    */
  def slow(opts: Slow): this.type = js.native
}
