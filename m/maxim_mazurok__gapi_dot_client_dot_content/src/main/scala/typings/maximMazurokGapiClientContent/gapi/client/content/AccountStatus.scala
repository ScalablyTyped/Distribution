package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountStatus extends StObject {
  
  /** The ID of the account for which the status is reported. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** A list of account level issues. */
  var accountLevelIssues: js.UndefOr[js.Array[AccountStatusAccountLevelIssue]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#accountStatus`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** List of product-related data by channel, destination, and country. Data in this field may be delayed by up to 30 minutes. */
  var products: js.UndefOr[js.Array[AccountStatusProducts]] = js.undefined
  
  /** Whether the account's website is claimed or not. */
  var websiteClaimed: js.UndefOr[Boolean] = js.undefined
}
object AccountStatus {
  
  @scala.inline
  def apply(): AccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatus]
  }
  
  @scala.inline
  implicit class AccountStatusMutableBuilder[Self <: AccountStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountLevelIssues(value: js.Array[AccountStatusAccountLevelIssue]): Self = StObject.set(x, "accountLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountLevelIssuesUndefined: Self = StObject.set(x, "accountLevelIssues", js.undefined)
    
    @scala.inline
    def setAccountLevelIssuesVarargs(value: AccountStatusAccountLevelIssue*): Self = StObject.set(x, "accountLevelIssues", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[AccountStatusProducts]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: AccountStatusProducts*): Self = StObject.set(x, "products", js.Array(value :_*))
    
    @scala.inline
    def setWebsiteClaimed(value: Boolean): Self = StObject.set(x, "websiteClaimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteClaimedUndefined: Self = StObject.set(x, "websiteClaimed", js.undefined)
  }
}
