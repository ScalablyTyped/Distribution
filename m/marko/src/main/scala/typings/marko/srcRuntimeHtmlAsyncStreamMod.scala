package typings.marko

import typings.marko.srcRuntimeAsyncMod.Async
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html/AsyncStream", JSImport.Namespace)
@js.native
object srcRuntimeHtmlAsyncStreamMod extends js.Object {
  @js.native
  trait AsyncStream extends Async {
    var DEFAULT_TIMEOUT: Double = js.native
    var INCLUDE_STACK: Boolean = js.native
    def apply(global: js.Any): this.type = js.native
    def apply(global: js.Any, writer: js.Any): this.type = js.native
    def apply(global: js.Any, writer: js.Any, parentOut: js.Any): this.type = js.native
    def apply(global: js.Any, writer: js.Any, parentOut: js.Any, shouldBuffer: Boolean): this.type = js.native
    def beginElement(name: String, elementAttrs: js.Any): Unit = js.native
    def element(tagName: String, elementAttrs: js.Any, openTagOnly: Boolean): Unit = js.native
    def enableAsyncStackTrace(): Unit = js.native
    def end(): this.type = js.native
    def end(data: js.Any): this.type = js.native
    /** @deprecated */
    def getOutput(): String = js.native
    def text(str: js.Any): Unit = js.native
  }
  
}

