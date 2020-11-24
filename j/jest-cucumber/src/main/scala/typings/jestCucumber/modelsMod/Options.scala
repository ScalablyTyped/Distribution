package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var errors: js.UndefOr[ErrorOptions | Boolean] = js.native
  
  var loadRelativePath: js.UndefOr[Boolean] = js.native
  
  var scenarioNameTemplate: js.UndefOr[js.Function1[/* vars */ ScenarioNameTemplateVars, String]] = js.native
  
  var tagFilter: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setErrors(value: ErrorOptions | Boolean): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setLoadRelativePath(value: Boolean): Self = this.set("loadRelativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadRelativePath: Self = this.set("loadRelativePath", js.undefined)
    
    @scala.inline
    def setScenarioNameTemplate(value: /* vars */ ScenarioNameTemplateVars => String): Self = this.set("scenarioNameTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScenarioNameTemplate: Self = this.set("scenarioNameTemplate", js.undefined)
    
    @scala.inline
    def setTagFilter(value: String): Self = this.set("tagFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFilter: Self = this.set("tagFilter", js.undefined)
  }
}
