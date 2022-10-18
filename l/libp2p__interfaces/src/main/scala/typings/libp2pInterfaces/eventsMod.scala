package typings.libp2pInterfaces

import org.scalablytyped.runtime.StringDictionary
import typings.std.CustomEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object eventsMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@libp2p/interfaces/events", "CustomEvent")
  @js.native
  open class CustomEvent[T] protected ()
    extends StObject
       with typings.std.CustomEvent[T] {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: CustomEventInit[T]) = this()
  }
  
  @JSImport("@libp2p/interfaces/events", "EventEmitter")
  @js.native
  open class EventEmitter[EventMap /* <: StringDictionary[Any] */] ()
    extends typings.libp2pInterfaces.distSrcEventsMod.EventEmitter[EventMap]
}
