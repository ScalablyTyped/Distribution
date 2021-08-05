package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GmbAccounts extends StObject {
  
  /** The ID of the Merchant Center account. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** A list of GMB accounts which are available to the merchant. */
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.undefined
}
object GmbAccounts {
  
  inline def apply(): GmbAccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmbAccounts]
  }
  
  extension [Self <: GmbAccounts](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setGmbAccounts(value: js.Array[GmbAccountsGmbAccount]): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    inline def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    inline def setGmbAccountsVarargs(value: GmbAccountsGmbAccount*): Self = StObject.set(x, "gmbAccounts", js.Array(value :_*))
  }
}
