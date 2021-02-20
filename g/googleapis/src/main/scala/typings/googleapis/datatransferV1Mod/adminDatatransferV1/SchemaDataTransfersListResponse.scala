package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for a collection of DataTransfer resources.
  */
@js.native
trait SchemaDataTransfersListResponse extends StObject {
  
  /**
    * List of data transfer requests.
    */
  var dataTransfers: js.UndefOr[js.Array[SchemaDataTransfer]] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as a collection of data transfer requests.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Continuation token which will be used to specify next page in list API.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDataTransfersListResponse {
  
  @scala.inline
  def apply(): SchemaDataTransfersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTransfersListResponse]
  }
  
  @scala.inline
  implicit class SchemaDataTransfersListResponseMutableBuilder[Self <: SchemaDataTransfersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTransfers(value: js.Array[SchemaDataTransfer]): Self = StObject.set(x, "dataTransfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransfersUndefined: Self = StObject.set(x, "dataTransfers", js.undefined)
    
    @scala.inline
    def setDataTransfersVarargs(value: SchemaDataTransfer*): Self = StObject.set(x, "dataTransfers", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
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
