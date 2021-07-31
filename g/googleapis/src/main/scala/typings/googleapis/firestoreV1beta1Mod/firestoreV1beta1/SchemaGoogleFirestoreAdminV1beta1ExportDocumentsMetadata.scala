package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ExportDocuments operations.
  */
trait SchemaGoogleFirestoreAdminV1beta1ExportDocumentsMetadata extends StObject {
  
  /**
    * Which collection ids are being exported.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
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
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.undefined
  
  /**
    * An estimate of the number of documents processed.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.undefined
  
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta1ExportDocumentsMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1ExportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ExportDocumentsMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1ExportDocumentsMetadataMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta1ExportDocumentsMetadata] (val x: Self) extends AnyVal {
    
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
    def setProgressBytes(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = StObject.set(x, "progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBytesUndefined: Self = StObject.set(x, "progressBytes", js.undefined)
    
    @scala.inline
    def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = StObject.set(x, "progressDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressDocumentsUndefined: Self = StObject.set(x, "progressDocuments", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
