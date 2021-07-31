package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.UpdateField.
  */
trait SchemaGoogleFirestoreAdminV1FieldOperationMetadata extends StObject {
  
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The field resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * A list of IndexConfigDelta, which describe the intent of this operation.
    */
  var indexConfigDeltas: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1IndexConfigDelta]] = js.undefined
  
  /**
    * The progress, in bytes, of this operation.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.undefined
  
  /**
    * The progress, in documents, of this operation.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.undefined
  
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1FieldOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1FieldOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1FieldOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1FieldOperationMetadataMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1FieldOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setIndexConfigDeltas(value: js.Array[SchemaGoogleFirestoreAdminV1IndexConfigDelta]): Self = StObject.set(x, "indexConfigDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexConfigDeltasUndefined: Self = StObject.set(x, "indexConfigDeltas", js.undefined)
    
    @scala.inline
    def setIndexConfigDeltasVarargs(value: SchemaGoogleFirestoreAdminV1IndexConfigDelta*): Self = StObject.set(x, "indexConfigDeltas", js.Array(value :_*))
    
    @scala.inline
    def setProgressBytes(value: SchemaGoogleFirestoreAdminV1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    @scala.inline
    def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1Progress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressDocumentsUndefined: Self = StObject.set(x, "progressDocuments", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
