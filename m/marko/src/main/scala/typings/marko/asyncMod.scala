package typings.marko

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - js.Thenable because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - js.Promise because Inheritance from two classes. Inlined `then`, `then`, executor, `catch` */ @js.native
  trait Async extends EventEmitter {
    
    def beginAsync(): this.type = js.native
    def beginAsync(options: js.Any): this.type = js.native
    
    def c(componentDef: js.Any, key: js.Any, customEvents: js.Any): Unit = js.native
    
    def `catch`[B](onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] = js.native
    
    def createOut(): this.type = js.native
    
    def endElement(): Unit = js.native
    
    def error(e: Error): this.type = js.native
    
    val executor: js.Function2[js.Function1[js.Any | js.Thenable[js.Any], ?], js.Function1[Any, ?], ?] = js.native
    
    def flush(): Unit = js.native
    
    def isSync(): Boolean = js.native
    
    def onLast(callback: js.Any): this.type = js.native
    
    def sync(): Unit = js.native
    
    def `then`[B](
      onFulfilled: js.Function1[js.Any, B | js.Thenable[B]],
      onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
    ): js.Promise[B] = js.native
    def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Promise[B] = js.native
    
    def w(): this.type = js.native
    def w(str: String): this.type = js.native
    
    def write(): this.type = js.native
    def write(str: String): this.type = js.native
  }
}
