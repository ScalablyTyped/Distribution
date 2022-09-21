package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountStatus extends StObject {
  
  /**
    * The ID of the account for which the status is reported.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of account level issues.
    */
  var accountLevelIssues: js.UndefOr[js.Array[SchemaAccountStatusAccountLevelIssue]] = js.undefined
  
  /**
    * How the account is managed. Acceptable values are: - "`manual`" - "`automatic`"
    */
  var accountManagement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#accountStatus`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of product-related data by channel, destination, and country. Data in this field may be delayed by up to 30 minutes.
    */
  var products: js.UndefOr[js.Array[SchemaAccountStatusProducts]] = js.undefined
  
  /**
    * Whether the account's website is claimed or not.
    */
  var websiteClaimed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountStatus {
  
  inline def apply(): SchemaAccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatus]
  }
  
  extension [Self <: SchemaAccountStatus](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountLevelIssues(value: js.Array[SchemaAccountStatusAccountLevelIssue]): Self = StObject.set(x, "accountLevelIssues", value.asInstanceOf[js.Any])
    
    inline def setAccountLevelIssuesUndefined: Self = StObject.set(x, "accountLevelIssues", js.undefined)
    
    inline def setAccountLevelIssuesVarargs(value: SchemaAccountStatusAccountLevelIssue*): Self = StObject.set(x, "accountLevelIssues", js.Array(value*))
    
    inline def setAccountManagement(value: String): Self = StObject.set(x, "accountManagement", value.asInstanceOf[js.Any])
    
    inline def setAccountManagementNull: Self = StObject.set(x, "accountManagement", null)
    
    inline def setAccountManagementUndefined: Self = StObject.set(x, "accountManagement", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProducts(value: js.Array[SchemaAccountStatusProducts]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaAccountStatusProducts*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setWebsiteClaimed(value: Boolean): Self = StObject.set(x, "websiteClaimed", value.asInstanceOf[js.Any])
    
    inline def setWebsiteClaimedNull: Self = StObject.set(x, "websiteClaimed", null)
    
    inline def setWebsiteClaimedUndefined: Self = StObject.set(x, "websiteClaimed", js.undefined)
  }
}
