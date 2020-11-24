package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Order document List Response
  */
@js.native
trait SchemaOrderDocumentsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#orderDocumentsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Order document collection
    */
  var orderDocuments: js.UndefOr[js.Array[SchemaOrderDocument]] = js.native
}
object SchemaOrderDocumentsListResponse {
  
  @scala.inline
  def apply(): SchemaOrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDocumentsListResponse]
  }
  
  @scala.inline
  implicit class SchemaOrderDocumentsListResponseOps[Self <: SchemaOrderDocumentsListResponse] (val x: Self) extends AnyVal {
    
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
    def setOrderDocumentsVarargs(value: SchemaOrderDocument*): Self = this.set("orderDocuments", js.Array(value :_*))
    
    @scala.inline
    def setOrderDocuments(value: js.Array[SchemaOrderDocument]): Self = this.set("orderDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderDocuments: Self = this.set("orderDocuments", js.undefined)
  }
}
