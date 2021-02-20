package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Accounts Response.
  */
@js.native
trait SchemaListAccountsResponse extends StObject {
  
  /**
    * List of GTM Accounts that a user has access to.
    */
  var account: js.UndefOr[js.Array[SchemaAccount]] = js.native
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
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
    def setAccount(value: js.Array[SchemaAccount]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setAccountVarargs(value: SchemaAccount*): Self = StObject.set(x, "account", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
