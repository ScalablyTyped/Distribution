package typings.interactjsTypes.anon

import typings.interactjsTypes.corePointerInfoMod.PointerInfo
import typings.interactjsTypes.coreTypesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerIndex extends StObject {
  
  var event: PointerEventType
  
  var eventTarget: typings.std.Node
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]
  
  var pointer: typings.interactjsTypes.coreTypesMod.PointerType
  
  var pointerIndex: Double
  
  var pointerInfo: PointerInfo
}
object PointerIndex {
  
  inline def apply(
    event: PointerEventType,
    eventTarget: typings.std.Node,
    interaction: typings.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing],
    pointer: typings.interactjsTypes.coreTypesMod.PointerType,
    pointerIndex: Double,
    pointerInfo: PointerInfo
  ): PointerIndex = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerIndex = pointerIndex.asInstanceOf[js.Any], pointerInfo = pointerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerIndex]
  }
  
  extension [Self <: PointerIndex](x: Self) {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventTarget(value: typings.std.Node): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerIndex(value: Double): Self = StObject.set(x, "pointerIndex", value.asInstanceOf[js.Any])
    
    inline def setPointerInfo(value: PointerInfo): Self = StObject.set(x, "pointerInfo", value.asInstanceOf[js.Any])
  }
}
