package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of an account, i.e., information about its products, which is
  * computed offline and not returned immediately at insertion time.
  */
trait SchemaAccountStatus extends StObject {
  
  /**
    * The ID of the account for which the status is reported.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of account level issues.
    */
  var accountLevelIssues: js.UndefOr[js.Array[SchemaAccountStatusAccountLevelIssue]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * List of product-related data by channel, destination, and country. Data
    * in this field may be delayed by up to 30 minutes.
    */
  var products: js.UndefOr[js.Array[SchemaAccountStatusProducts]] = js.undefined
  
  /**
    * Whether the account&#39;s website is claimed or not.
    */
  var websiteClaimed: js.UndefOr[Boolean] = js.undefined
}
object SchemaAccountStatus {
  
  @scala.inline
  def apply(): SchemaAccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatus]
  }
  
  @scala.inline
  implicit class SchemaAccountStatusMutableBuilder[Self <: SchemaAccountStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountLevelIssues(value: js.Array[SchemaAccountStatusAccountLevelIssue]): Self = StObject.set(x, "accountLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountLevelIssuesUndefined: Self = StObject.set(x, "accountLevelIssues", js.undefined)
    
    @scala.inline
    def setAccountLevelIssuesVarargs(value: SchemaAccountStatusAccountLevelIssue*): Self = StObject.set(x, "accountLevelIssues", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[SchemaAccountStatusProducts]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SchemaAccountStatusProducts*): Self = StObject.set(x, "products", js.Array(value :_*))
    
    @scala.inline
    def setWebsiteClaimed(value: Boolean): Self = StObject.set(x, "websiteClaimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteClaimedUndefined: Self = StObject.set(x, "websiteClaimed", js.undefined)
  }
}
