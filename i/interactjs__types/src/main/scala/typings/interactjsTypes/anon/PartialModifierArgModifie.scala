package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.EdgeOptions
import typings.interactjsTypes.coreTypesMod.FullRect
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/modifiers/types.ModifierArg<@interactjs/types.@interactjs/modifiers/types.ModifierState<unknown, unknown, any>>> */
trait PartialModifierArgModifie extends StObject {
  
  var coords: js.UndefOr[Point] = js.undefined
  
  var edges: js.UndefOr[EdgeOptions] = js.undefined
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
  
  var interactable: js.UndefOr[InteractableAllowFrom] = js.undefined
  
  var interaction: js.UndefOr[typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] = js.undefined
  
  var pageCoords: js.UndefOr[Point] = js.undefined
  
  var phase: js.UndefOr[EventPhase] = js.undefined
  
  var preEnd: js.UndefOr[Boolean] = js.undefined
  
  var prevCoords: js.UndefOr[Point] = js.undefined
  
  var prevRect: js.UndefOr[FullRect] = js.undefined
  
  var rect: js.UndefOr[FullRect] = js.undefined
  
  var startOffset: js.UndefOr[typings.interactjsTypes.coreTypesMod.Rect] = js.undefined
  
  var state: js.UndefOr[ModifierState[Any, Any, Any]] = js.undefined
}
object PartialModifierArgModifie {
  
  inline def apply(): PartialModifierArgModifie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModifierArgModifie]
  }
  
  extension [Self <: PartialModifierArgModifie](x: Self) {
    
    inline def setCoords(value: Point): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setInteractable(value: InteractableAllowFrom): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setInteractableUndefined: Self = StObject.set(x, "interactable", js.undefined)
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setPageCoords(value: Point): Self = StObject.set(x, "pageCoords", value.asInstanceOf[js.Any])
    
    inline def setPageCoordsUndefined: Self = StObject.set(x, "pageCoords", js.undefined)
    
    inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
    
    inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
    
    inline def setPrevCoords(value: Point): Self = StObject.set(x, "prevCoords", value.asInstanceOf[js.Any])
    
    inline def setPrevCoordsUndefined: Self = StObject.set(x, "prevCoords", js.undefined)
    
    inline def setPrevRect(value: FullRect): Self = StObject.set(x, "prevRect", value.asInstanceOf[js.Any])
    
    inline def setPrevRectUndefined: Self = StObject.set(x, "prevRect", js.undefined)
    
    inline def setRect(value: FullRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setStartOffset(value: typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setState(value: ModifierState[Any, Any, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
