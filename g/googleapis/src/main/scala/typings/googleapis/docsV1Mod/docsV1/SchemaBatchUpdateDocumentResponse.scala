package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateDocumentResponse extends StObject {
  
  /**
    * The ID of the document to which the updates were applied to.
    */
  var documentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reply of the updates. This maps 1:1 with the updates, although replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.undefined
  
  /**
    * The updated write control after applying the request.
    */
  var writeControl: js.UndefOr[SchemaWriteControl] = js.undefined
}
object SchemaBatchUpdateDocumentResponse {
  
  inline def apply(): SchemaBatchUpdateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateDocumentResponse]
  }
  
  extension [Self <: SchemaBatchUpdateDocumentResponse](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdNull: Self = StObject.set(x, "documentId", null)
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setReplies(value: js.Array[SchemaResponse]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: SchemaResponse*): Self = StObject.set(x, "replies", js.Array(value*))
    
    inline def setWriteControl(value: SchemaWriteControl): Self = StObject.set(x, "writeControl", value.asInstanceOf[js.Any])
    
    inline def setWriteControlUndefined: Self = StObject.set(x, "writeControl", js.undefined)
  }
}
