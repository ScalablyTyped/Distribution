package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account list response.
  */
@js.native
trait SchemaListServiceAccountsResponse extends StObject {
  
  /**
    * The list of matching service accounts.
    */
  var accounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  
  /**
    * To retrieve the next page of results, set
    * ListServiceAccountsRequest.page_token to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListServiceAccountsResponse {
  
  @scala.inline
  def apply(): SchemaListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaListServiceAccountsResponseMutableBuilder[Self <: SchemaListServiceAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[SchemaServiceAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: SchemaServiceAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
