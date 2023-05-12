package typings.htmlparser2

import typings.htmlparser2.anon.PartialHandler
import typings.htmlparser2.libParserMod.ParserOptions
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonstreamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritableStreamMod {
  
  @JSImport("htmlparser2/lib/WritableStream", "WritableStream")
  @js.native
  open class WritableStream protected () extends Writable {
    def this(cbs: PartialHandler) = this()
    def this(cbs: PartialHandler, options: ParserOptions) = this()
    
    /* private */ val _decoder: Any = js.native
    
    def _final(callback: js.Function0[Unit]): Unit = js.native
    
    /* private */ val _parser: Any = js.native
    
    def _write(chunk: String, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    def _write(chunk: Buffer, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  }
}
