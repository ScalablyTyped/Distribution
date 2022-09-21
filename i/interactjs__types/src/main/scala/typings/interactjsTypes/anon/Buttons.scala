package typings.interactjsTypes.anon

import typings.interactjsTypes.pointerUtilsMod.MockCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons extends StObject {
  
  val buttons: Any
  
  val client: Any
  
  val clientX: Any
  
  val clientY: Any
  
  var coords: MockCoords
  
  val page: Any
  
  val pageX: Any
  
  val pageY: Any
  
  val pointerId: Any
  
  val pointerType: Any
  
  def preventDefault(): Unit
  
  val target: Any
  
  val timeStamp: Any
  
  val `type`: Any
}
object Buttons {
  
  inline def apply(
    buttons: Any,
    client: Any,
    clientX: Any,
    clientY: Any,
    coords: MockCoords,
    page: Any,
    pageX: Any,
    pageY: Any,
    pointerId: Any,
    pointerType: Any,
    preventDefault: () => Unit,
    target: Any,
    timeStamp: Any,
    `type`: Any
  ): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  extension [Self <: Buttons](x: Self) {
    
    inline def setButtons(value: Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientX(value: Any): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Any): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setCoords(value: MockCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Any): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Any): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Any): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: Any): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Any): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
