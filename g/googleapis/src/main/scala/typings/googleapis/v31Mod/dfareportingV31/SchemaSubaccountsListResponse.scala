package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subaccount List Response
  */
@js.native
trait SchemaSubaccountsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#subaccountsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Subaccount collection.
    */
  var subaccounts: js.UndefOr[js.Array[SchemaSubaccount]] = js.native
}
object SchemaSubaccountsListResponse {
  
  @scala.inline
  def apply(): SchemaSubaccountsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubaccountsListResponse]
  }
  
  @scala.inline
  implicit class SchemaSubaccountsListResponseOps[Self <: SchemaSubaccountsListResponse] (val x: Self) extends AnyVal {
    
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
    def setSubaccountsVarargs(value: SchemaSubaccount*): Self = this.set("subaccounts", js.Array(value :_*))
    
    @scala.inline
    def setSubaccounts(value: js.Array[SchemaSubaccount]): Self = this.set("subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccounts: Self = this.set("subaccounts", js.undefined)
  }
}
