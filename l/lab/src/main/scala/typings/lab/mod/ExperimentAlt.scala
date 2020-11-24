package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentAlt extends js.Object {
  
  var describe: SkipOnlyExperiment = js.native
  
  var experiment: SkipOnlyExperiment = js.native
  
  var suite: SkipOnlyExperiment = js.native
}
object ExperimentAlt {
  
  @scala.inline
  def apply(describe: SkipOnlyExperiment, experiment: SkipOnlyExperiment, suite: SkipOnlyExperiment): ExperimentAlt = {
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any], experiment = experiment.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentAlt]
  }
  
  @scala.inline
  implicit class ExperimentAltOps[Self <: ExperimentAlt] (val x: Self) extends AnyVal {
    
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
    def setDescribe(value: SkipOnlyExperiment): Self = this.set("describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperiment(value: SkipOnlyExperiment): Self = this.set("experiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuite(value: SkipOnlyExperiment): Self = this.set("suite", value.asInstanceOf[js.Any])
  }
}
