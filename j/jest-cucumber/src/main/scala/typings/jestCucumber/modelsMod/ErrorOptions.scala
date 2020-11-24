package typings.jestCucumber.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorOptions extends js.Object {
  
  var missingScenarioInFeature: Boolean = js.native
  
  var missingScenarioInStepDefinitions: Boolean = js.native
  
  var missingStepInFeature: Boolean = js.native
  
  var missingStepInStepDefinitions: Boolean = js.native
}
object ErrorOptions {
  
  @scala.inline
  def apply(
    missingScenarioInFeature: Boolean,
    missingScenarioInStepDefinitions: Boolean,
    missingStepInFeature: Boolean,
    missingStepInStepDefinitions: Boolean
  ): ErrorOptions = {
    val __obj = js.Dynamic.literal(missingScenarioInFeature = missingScenarioInFeature.asInstanceOf[js.Any], missingScenarioInStepDefinitions = missingScenarioInStepDefinitions.asInstanceOf[js.Any], missingStepInFeature = missingStepInFeature.asInstanceOf[js.Any], missingStepInStepDefinitions = missingStepInStepDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOptions]
  }
  
  @scala.inline
  implicit class ErrorOptionsOps[Self <: ErrorOptions] (val x: Self) extends AnyVal {
    
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
    def setMissingScenarioInFeature(value: Boolean): Self = this.set("missingScenarioInFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingScenarioInStepDefinitions(value: Boolean): Self = this.set("missingScenarioInStepDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingStepInFeature(value: Boolean): Self = this.set("missingStepInFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingStepInStepDefinitions(value: Boolean): Self = this.set("missingStepInStepDefinitions", value.asInstanceOf[js.Any])
  }
}
