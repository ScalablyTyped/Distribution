package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.UpdateField.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata extends StObject {
  
  /**
    * The progress, in bytes, of this operation.
    */
  var bytesProgress: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Progress] = js.native
  
  /**
    * The progress, in documents, of this operation.
    */
  var documentProgress: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Progress] = js.native
  
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The field resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * A list of IndexConfigDelta, which describe the intent of this operation.
    */
  var indexConfigDeltas: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta]] = js.native
  
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadataMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesProgress(value: SchemaGoogleFirestoreAdminV1beta2Progress): Self = StObject.set(x, "bytesProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesProgressUndefined: Self = StObject.set(x, "bytesProgress", js.undefined)
    
    @scala.inline
    def setDocumentProgress(value: SchemaGoogleFirestoreAdminV1beta2Progress): Self = StObject.set(x, "documentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentProgressUndefined: Self = StObject.set(x, "documentProgress", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setIndexConfigDeltas(value: js.Array[SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta]): Self = StObject.set(x, "indexConfigDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexConfigDeltasUndefined: Self = StObject.set(x, "indexConfigDeltas", js.undefined)
    
    @scala.inline
    def setIndexConfigDeltasVarargs(value: SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta*): Self = StObject.set(x, "indexConfigDeltas", js.Array(value :_*))
    
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
