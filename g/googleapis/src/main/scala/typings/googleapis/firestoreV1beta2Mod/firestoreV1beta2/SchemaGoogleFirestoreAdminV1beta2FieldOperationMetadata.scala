package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.UpdateField.
  */
trait SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata extends StObject {
  
  /**
    * The progress, in bytes, of this operation.
    */
  var bytesProgress: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Progress] = js.undefined
  
  /**
    * The progress, in documents, of this operation.
    */
  var documentProgress: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Progress] = js.undefined
  
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
  var indexConfigDeltas: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta]] = js.undefined
  
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta2FieldOperationMetadata](x: Self) {
    
    inline def setBytesProgress(value: SchemaGoogleFirestoreAdminV1beta2Progress): Self = StObject.set(x, "bytesProgress", value.asInstanceOf[js.Any])
    
    inline def setBytesProgressUndefined: Self = StObject.set(x, "bytesProgress", js.undefined)
    
    inline def setDocumentProgress(value: SchemaGoogleFirestoreAdminV1beta2Progress): Self = StObject.set(x, "documentProgress", value.asInstanceOf[js.Any])
    
    inline def setDocumentProgressUndefined: Self = StObject.set(x, "documentProgress", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setIndexConfigDeltas(value: js.Array[SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta]): Self = StObject.set(x, "indexConfigDeltas", value.asInstanceOf[js.Any])
    
    inline def setIndexConfigDeltasUndefined: Self = StObject.set(x, "indexConfigDeltas", js.undefined)
    
    inline def setIndexConfigDeltasVarargs(value: SchemaGoogleFirestoreAdminV1beta2IndexConfigDelta*): Self = StObject.set(x, "indexConfigDeltas", js.Array(value :_*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
