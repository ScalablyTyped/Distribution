package typings.hopscotch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TourDefinition
  extends StObject
     with HopscotchConfiguration {
  
  var id: String
  
  var steps: js.Array[StepDefinition]
}
object TourDefinition {
  
  inline def apply(id: String, steps: js.Array[StepDefinition]): TourDefinition = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TourDefinition] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[StepDefinition]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: StepDefinition*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
