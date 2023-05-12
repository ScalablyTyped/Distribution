package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEvent extends StObject {
  
  /* standard dom */
  val AT_TARGET: typings.interactjsTypes.interactjsTypesInts.`2`
  
  /* standard dom */
  val BUBBLING_PHASE: typings.interactjsTypes.interactjsTypesInts.`3`
  
  /* standard dom */
  val CAPTURING_PHASE: typings.interactjsTypes.interactjsTypesInts.`1`
  
  /* standard dom */
  val NONE: typings.interactjsTypes.interactjsTypesInts.`0`
}
object TypeofEvent {
  
  inline def apply(): TypeofEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0)
    __obj.asInstanceOf[TypeofEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofEvent] (val x: Self) extends AnyVal {
    
    inline def setAT_TARGET(value: typings.interactjsTypes.interactjsTypesInts.`2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASE(value: typings.interactjsTypes.interactjsTypesInts.`3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASE(value: typings.interactjsTypes.interactjsTypesInts.`1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: typings.interactjsTypes.interactjsTypesInts.`0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
  }
}
