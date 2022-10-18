package typings.marko

import typings.marko.srcRuntimeAsyncMod.Async
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRuntimeHtmlAsyncStreamMod {
  
  @js.native
  trait AsyncStream extends Async {
    
    def apply(global: Any): this.type = js.native
    def apply(global: Any, writer: Any): this.type = js.native
    def apply(global: Any, writer: Any, parentOut: Any): this.type = js.native
    def apply(global: Any, writer: Any, parentOut: Any, shouldBuffer: Boolean): this.type = js.native
    def apply(global: Any, writer: Any, parentOut: Unit, shouldBuffer: Boolean): this.type = js.native
    def apply(global: Any, writer: Unit, parentOut: Any): this.type = js.native
    def apply(global: Any, writer: Unit, parentOut: Any, shouldBuffer: Boolean): this.type = js.native
    def apply(global: Any, writer: Unit, parentOut: Unit, shouldBuffer: Boolean): this.type = js.native
    
    var DEFAULT_TIMEOUT: Double = js.native
    
    var INCLUDE_STACK: Boolean = js.native
    
    def beginElement(name: String, elementAttrs: Any): Unit = js.native
    
    def element(tagName: String, elementAttrs: Any, openTagOnly: Boolean): Unit = js.native
    
    def enableAsyncStackTrace(): Unit = js.native
    
    def end(): this.type = js.native
    def end(data: Any): this.type = js.native
    
    /** @deprecated */
    def getOutput(): String = js.native
    
    def text(str: Any): Unit = js.native
  }
}
