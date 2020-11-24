package typings.jestCucumber.scenarioResultTrackerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStepResult extends js.Object {
  
  var endTime: Double = js.native
  
  var error: Error | Null = js.native
  
  var lineNumber: Double = js.native
  
  var startTime: Double = js.native
  
  var stepArguments: js.Array[String] = js.native
  
  var stepText: String = js.native
}
object IStepResult {
  
  @scala.inline
  def apply(
    endTime: Double,
    lineNumber: Double,
    startTime: Double,
    stepArguments: js.Array[String],
    stepText: String
  ): IStepResult = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stepArguments = stepArguments.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStepResult]
  }
  
  @scala.inline
  implicit class IStepResultOps[Self <: IStepResult] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepArgumentsVarargs(value: String*): Self = this.set("stepArguments", js.Array(value :_*))
    
    @scala.inline
    def setStepArguments(value: js.Array[String]): Self = this.set("stepArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepText(value: String): Self = this.set("stepText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
}
