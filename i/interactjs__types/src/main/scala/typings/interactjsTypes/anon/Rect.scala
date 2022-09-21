package typings.interactjsTypes.anon

import typings.interactjsTypes.interactEventMod.EventPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rect extends StObject {
  
  var phase: EventPhase
  
  var rect: js.UndefOr[typings.interactjsTypes.typesMod.Rect] = js.undefined
}
object Rect {
  
  inline def apply(phase: EventPhase): Rect = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  extension [Self <: Rect](x: Self) {
    
    inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setRect(value: typings.interactjsTypes.typesMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
  }
}
