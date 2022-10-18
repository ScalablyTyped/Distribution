package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.EventPhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase extends StObject {
  
  var phase: EventPhase
}
object Phase {
  
  inline def apply(phase: EventPhase): Phase = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
  
  extension [Self <: Phase](x: Self) {
    
    inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
