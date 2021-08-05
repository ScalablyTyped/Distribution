package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGmbAccounts extends StObject {
  
  /**
    * The ID of the account.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of GMB accounts which are available to the merchant.
    */
  var gmbAccounts: js.UndefOr[js.Array[SchemaGmbAccountsGmbAccount]] = js.undefined
}
object SchemaGmbAccounts {
  
  inline def apply(): SchemaGmbAccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmbAccounts]
  }
  
  extension [Self <: SchemaGmbAccounts](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setGmbAccounts(value: js.Array[SchemaGmbAccountsGmbAccount]): Self = StObject.set(x, "gmbAccounts", value.asInstanceOf[js.Any])
    
    inline def setGmbAccountsUndefined: Self = StObject.set(x, "gmbAccounts", js.undefined)
    
    inline def setGmbAccountsVarargs(value: SchemaGmbAccountsGmbAccount*): Self = StObject.set(x, "gmbAccounts", js.Array(value :_*))
  }
}
