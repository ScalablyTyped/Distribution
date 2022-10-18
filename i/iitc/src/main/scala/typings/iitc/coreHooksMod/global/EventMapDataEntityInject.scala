package typings.iitc.coreHooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMapDataEntityInject extends StObject {
  
  def callback(ents: Any): Unit
}
object EventMapDataEntityInject {
  
  inline def apply(callback: Any => Unit): EventMapDataEntityInject = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
    __obj.asInstanceOf[EventMapDataEntityInject]
  }
  
  extension [Self <: EventMapDataEntityInject](x: Self) {
    
    inline def setCallback(value: Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
  }
}
