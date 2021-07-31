package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message from a BatchUpdateDocument request.
  */
trait SchemaBatchUpdateDocumentResponse extends StObject {
  
  /**
    * The ID of the document to which the updates were applied to.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * The reply of the updates. This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.undefined
  
  /**
    * The updated write control after applying the request.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.undefined
}
object SchemaBatchUpdateDocumentResponse {
  
  @scala.inline
  def apply(): SchemaBatchUpdateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateDocumentResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdateDocumentResponseMutableBuilder[Self <: SchemaBatchUpdateDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setReplies(value: js.Array[SchemaResponse]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: SchemaResponse*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setWriteControl(value: SchemaWriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
