package typings.lambdaDashLog.lambdaDashLogMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Console
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "LambdaLog")
@js.native
class LambdaLog ()
  extends EventEmitter
     with /* key */ StringDictionary[js.Any] {
  def this(options: LambdaLogOptions) = this()
  def this(options: LambdaLogOptions, levels: js.Any) = this()
  var LambdaLog: typings.lambdaDashLog.lambdaDashLogMod.LambdaLog = js.native
  var _levels: js.Any = js.native
  var _logLevels: js.Any = js.native
  var console: Console = js.native
  var options: LambdaLogOptions = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def assert(test: js.Any, msg: String): Boolean | LogMessage = js.native
  def assert(test: js.Any, msg: String, meta: js.Object): Boolean | LogMessage = js.native
  def assert(test: js.Any, msg: String, meta: js.Object, tags: js.Array[String]): Boolean | LogMessage = js.native
  def debug(msg: String): LogMessage = js.native
  def debug(msg: String, meta: js.Object): LogMessage = js.native
  def debug(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def error(msg: String): LogMessage = js.native
  def error(msg: String, meta: js.Object): LogMessage = js.native
  def error(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def error(msg: Error): LogMessage = js.native
  def error(msg: Error, meta: js.Object): LogMessage = js.native
  def error(msg: Error, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  def info(msg: String): LogMessage = js.native
  def info(msg: String, meta: js.Object): LogMessage = js.native
  def info(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def log(level: String, msg: String): LogMessage = js.native
  def log(level: String, msg: String, meta: js.Object): LogMessage = js.native
  def log(level: String, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  def warn(msg: String): LogMessage = js.native
  def warn(msg: String, meta: js.Object): LogMessage = js.native
  def warn(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
}

