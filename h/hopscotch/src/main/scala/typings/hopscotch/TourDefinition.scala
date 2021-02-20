package typings.hopscotch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TourDefinition extends HopscotchConfiguration {
  
  var id: String = js.native
  
  var steps: js.Array[StepDefinition] = js.native
}
object TourDefinition {
  
  @scala.inline
  def apply(id: String, steps: js.Array[StepDefinition]): TourDefinition = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TourDefinition]
  }
  
  @scala.inline
  implicit class TourDefinitionMutableBuilder[Self <: TourDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[StepDefinition]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: StepDefinition*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
