package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV2betaPolicyRule extends StObject {
  
  /**
    * A rule for a deny policy.
    */
  var denyRule: js.UndefOr[SchemaGoogleIamV2betaDenyRule] = js.undefined
  
  /**
    * A user-specified description of the rule. This value can be up to 256 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIamV2betaPolicyRule {
  
  inline def apply(): SchemaGoogleIamV2betaPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV2betaPolicyRule]
  }
  
  extension [Self <: SchemaGoogleIamV2betaPolicyRule](x: Self) {
    
    inline def setDenyRule(value: SchemaGoogleIamV2betaDenyRule): Self = StObject.set(x, "denyRule", value.asInstanceOf[js.Any])
    
    inline def setDenyRuleUndefined: Self = StObject.set(x, "denyRule", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
