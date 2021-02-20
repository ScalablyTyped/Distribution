package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rules extends StObject {
  
  var ruleFile: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[typings.matrixAppserviceBridge.roomLinkValidatorMod.Rules] = js.native
}
object Rules {
  
  @scala.inline
  def apply(): Rules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rules]
  }
  
  @scala.inline
  implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleFile(value: String): Self = StObject.set(x, "ruleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleFileUndefined: Self = StObject.set(x, "ruleFile", js.undefined)
    
    @scala.inline
    def setRules(value: typings.matrixAppserviceBridge.roomLinkValidatorMod.Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
  }
}
