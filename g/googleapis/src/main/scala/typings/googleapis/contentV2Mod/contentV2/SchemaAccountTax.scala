package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountTax extends StObject {
  
  /**
    * Required. The ID of the account to which these account tax settings belong.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#accountTax".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tax rules. Updating the tax rules will enable US taxes (not reversible). Defining no rules is equivalent to not charging tax at all.
    */
  var rules: js.UndefOr[js.Array[SchemaAccountTaxTaxRule]] = js.undefined
}
object SchemaAccountTax {
  
  inline def apply(): SchemaAccountTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTax]
  }
  
  extension [Self <: SchemaAccountTax](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRules(value: js.Array[SchemaAccountTaxTaxRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaAccountTaxTaxRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
