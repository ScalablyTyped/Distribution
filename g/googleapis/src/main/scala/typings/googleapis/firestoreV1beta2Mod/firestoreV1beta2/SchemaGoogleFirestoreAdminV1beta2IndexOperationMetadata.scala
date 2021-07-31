package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.CreateIndex.
  */
trait SchemaGoogleFirestoreAdminV1beta2IndexOperationMetadata extends StObject {
  
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The index resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
    */
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * The progress, in bytes, of this operation.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Progress] = js.undefined
  
  /**
    * The progress, in documents, of this operation.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1beta2Progress] = js.undefined
  
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2IndexOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2IndexOperationMetadataMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta2IndexOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setProgressBytes(value: SchemaGoogleFirestoreAdminV1beta2Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    @scala.inline
    def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1beta2Progress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
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
