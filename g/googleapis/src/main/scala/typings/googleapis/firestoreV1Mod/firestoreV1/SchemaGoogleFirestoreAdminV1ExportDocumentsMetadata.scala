package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.ExportDocuments.
  */
trait SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata extends StObject {
  
  /**
    * Which collection ids are being exported.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the export operation.
    */
  var operationState: js.UndefOr[String] = js.undefined
  
  /**
    * Where the entities are being exported to.
    */
  var outputUriPrefix: js.UndefOr[String] = js.undefined
  
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
}
object SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1ExportDocumentsMetadataMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    @scala.inline
    def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setOperationState(value: String): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStateUndefined: Self = StObject.set(x, "operationState", js.undefined)
    
    @scala.inline
    def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
    
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
  }
}
