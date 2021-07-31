package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subaccount List Response
  */
trait SchemaSubaccountsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#subaccountsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Subaccount collection.
    */
  var subaccounts: js.UndefOr[js.Array[SchemaSubaccount]] = js.undefined
}
object SchemaSubaccountsListResponse {
  
  @scala.inline
  def apply(): SchemaSubaccountsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubaccountsListResponse]
  }
  
  @scala.inline
  implicit class SchemaSubaccountsListResponseMutableBuilder[Self <: SchemaSubaccountsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubaccounts(value: js.Array[SchemaSubaccount]): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    @scala.inline
    def setSubaccountsVarargs(value: SchemaSubaccount*): Self = StObject.set(x, "subaccounts", js.Array(value :_*))
  }
}
