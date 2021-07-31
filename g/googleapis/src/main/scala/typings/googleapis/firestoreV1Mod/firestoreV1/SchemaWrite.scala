package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A write on a document.
  */
trait SchemaWrite extends StObject {
  
  /**
    * An optional precondition on the document.  The write will fail if this is
    * set and not met by the target document.
    */
  var currentDocument: js.UndefOr[SchemaPrecondition] = js.undefined
  
  /**
    * A document name to delete. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var delete: js.UndefOr[String] = js.undefined
  
  /**
    * Applies a tranformation to a document. At most one `transform` per
    * document is allowed in a given request. An `update` cannot follow a
    * `transform` on the same document in a given request.
    */
  var transform: js.UndefOr[SchemaDocumentTransform] = js.undefined
  
  /**
    * A document to write.
    */
  var update: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * The fields to update in this write.  This field can be set only when the
    * operation is `update`. If the mask is not set for an `update` and the
    * document exists, any existing data will be overwritten. If the mask is
    * set and the document on the server has fields not covered by the mask,
    * they are left unchanged. Fields referenced in the mask, but not present
    * in the input document, are deleted from the document on the server. The
    * field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[SchemaDocumentMask] = js.undefined
}
object SchemaWrite {
  
  @scala.inline
  def apply(): SchemaWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWrite]
  }
  
  @scala.inline
  implicit class SchemaWriteMutableBuilder[Self <: SchemaWrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentDocument(value: SchemaPrecondition): Self = StObject.set(x, "currentDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDocumentUndefined: Self = StObject.set(x, "currentDocument", js.undefined)
    
    @scala.inline
    def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setTransform(value: SchemaDocumentTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setUpdate(value: SchemaDocument): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMask(value: SchemaDocumentMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
