package typings.interactjsTypes.anon

import typings.interactjsTypes.pointerInfoMod.PointerInfo
import typings.interactjsTypes.typesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/core/Interaction.PointerArgProps<{}> */
trait PointerArgProps extends StObject {
  
  var event: PointerEventType
  
  var eventTarget: typings.std.Node
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[scala.Nothing]
  
  var pointer: typings.interactjsTypes.typesMod.PointerType
  
  var pointerIndex: Double
  
  var pointerInfo: PointerInfo
}
object PointerArgProps {
  
  inline def apply(
    event: PointerEventType,
    eventTarget: typings.std.Node,
    interaction: typings.interactjsTypes.interactionMod.Interaction[scala.Nothing],
    pointer: typings.interactjsTypes.typesMod.PointerType,
    pointerIndex: Double,
    pointerInfo: PointerInfo
  ): PointerArgProps = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerIndex = pointerIndex.asInstanceOf[js.Any], pointerInfo = pointerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerArgProps]
  }
  
  extension [Self <: PointerArgProps](x: Self) {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventTarget(value: typings.std.Node): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[scala.Nothing]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.typesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerIndex(value: Double): Self = StObject.set(x, "pointerIndex", value.asInstanceOf[js.Any])
    
    inline def setPointerInfo(value: PointerInfo): Self = StObject.set(x, "pointerInfo", value.asInstanceOf[js.Any])
  }
}
