package typings.marko

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/Async", JSImport.Namespace)
@js.native
object srcRuntimeAsyncMod extends js.Object {
  @js.native
  trait Async
    extends EventEmitter
       with Promise[js.Any] {
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def beginAsync(): this.type = js.native
    def beginAsync(options: js.Any): this.type = js.native
    def c(componentDef: js.Any, key: js.Any, customEvents: js.Any): Unit = js.native
    def createOut(): this.type = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    def endElement(): Unit = js.native
    def error(e: Error): this.type = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    def flush(): Unit = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    def isSync(): Boolean = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def onLast(callback: js.Any): this.type = js.native
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
    def sync(): Unit = js.native
    def w(): this.type = js.native
    def w(str: String): this.type = js.native
    def write(): this.type = js.native
    def write(str: String): this.type = js.native
  }
  
}

