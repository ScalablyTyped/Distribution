package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScenarioNameTemplateVars extends js.Object {
  
  var featureTags: js.Array[String] = js.native
  
  var featureTitle: String = js.native
  
  var scenarioTags: js.Array[String] = js.native
  
  var scenarioTitle: String = js.native
}
object ScenarioNameTemplateVars {
  
  @scala.inline
  def apply(
    featureTags: js.Array[String],
    featureTitle: String,
    scenarioTags: js.Array[String],
    scenarioTitle: String
  ): ScenarioNameTemplateVars = {
    val __obj = js.Dynamic.literal(featureTags = featureTags.asInstanceOf[js.Any], featureTitle = featureTitle.asInstanceOf[js.Any], scenarioTags = scenarioTags.asInstanceOf[js.Any], scenarioTitle = scenarioTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioNameTemplateVars]
  }
  
  @scala.inline
  implicit class ScenarioNameTemplateVarsOps[Self <: ScenarioNameTemplateVars] (val x: Self) extends AnyVal {
    
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
    def setFeatureTagsVarargs(value: String*): Self = this.set("featureTags", js.Array(value :_*))
    
    @scala.inline
    def setFeatureTags(value: js.Array[String]): Self = this.set("featureTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTitle(value: String): Self = this.set("featureTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioTagsVarargs(value: String*): Self = this.set("scenarioTags", js.Array(value :_*))
    
    @scala.inline
    def setScenarioTags(value: js.Array[String]): Self = this.set("scenarioTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioTitle(value: String): Self = this.set("scenarioTitle", value.asInstanceOf[js.Any])
  }
}
