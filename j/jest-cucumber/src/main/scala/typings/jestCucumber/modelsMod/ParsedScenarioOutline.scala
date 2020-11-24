package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedScenarioOutline extends js.Object {
  
  var lineNumber: Double = js.native
  
  var scenarios: js.Array[ParsedScenario] = js.native
  
  var skippedViaTagFilter: Boolean = js.native
  
  var steps: js.Array[ParsedStep] = js.native
  
  var tags: js.Array[String] = js.native
  
  var title: String = js.native
}
object ParsedScenarioOutline {
  
  @scala.inline
  def apply(
    lineNumber: Double,
    scenarios: js.Array[ParsedScenario],
    skippedViaTagFilter: Boolean,
    steps: js.Array[ParsedStep],
    tags: js.Array[String],
    title: String
  ): ParsedScenarioOutline = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], skippedViaTagFilter = skippedViaTagFilter.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedScenarioOutline]
  }
  
  @scala.inline
  implicit class ParsedScenarioOutlineOps[Self <: ParsedScenarioOutline] (val x: Self) extends AnyVal {
    
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
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenariosVarargs(value: ParsedScenario*): Self = this.set("scenarios", js.Array(value :_*))
    
    @scala.inline
    def setScenarios(value: js.Array[ParsedScenario]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedViaTagFilter(value: Boolean): Self = this.set("skippedViaTagFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: ParsedStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[ParsedStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
