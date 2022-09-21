package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProcessSignature extends StObject {
  
  /**
    * Signature indicating that a binary family was matched.
    */
  var memoryHashSignature: js.UndefOr[SchemaMemoryHashSignature] = js.undefined
  
  /**
    * Signature indicating that a YARA rule was matched.
    */
  var yaraRuleSignature: js.UndefOr[SchemaYaraRuleSignature] = js.undefined
}
object SchemaProcessSignature {
  
  inline def apply(): SchemaProcessSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProcessSignature]
  }
  
  extension [Self <: SchemaProcessSignature](x: Self) {
    
    inline def setMemoryHashSignature(value: SchemaMemoryHashSignature): Self = StObject.set(x, "memoryHashSignature", value.asInstanceOf[js.Any])
    
    inline def setMemoryHashSignatureUndefined: Self = StObject.set(x, "memoryHashSignature", js.undefined)
    
    inline def setYaraRuleSignature(value: SchemaYaraRuleSignature): Self = StObject.set(x, "yaraRuleSignature", value.asInstanceOf[js.Any])
    
    inline def setYaraRuleSignatureUndefined: Self = StObject.set(x, "yaraRuleSignature", js.undefined)
  }
}
