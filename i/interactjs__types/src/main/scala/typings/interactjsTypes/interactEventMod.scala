package typings.interactjsTypes

import typings.interactjsTypes.anon.Angle
import typings.interactjsTypes.anon.Dictkey
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.baseEventMod.BaseEvent
import typings.interactjsTypes.interactionMod.Interaction
import typings.interactjsTypes.interactjsTypesBooleans.`true`
import typings.interactjsTypes.interactjsTypesStrings.x
import typings.interactjsTypes.interactjsTypesStrings.xy
import typings.interactjsTypes.interactjsTypesStrings.y
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.Element
import typings.interactjsTypes.typesMod.FullRect
import typings.interactjsTypes.typesMod.Point
import typings.interactjsTypes.typesMod.PointerEventType
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactEventMod {
  
  @JSImport("@interactjs/core/InteractEvent", "InteractEvent")
  @js.native
  open class InteractEvent[T /* <: ActionName */, P /* <: EventPhase */] protected () extends BaseEvent[T] {
    /** */
    def this(interaction: Interaction[T], event: PointerEventType, actionName: T, phase: P, element: Element) = this()
    def this(
      interaction: Interaction[T],
      event: PointerEventType,
      actionName: T,
      phase: P,
      element: Element,
      preEnd: Boolean
    ) = this()
    def this(
      interaction: Interaction[T],
      event: PointerEventType,
      actionName: T,
      phase: P,
      element: Element,
      preEnd: Boolean,
      `type`: String
    ) = this()
    def this(
      interaction: Interaction[T],
      event: PointerEventType,
      actionName: T,
      phase: P,
      element: Element,
      preEnd: Unit,
      `type`: String
    ) = this()
    
    var altKey: Boolean = js.native
    
    var axes: js.UndefOr[x | y | xy] = js.native
    
    var button: Double = js.native
    
    var buttons: Double = js.native
    
    var client: Point = js.native
    
    var clientX: Double = js.native
    
    var clientX0: Double = js.native
    
    var clientY: Double = js.native
    
    var clientY0: Double = js.native
    
    var ctrlKey: Boolean = js.native
    
    @JSName("currentTarget")
    var currentTarget_InteractEvent: Element = js.native
    
    var delta: Point = js.native
    
    var dragEnter: js.UndefOr[Element] = js.native
    
    var dragLeave: js.UndefOr[Element] = js.native
    
    var dropzone: js.UndefOr[InteractableActions] = js.native
    
    var dt: Double = js.native
    
    var duration: Double = js.native
    
    var dx: Double = js.native
    
    var dy: Double = js.native
    
    def getSwipe(): Angle = js.native
    
    var metaKey: Boolean = js.native
    
    var modifiers: js.UndefOr[js.Array[Dictkey]] = js.native
    
    var page: Point = js.native
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
    
    var preEnd: js.UndefOr[Boolean] = js.native
    
    var prevDropzone: js.UndefOr[InteractableActions] = js.native
    
    var rect: FullRect = js.native
    
    var relatedTarget: Element | Null = js.native
    
    var screenX: js.UndefOr[Double] = js.native
    
    var screenY: js.UndefOr[Double] = js.native
    
    var shiftKey: Boolean = js.native
    
    var speed: Double = js.native
    
    var swipe: ReturnType[js.Function0[Angle]] = js.native
    
    var t0: Double = js.native
    
    @JSName("target")
    var target_InteractEvent: Element = js.native
    
    var velocity: Point = js.native
    
    var velocityX: Double = js.native
    
    var velocityY: Double = js.native
    
    var x0: Double = js.native
    
    var y0: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.interactjsTypes.interactjsTypesStrings.start
    - typings.interactjsTypes.interactjsTypesStrings.move
    - typings.interactjsTypes.interactjsTypesStrings.end
    - typings.interactjsTypes.interactjsTypesStrings.resume
    - typings.interactjsTypes.interactjsTypesStrings.inertiastart
    - typings.interactjsTypes.interactjsTypesStrings.reflow
  */
  trait EventPhase extends StObject
  
  trait PhaseMap extends StObject {
    
    var end: `true`
    
    var inertiastart: js.UndefOr[`true`] = js.undefined
    
    var move: `true`
    
    var reflow: js.UndefOr[`true`] = js.undefined
    
    var resume: js.UndefOr[`true`] = js.undefined
    
    var start: `true`
  }
  object PhaseMap {
    
    inline def apply(): PhaseMap = {
      val __obj = js.Dynamic.literal(end = true, move = true, start = true)
      __obj.asInstanceOf[PhaseMap]
    }
    
    extension [Self <: PhaseMap](x: Self) {
      
      inline def setEnd(value: `true`): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setInertiastart(value: `true`): Self = StObject.set(x, "inertiastart", value.asInstanceOf[js.Any])
      
      inline def setInertiastartUndefined: Self = StObject.set(x, "inertiastart", js.undefined)
      
      inline def setMove(value: `true`): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setReflow(value: `true`): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
      
      inline def setReflowUndefined: Self = StObject.set(x, "reflow", js.undefined)
      
      inline def setResume(value: `true`): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      inline def setStart(value: `true`): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
