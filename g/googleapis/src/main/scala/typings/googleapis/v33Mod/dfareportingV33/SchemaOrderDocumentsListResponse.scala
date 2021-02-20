package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Order document List Response
  */
@js.native
trait SchemaOrderDocumentsListResponse extends StObject {
  
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
  implicit class SchemaOrderDocumentsListResponseMutableBuilder[Self <: SchemaOrderDocumentsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOrderDocuments(value: js.Array[SchemaOrderDocument]): Self = StObject.set(x, "orderDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderDocumentsUndefined: Self = StObject.set(x, "orderDocuments", js.undefined)
    
    @scala.inline
    def setOrderDocumentsVarargs(value: SchemaOrderDocument*): Self = StObject.set(x, "orderDocuments", js.Array(value :_*))
  }
}
