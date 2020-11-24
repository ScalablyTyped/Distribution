package typings.marko

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/src/runtime/Async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - js.Thenable because Inheritance from two classes. Inlined 
  - js.Promise because Inheritance from two classes. Inlined  */ @js.native
  trait Async extends EventEmitter {
    
    def beginAsync(): this.type = js.native
    def beginAsync(options: js.Any): this.type = js.native
    
    def c(componentDef: js.Any, key: js.Any, customEvents: js.Any): Unit = js.native
    
    def createOut(): this.type = js.native
    
    def endElement(): Unit = js.native
    
    def error(e: Error): this.type = js.native
    
    def flush(): Unit = js.native
    
    def isSync(): Boolean = js.native
    
    def onLast(callback: js.Any): this.type = js.native
    
    def sync(): Unit = js.native
    
    def w(): this.type = js.native
    def w(str: String): this.type = js.native
    
    def write(): this.type = js.native
    def write(str: String): this.type = js.native
  }
}
