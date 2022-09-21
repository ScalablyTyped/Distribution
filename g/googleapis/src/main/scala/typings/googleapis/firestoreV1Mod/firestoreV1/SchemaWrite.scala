package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWrite extends StObject {
  
  /**
    * An optional precondition on the document. The write will fail if this is set and not met by the target document.
    */
  var currentDocument: js.UndefOr[SchemaPrecondition] = js.undefined
  
  /**
    * A document name to delete. In the format: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    */
  var delete: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Applies a transformation to a document.
    */
  var transform: js.UndefOr[SchemaDocumentTransform] = js.undefined
  
  /**
    * A document to write.
    */
  var update: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * The fields to update in this write. This field can be set only when the operation is `update`. If the mask is not set for an `update` and the document exists, any existing data will be overwritten. If the mask is set and the document on the server has fields not covered by the mask, they are left unchanged. Fields referenced in the mask, but not present in the input document, are deleted from the document on the server. The field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[SchemaDocumentMask] = js.undefined
  
  /**
    * The transforms to perform after update. This field can be set only when the operation is `update`. If present, this write is equivalent to performing `update` and `transform` to the same document atomically and in order.
    */
  var updateTransforms: js.UndefOr[js.Array[SchemaFieldTransform]] = js.undefined
}
object SchemaWrite {
  
  inline def apply(): SchemaWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWrite]
  }
  
  extension [Self <: SchemaWrite](x: Self) {
    
    inline def setCurrentDocument(value: SchemaPrecondition): Self = StObject.set(x, "currentDocument", value.asInstanceOf[js.Any])
    
    inline def setCurrentDocumentUndefined: Self = StObject.set(x, "currentDocument", js.undefined)
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setTransform(value: SchemaDocumentTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setUpdate(value: SchemaDocument): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateMask(value: SchemaDocumentMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setUpdateTransforms(value: js.Array[SchemaFieldTransform]): Self = StObject.set(x, "updateTransforms", value.asInstanceOf[js.Any])
    
    inline def setUpdateTransformsUndefined: Self = StObject.set(x, "updateTransforms", js.undefined)
    
    inline def setUpdateTransformsVarargs(value: SchemaFieldTransform*): Self = StObject.set(x, "updateTransforms", js.Array(value*))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
