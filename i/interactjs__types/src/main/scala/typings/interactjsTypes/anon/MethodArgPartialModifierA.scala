package typings.interactjsTypes.anon

import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.interactjsModifiersTypesMod.ModifierState
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.EdgeOptions
import typings.interactjsTypes.typesMod.FullRect
import typings.interactjsTypes.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/modifiers/Modification.MethodArg & std.Partial<@interactjs/types.@interactjs/modifiers/types.ModifierArg<@interactjs/types.@interactjs/modifiers/types.ModifierState<unknown, unknown, any>>> */
trait MethodArgPartialModifierA extends StObject {
  
  var coords: Point & js.UndefOr[Point]
  
  var edges: js.UndefOr[EdgeOptions] = js.undefined
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
  
  var interactable: js.UndefOr[InteractableAllowFrom] = js.undefined
  
  var interaction: js.UndefOr[typings.interactjsTypes.interactionMod.Interaction[ActionName]] = js.undefined
  
  var pageCoords: Point & js.UndefOr[Point]
  
  var phase: EventPhase & js.UndefOr[EventPhase]
  
  var preEnd: js.UndefOr[Boolean] = js.undefined
  
  var prevCoords: js.UndefOr[Point] = js.undefined
  
  var prevRect: js.UndefOr[FullRect] = js.undefined
  
  var rect: FullRect & js.UndefOr[FullRect]
  
  var skipModifiers: js.UndefOr[Double] = js.undefined
  
  var startOffset: js.UndefOr[typings.interactjsTypes.typesMod.Rect] = js.undefined
  
  var state: js.UndefOr[ModifierState[Any, Any, Any]] = js.undefined
}
object MethodArgPartialModifierA {
  
  inline def apply(
    coords: Point & js.UndefOr[Point],
    pageCoords: Point & js.UndefOr[Point],
    phase: EventPhase & js.UndefOr[EventPhase],
    rect: FullRect & js.UndefOr[FullRect]
  ): MethodArgPartialModifierA = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], pageCoords = pageCoords.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodArgPartialModifierA]
  }
  
  extension [Self <: MethodArgPartialModifierA](x: Self) {
    
    inline def setCoords(value: Point & js.UndefOr[Point]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setEdges(value: EdgeOptions): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setInteractable(value: InteractableAllowFrom): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setInteractableUndefined: Self = StObject.set(x, "interactable", js.undefined)
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setPageCoords(value: Point & js.UndefOr[Point]): Self = StObject.set(x, "pageCoords", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: EventPhase & js.UndefOr[EventPhase]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
    
    inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
    
    inline def setPrevCoords(value: Point): Self = StObject.set(x, "prevCoords", value.asInstanceOf[js.Any])
    
    inline def setPrevCoordsUndefined: Self = StObject.set(x, "prevCoords", js.undefined)
    
    inline def setPrevRect(value: FullRect): Self = StObject.set(x, "prevRect", value.asInstanceOf[js.Any])
    
    inline def setPrevRectUndefined: Self = StObject.set(x, "prevRect", js.undefined)
    
    inline def setRect(value: FullRect & js.UndefOr[FullRect]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setSkipModifiers(value: Double): Self = StObject.set(x, "skipModifiers", value.asInstanceOf[js.Any])
    
    inline def setSkipModifiersUndefined: Self = StObject.set(x, "skipModifiers", js.undefined)
    
    inline def setStartOffset(value: typings.interactjsTypes.typesMod.Rect): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    inline def setState(value: ModifierState[Any, Any, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
