package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait streamStateTransitionData extends StObject {
  
  var nextState: js.Any = js.native
  
  var previousState: js.Any = js.native
}
object streamStateTransitionData {
  
  @scala.inline
  def apply(nextState: js.Any, previousState: js.Any): streamStateTransitionData = {
    val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamStateTransitionData]
  }
  
  @scala.inline
  implicit class streamStateTransitionDataMutableBuilder[Self <: streamStateTransitionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextState(value: js.Any): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousState(value: js.Any): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
  }
}
