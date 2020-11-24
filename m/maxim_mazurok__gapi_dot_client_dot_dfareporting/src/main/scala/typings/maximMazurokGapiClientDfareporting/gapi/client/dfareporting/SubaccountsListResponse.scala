package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubaccountsListResponse extends js.Object {
  
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
  implicit class SubaccountsListResponseOps[Self <: SubaccountsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSubaccountsVarargs(value: Subaccount*): Self = this.set("subaccounts", js.Array(value :_*))
    
    @scala.inline
    def setSubaccounts(value: js.Array[Subaccount]): Self = this.set("subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccounts: Self = this.set("subaccounts", js.undefined)
  }
}
