package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeller extends StObject {
  
  /**
    * The unique id for the seller. The seller fills in this field. The seller
    * account id is then available to buyer in the product.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional sub-account id for the seller.
    */
  var subAccountId: js.UndefOr[String] = js.undefined
}
object SchemaSeller {
  
  @scala.inline
  def apply(): SchemaSeller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeller]
  }
  
  @scala.inline
  implicit class SchemaSellerMutableBuilder[Self <: SchemaSeller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
  }
}
