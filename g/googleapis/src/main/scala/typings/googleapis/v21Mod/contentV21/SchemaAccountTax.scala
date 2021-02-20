package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The tax settings of a merchant account. All methods require the admin role.
  */
@js.native
trait SchemaAccountTax extends StObject {
  
  /**
    * The ID of the account to which these account tax settings belong.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountTax&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Tax rules. Updating the tax rules will enable US taxes (not reversible).
    * Defining no rules is equivalent to not charging tax at all.
    */
  var rules: js.UndefOr[js.Array[SchemaAccountTaxTaxRule]] = js.native
}
object SchemaAccountTax {
  
  @scala.inline
  def apply(): SchemaAccountTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTax]
  }
  
  @scala.inline
  implicit class SchemaAccountTaxMutableBuilder[Self <: SchemaAccountTax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[SchemaAccountTaxTaxRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaAccountTaxTaxRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
