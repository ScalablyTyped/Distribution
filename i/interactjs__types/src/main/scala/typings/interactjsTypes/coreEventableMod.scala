package typings.interactjsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.anon.PropagationStopped
import typings.interactjsTypes.coreTypesMod.ListenersArg
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.utilsNormalizeListenersMod.NormalizedListeners
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreEventableMod {
  
  @JSImport("@interactjs/core/Eventable", "Eventable")
  @js.native
  open class Eventable () extends StObject {
    def this(options: StringDictionary[Any]) = this()
    
    def fire[T /* <: PropagationStopped */](event: T): Unit = js.native
    
    def getRect(_element: Element): Rect = js.native
    
    var global: Any = js.native
    
    var immediatePropagationStopped: Boolean = js.native
    
    def off(`type`: String, listener: ListenersArg): Unit = js.native
    
    def on(`type`: String, listener: ListenersArg): Unit = js.native
    
    var options: Any = js.native
    
    var propagationStopped: Boolean = js.native
    
    var types: NormalizedListeners = js.native
  }
}
