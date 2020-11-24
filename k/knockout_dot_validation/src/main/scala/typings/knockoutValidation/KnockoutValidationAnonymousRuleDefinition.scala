package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationAnonymousRuleDefinition extends js.Object {
  
  var validation: KnockoutValidationRuleDefinition = js.native
}
object KnockoutValidationAnonymousRuleDefinition {
  
  @scala.inline
  def apply(validation: KnockoutValidationRuleDefinition): KnockoutValidationAnonymousRuleDefinition = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationAnonymousRuleDefinition]
  }
  
  @scala.inline
  implicit class KnockoutValidationAnonymousRuleDefinitionOps[Self <: KnockoutValidationAnonymousRuleDefinition] (val x: Self) extends AnyVal {
    
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
    def setValidation(value: KnockoutValidationRuleDefinition): Self = this.set("validation", value.asInstanceOf[js.Any])
  }
}
