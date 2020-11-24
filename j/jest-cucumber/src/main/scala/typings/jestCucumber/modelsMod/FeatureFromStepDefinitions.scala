package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFromStepDefinitions extends js.Object {
  
  var scenarios: js.Array[ScenarioFromStepDefinitions] = js.native
  
  var title: String = js.native
}
object FeatureFromStepDefinitions {
  
  @scala.inline
  def apply(scenarios: js.Array[ScenarioFromStepDefinitions], title: String): FeatureFromStepDefinitions = {
    val __obj = js.Dynamic.literal(scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFromStepDefinitions]
  }
  
  @scala.inline
  implicit class FeatureFromStepDefinitionsOps[Self <: FeatureFromStepDefinitions] (val x: Self) extends AnyVal {
    
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
    def setScenariosVarargs(value: ScenarioFromStepDefinitions*): Self = this.set("scenarios", js.Array(value :_*))
    
    @scala.inline
    def setScenarios(value: js.Array[ScenarioFromStepDefinitions]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
