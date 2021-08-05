package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsGetAccessibleGmbAccountsResponse extends StObject {
  
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[SchemaGmbAccountsGmbAccount]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsGetAccessibleGmbAccountsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaLiasettingsGetAccessibleGmbAccountsResponse {
  
  inline def apply(): SchemaLiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsGetAccessibleGmbAccountsResponse]
  }
  
  extension [Self <: SchemaLiasettingsGetAccessibleGmbAccountsResponse](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setGmbAccounts(value: js.Array[SchemaGmbAccountsGmbAccount]): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    inline def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    inline def setGmbAccountsVarargs(value: SchemaGmbAccountsGmbAccount*): Self = StObject.set(x, "gmbAccounts", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
