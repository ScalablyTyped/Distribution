package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Account List Response
  */
trait SchemaAccountsListResponse extends StObject {
  
  /**
    * Account collection.
    */
  var accounts: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaAccountsListResponse {
  
  @scala.inline
  def apply(): SchemaAccountsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsListResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountsListResponseMutableBuilder[Self <: SchemaAccountsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[SchemaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: SchemaAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
