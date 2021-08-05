package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleFile extends StObject {
  
  var ruleFile: js.UndefOr[String] = js.undefined
  
  var rules: js.UndefOr[typings.matrixAppserviceBridge.roomLinkValidatorMod.Rules] = js.undefined
  
  var triggerEndpoint: js.UndefOr[Boolean] = js.undefined
}
object RuleFile {
  
  inline def apply(): RuleFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleFile]
  }
  
  extension [Self <: RuleFile](x: Self) {
    
    inline def setRuleFile(value: String): Self = StObject.set(x, "ruleFile", value.asInstanceOf[js.Any])
    
    inline def setRuleFileUndefined: Self = StObject.set(x, "ruleFile", js.undefined)
    
    inline def setRules(value: typings.matrixAppserviceBridge.roomLinkValidatorMod.Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setTriggerEndpoint(value: Boolean): Self = StObject.set(x, "triggerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setTriggerEndpointUndefined: Self = StObject.set(x, "triggerEndpoint", js.undefined)
  }
}
