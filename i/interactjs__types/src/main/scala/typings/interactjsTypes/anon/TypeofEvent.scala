package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEvent extends StObject {
  
  /* standard dom */
  val AT_TARGET: Double
  
  /* standard dom */
  val BUBBLING_PHASE: Double
  
  /* standard dom */
  val CAPTURING_PHASE: Double
  
  /* standard dom */
  val NONE: Double
}
object TypeofEvent {
  
  inline def apply(AT_TARGET: Double, BUBBLING_PHASE: Double, CAPTURING_PHASE: Double, NONE: Double): TypeofEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEvent]
  }
  
  extension [Self <: TypeofEvent](x: Self) {
    
    inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
  }
}
