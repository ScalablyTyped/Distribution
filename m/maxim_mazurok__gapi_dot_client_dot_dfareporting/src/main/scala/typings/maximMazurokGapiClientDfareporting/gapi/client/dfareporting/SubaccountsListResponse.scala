package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubaccountsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#subaccountsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Subaccount collection. */
  var subaccounts: js.UndefOr[js.Array[Subaccount]] = js.native
}
object SubaccountsListResponse {
  
  @scala.inline
  def apply(): SubaccountsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubaccountsListResponse]
  }
  
  @scala.inline
  implicit class SubaccountsListResponseMutableBuilder[Self <: SubaccountsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSubaccounts(value: js.Array[Subaccount]): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    @scala.inline
    def setSubaccountsVarargs(value: Subaccount*): Self = StObject.set(x, "subaccounts", js.Array(value :_*))
  }
}
