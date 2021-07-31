package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Accounts Response.
  */
trait SchemaListAccountsResponse extends StObject {
  
  /**
    * List of GTM Accounts that a user has access to.
    */
  var accounts: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
}
object SchemaListAccountsResponse {
  
  @scala.inline
  def apply(): SchemaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAccountsResponseMutableBuilder[Self <: SchemaListAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[SchemaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: SchemaAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
  }
}
