package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.ImportDocuments.
  */
trait SchemaGoogleFirestoreAdminV1beta2ImportDocumentsMetadata extends StObject {
  
  /**
    * Which collection ids are being imported.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The location of the documents being imported.
    */
  var inputUriPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the import operation.
    */
  var operationState: js.UndefOr[String] = js.undefined
  
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
}
object SchemaGoogleFirestoreAdminV1beta2ImportDocumentsMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2ImportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ImportDocumentsMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2ImportDocumentsMetadataMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta2ImportDocumentsMetadata] (val x: Self) extends AnyVal {
    
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
    def setInputUriPrefix(value: String): Self = StObject.set(x, "inputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriPrefixUndefined: Self = StObject.set(x, "inputUriPrefix", js.undefined)
    
    @scala.inline
    def setOperationState(value: String): Self = StObject.set(x, "operationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStateUndefined: Self = StObject.set(x, "operationState", js.undefined)
    
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
  }
}
