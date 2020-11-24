package typings.jestCucumber.scenarioResultTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScenarioResult extends js.Object {
  
  var featureFilePath: String = js.native
  
  var featureTitle: String = js.native
  
  var lineNumber: Double = js.native
  
  var scenarioTitle: String = js.native
  
  var stepResults: js.Array[IStepResult] = js.native
}
object IScenarioResult {
  
  @scala.inline
  def apply(
    featureFilePath: String,
    featureTitle: String,
    lineNumber: Double,
    scenarioTitle: String,
    stepResults: js.Array[IStepResult]
  ): IScenarioResult = {
    val __obj = js.Dynamic.literal(featureFilePath = featureFilePath.asInstanceOf[js.Any], featureTitle = featureTitle.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], scenarioTitle = scenarioTitle.asInstanceOf[js.Any], stepResults = stepResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScenarioResult]
  }
  
  @scala.inline
  implicit class IScenarioResultOps[Self <: IScenarioResult] (val x: Self) extends AnyVal {
    
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
    def setFeatureFilePath(value: String): Self = this.set("featureFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTitle(value: String): Self = this.set("featureTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioTitle(value: String): Self = this.set("scenarioTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepResultsVarargs(value: IStepResult*): Self = this.set("stepResults", js.Array(value :_*))
    
    @scala.inline
    def setStepResults(value: js.Array[IStepResult]): Self = this.set("stepResults", value.asInstanceOf[js.Any])
  }
}
