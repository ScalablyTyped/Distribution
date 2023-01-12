package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiasettingsGetAccessibleGmbAccountsResponse extends StObject {
  
  /** The ID of the Merchant Center account. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** A list of Business Profiles which are available to the merchant. */
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#liasettingsGetAccessibleGmbAccountsResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object LiasettingsGetAccessibleGmbAccountsResponse {
  
  inline def apply(): LiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsGetAccessibleGmbAccountsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiasettingsGetAccessibleGmbAccountsResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setGmbAccounts(value: js.Array[GmbAccountsGmbAccount]): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    inline def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    inline def setGmbAccountsVarargs(value: GmbAccountsGmbAccount*): Self = StObject.set(x, "gmbAccounts", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
