package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules extends StObject {
  
  var ruleFile: js.UndefOr[String] = js.undefined
  
  var rules: js.UndefOr[typings.matrixAppserviceBridge.roomLinkValidatorMod.Rules] = js.undefined
}
object Rules {
  
  inline def apply(): Rules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rules]
  }
  
  extension [Self <: Rules](x: Self) {
    
    inline def setRuleFile(value: String): Self = StObject.set(x, "ruleFile", value.asInstanceOf[js.Any])
    
    inline def setRuleFileUndefined: Self = StObject.set(x, "ruleFile", js.undefined)
    
    inline def setRules(value: typings.matrixAppserviceBridge.roomLinkValidatorMod.Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
  }
}
