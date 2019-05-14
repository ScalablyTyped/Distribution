package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "LambdaLog")
@js.native
class LambdaLog ()
  extends nodeLib.eventsMod.EventEmitter
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(options: LambdaLogOptions) = this()
  def this(options: LambdaLogOptions, levels: js.Any) = this()
  var LambdaLog: lambdaDashLogLib.lambdaDashLogMod.LambdaLog = js.native
  var _levels: js.Any = js.native
  var _logLevels: js.Any = js.native
  var console: stdLib.Console = js.native
  var options: LambdaLogOptions = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def assert(test: js.Any, msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): scala.Boolean | java.lang.String = js.native
  def debug(msg: java.lang.String): java.lang.String = js.native
  def debug(msg: java.lang.String, meta: js.Object): java.lang.String = js.native
  def debug(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): java.lang.String = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  def error(msg: java.lang.String): java.lang.String = js.native
  def error(msg: java.lang.String, meta: js.Object): java.lang.String = js.native
  def error(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): java.lang.String = js.native
  def error(msg: stdLib.Error): java.lang.String = js.native
  def error(msg: stdLib.Error, meta: js.Object): java.lang.String = js.native
  def error(msg: stdLib.Error, meta: js.Object, tags: js.Array[java.lang.String]): java.lang.String = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def info(msg: java.lang.String): java.lang.String = js.native
  def info(msg: java.lang.String, meta: js.Object): java.lang.String = js.native
  def info(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): java.lang.String = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def log(level: java.lang.String, msg: java.lang.String): java.lang.String = js.native
  def log(level: java.lang.String, msg: java.lang.String, meta: js.Object): java.lang.String = js.native
  def log(level: java.lang.String, msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): java.lang.String = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def warn(msg: java.lang.String): java.lang.String = js.native
  def warn(msg: java.lang.String, meta: js.Object): java.lang.String = js.native
  def warn(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): java.lang.String = js.native
}

