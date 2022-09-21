package typings.interactjsTypes

import typings.interactjsTypes.interactionMod.Interaction
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.hasPointer
import typings.interactjsTypes.interactjsTypesStrings.idle
import typings.interactjsTypes.interactjsTypesStrings.mouseOrPen
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.interactjsTypes.interactjsTypesStrings.simulationResume
import typings.interactjsTypes.scopeMod.Scope
import typings.interactjsTypes.typesMod.PointerType
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionFinderMod {
  
  object default {
    
    @JSImport("@interactjs/core/interactionFinder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def hasPointer(hasPointerIdScope: SearchDetails): Interaction[
        /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPointer")(hasPointerIdScope.asInstanceOf[js.Any]).asInstanceOf[Interaction[
        /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
      ]]
    
    inline def idle(hasPointerTypeScope: SearchDetails): Interaction[
        /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("idle")(hasPointerTypeScope.asInstanceOf[js.Any]).asInstanceOf[Interaction[
        /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
      ]]
    
    @JSImport("@interactjs/core/interactionFinder", "default.methodOrder")
    @js.native
    def methodOrder: js.Tuple4[simulationResume, mouseOrPen, hasPointer, idle] = js.native
    inline def methodOrder_=(x: js.Tuple4[simulationResume, mouseOrPen, hasPointer, idle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methodOrder")(x.asInstanceOf[js.Any])
    
    inline def mouseOrPen(hasPointerIdPointerTypeEventTypeScope: SearchDetails): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseOrPen")(hasPointerIdPointerTypeEventTypeScope.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def search(details: SearchDetails): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(details.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def simulationResume(hasPointerTypeEventTypeEventTargetScope: SearchDetails): Interaction[
        /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("simulationResume")(hasPointerTypeEventTypeEventTargetScope.asInstanceOf[js.Any]).asInstanceOf[Interaction[
        /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
      ]]
  }
  
  trait SearchDetails extends StObject {
    
    var curEventTarget: EventTarget
    
    var eventTarget: EventTarget
    
    var eventType: String
    
    var pointer: PointerType
    
    var pointerId: Double
    
    var pointerType: String
    
    var scope: Scope
  }
  object SearchDetails {
    
    inline def apply(
      curEventTarget: EventTarget,
      eventTarget: EventTarget,
      eventType: String,
      pointer: PointerType,
      pointerId: Double,
      pointerType: String,
      scope: Scope
    ): SearchDetails = {
      val __obj = js.Dynamic.literal(curEventTarget = curEventTarget.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchDetails]
    }
    
    extension [Self <: SearchDetails](x: Self) {
      
      inline def setCurEventTarget(value: EventTarget): Self = StObject.set(x, "curEventTarget", value.asInstanceOf[js.Any])
      
      inline def setEventTarget(value: EventTarget): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
