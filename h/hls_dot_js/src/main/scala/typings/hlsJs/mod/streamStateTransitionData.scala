package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait streamStateTransitionData extends StObject {
  
  var nextState: js.Any
  
  var previousState: js.Any
}
object streamStateTransitionData {
  
  inline def apply(nextState: js.Any, previousState: js.Any): streamStateTransitionData = {
    val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamStateTransitionData]
  }
  
  extension [Self <: streamStateTransitionData](x: Self) {
    
    inline def setNextState(value: js.Any): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
    
    inline def setPreviousState(value: js.Any): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
  }
}
