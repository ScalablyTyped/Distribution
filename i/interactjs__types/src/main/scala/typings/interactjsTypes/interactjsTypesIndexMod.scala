package typings.interactjsTypes

import typings.interactjsTypes.dropPluginMod.DropState
import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.Element
import typings.interactjsTypes.typesMod.PointerEventType
import typings.interactjsTypes.typesMod.PointerType
import typings.interactjsTypes.typesMod.Target
import typings.std.Document
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactjsTypesIndexMod {
  
  @JSImport("@interactjs/types/index", "DropEvent")
  @js.native
  open class DropEvent protected ()
    extends typings.interactjsTypes.dropEventMod.DropEvent {
    /**
      * Class of events fired on dropzones during drags with acceptable targets.
      */
    def this(
      dropState: DropState,
      dragEvent: typings.interactjsTypes.interactEventMod.InteractEvent[drag, EventPhase],
      `type`: String
    ) = this()
  }
  
  @JSImport("@interactjs/types/index", "Interactable")
  @js.native
  open class Interactable protected ()
    extends typings.interactjsTypes.interactableMod.Interactable {
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
  
  @JSImport("@interactjs/types/index", "PointerEvent")
  @js.native
  open class PointerEvent[T /* <: String */] protected ()
    extends typings.interactjsTypes.pointerEventMod.PointerEvent[T] {
    def this(
      `type`: T,
      pointer: typings.interactjsTypes.pointerEventMod.PointerEvent[Any],
      event: PointerEventType,
      eventTarget: Node,
      interaction: typings.interactjsTypes.interactionMod.Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
    /** */
    def this(
      `type`: T,
      pointer: PointerType,
      event: PointerEventType,
      eventTarget: Node,
      interaction: typings.interactjsTypes.interactionMod.Interaction[scala.Nothing],
      timeStamp: Double
    ) = this()
  }
  
  type ActionProps[T /* <: ActionName */] = typings.interactjsTypes.typesMod.ActionProps[T]
  
  type InteractEvent[T /* <: ActionName */, P /* <: EventPhase */] = typings.interactjsTypes.interactEventMod.InteractEvent[T, P]
  
  type Interaction[T /* <: ActionName */] = typings.interactjsTypes.interactionMod.Interaction[T]
  
  type InteractionProxy[T /* <: ActionName */] = typings.interactjsTypes.interactionMod.InteractionProxy[T]
  
  type PointerArgProps[T /* <: js.Object */] = typings.interactjsTypes.interactionMod.PointerArgProps[T]
}
