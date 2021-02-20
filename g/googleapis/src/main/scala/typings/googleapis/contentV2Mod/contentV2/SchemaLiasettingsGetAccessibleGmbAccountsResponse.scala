package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiasettingsGetAccessibleGmbAccountsResponse extends StObject {
  
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[SchemaGmbAccountsGmbAccount]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsGetAccessibleGmbAccountsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaLiasettingsGetAccessibleGmbAccountsResponse {
  
  @scala.inline
  def apply(): SchemaLiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsGetAccessibleGmbAccountsResponseMutableBuilder[Self <: SchemaLiasettingsGetAccessibleGmbAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setGmbAccounts(value: js.Array[SchemaGmbAccountsGmbAccount]): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    @scala.inline
    def setGmbAccountsVarargs(value: SchemaGmbAccountsGmbAccount*): Self = StObject.set(x, "gmbAccounts", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
