package typings.marko

import typings.node.eventsMod.EventEmitter
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRuntimeAsyncMod {
  
  @js.native
  trait Async
    extends EventEmitter
       with Promise[Any] {
    
    def beginAsync(): this.type = js.native
    def beginAsync(options: Any): this.type = js.native
    
    def c(componentDef: Any, key: Any, customEvents: Any): Unit = js.native
    
    def createOut(): this.type = js.native
    
    def endElement(): Unit = js.native
    
    def error(e: js.Error): this.type = js.native
    
    def flush(): Unit = js.native
    
    def isSync(): Boolean = js.native
    
    def onLast(callback: Any): this.type = js.native
    
    def sync(): Unit = js.native
    
    def w(): this.type = js.native
    def w(str: String): this.type = js.native
    
    def write(): this.type = js.native
    def write(str: String): this.type = js.native
  }
}
