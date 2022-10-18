package typings.interactjsTypes

import typings.interactjsTypes.actionsDropPluginMod.DropState
import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.coreTypesMod.PointerType
import typings.interactjsTypes.coreTypesMod.Target
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.std.Document
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Interact {
    
    @JSGlobal("Interact.DropEvent")
    @js.native
    open class DropEvent protected ()
      extends typings.interactjsTypes.mod.DropEvent {
      /**
        * Class of events fired on dropzones during drags with acceptable targets.
        */
      def this(dropState: DropState, dragEvent: InteractEvent[drag, EventPhase], `type`: String) = this()
    }
    
    @JSGlobal("Interact.Interactable")
    @js.native
    open class Interactable protected ()
      extends typings.interactjsTypes.mod.Interactable {
      def this(
        target: Target,
        options: Any,
        defaultContext: Element,
        scopeEvents: ReturnType[
                /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof install */ Any
              ]
      ) = this()
      /** */
      def this(
        target: Target,
        options: Any,
        defaultContext: Document,
        scopeEvents: ReturnType[
                /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof install */ Any
              ]
      ) = this()
    }
    
    @JSGlobal("Interact.PointerEvent")
    @js.native
    open class PointerEvent[T /* <: String */] protected ()
      extends typings.interactjsTypes.pointerEventsPointerEventMod.PointerEvent[T] {
      /** */
      def this(
        `type`: T,
        pointer: PointerType,
        event: PointerEventType,
        eventTarget: Node,
        interaction: Interaction[scala.Nothing],
        timeStamp: Double
      ) = this()
      def this(
        `type`: T,
        pointer: typings.interactjsTypes.pointerEventsPointerEventMod.PointerEvent[Any],
        event: PointerEventType,
        eventTarget: Node,
        interaction: Interaction[scala.Nothing],
        timeStamp: Double
      ) = this()
    }
  }
}
