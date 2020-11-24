package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScenarioFromStepDefinitions extends js.Object {
  
  var steps: js.Array[StepFromStepDefinitions] = js.native
  
  var title: String = js.native
}
object ScenarioFromStepDefinitions {
  
  @scala.inline
  def apply(steps: js.Array[StepFromStepDefinitions], title: String): ScenarioFromStepDefinitions = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioFromStepDefinitions]
  }
  
  @scala.inline
  implicit class ScenarioFromStepDefinitionsOps[Self <: ScenarioFromStepDefinitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStepsVarargs(value: StepFromStepDefinitions*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[StepFromStepDefinitions]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
