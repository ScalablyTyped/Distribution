package typings.interactjsTypes

import typings.interactjsTypes.actionsDropPluginMod.DropState
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.coreBaseEventMod.BaseEvent
import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.interactjsTypesStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsDropDropEventMod {
  
  @JSImport("@interactjs/actions/drop/DropEvent", "DropEvent")
  @js.native
  open class DropEvent protected () extends BaseEvent[drag] {
    /**
      * Class of events fired on dropzones during drags with acceptable targets.
      */
    def this(dropState: DropState, dragEvent: InteractEvent[drag, EventPhase], `type`: String) = this()
    
    var dragEvent: InteractEvent[drag, EventPhase] = js.native
    
    var draggable: InteractableActions = js.native
    
    var dropzone: InteractableActions = js.native
    
    /**
      * If this is a `dropactivate` event, the dropzone element will be
      * deactivated.
      *
      * If this is a `dragmove` or `dragenter`, a `dragleave` will be fired on the
      * dropzone element and more.
      */
    def reject(): Unit = js.native
    
    var relatedTarget: Element = js.native
    
    @JSName("target")
    var target_DropEvent: Element = js.native
  }
}
