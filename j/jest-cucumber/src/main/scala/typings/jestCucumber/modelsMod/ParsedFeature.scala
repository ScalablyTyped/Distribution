package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedFeature extends js.Object {
  
  var options: Options = js.native
  
  var scenarioOutlines: js.Array[ParsedScenarioOutline] = js.native
  
  var scenarios: js.Array[ParsedScenario] = js.native
  
  var tags: js.Array[String] = js.native
  
  var title: String = js.native
}
object ParsedFeature {
  
  @scala.inline
  def apply(
    options: Options,
    scenarioOutlines: js.Array[ParsedScenarioOutline],
    scenarios: js.Array[ParsedScenario],
    tags: js.Array[String],
    title: String
  ): ParsedFeature = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], scenarioOutlines = scenarioOutlines.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedFeature]
  }
  
  @scala.inline
  implicit class ParsedFeatureOps[Self <: ParsedFeature] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioOutlinesVarargs(value: ParsedScenarioOutline*): Self = this.set("scenarioOutlines", js.Array(value :_*))
    
    @scala.inline
    def setScenarioOutlines(value: js.Array[ParsedScenarioOutline]): Self = this.set("scenarioOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenariosVarargs(value: ParsedScenario*): Self = this.set("scenarios", js.Array(value :_*))
    
    @scala.inline
    def setScenarios(value: js.Array[ParsedScenario]): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
