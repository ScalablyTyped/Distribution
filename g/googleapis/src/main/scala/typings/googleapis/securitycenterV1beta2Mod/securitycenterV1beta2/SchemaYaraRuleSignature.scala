package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaYaraRuleSignature extends StObject {
  
  /**
    * The name of the YARA rule.
    */
  var yaraRule: js.UndefOr[String | Null] = js.undefined
}
object SchemaYaraRuleSignature {
  
  inline def apply(): SchemaYaraRuleSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYaraRuleSignature]
  }
  
  extension [Self <: SchemaYaraRuleSignature](x: Self) {
    
    inline def setYaraRule(value: String): Self = StObject.set(x, "yaraRule", value.asInstanceOf[js.Any])
    
    inline def setYaraRuleNull: Self = StObject.set(x, "yaraRule", null)
    
    inline def setYaraRuleUndefined: Self = StObject.set(x, "yaraRule", js.undefined)
  }
}
