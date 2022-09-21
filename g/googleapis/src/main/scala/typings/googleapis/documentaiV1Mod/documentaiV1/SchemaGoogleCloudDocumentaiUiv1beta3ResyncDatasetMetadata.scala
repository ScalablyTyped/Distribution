package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata] = js.undefined
  
  /**
    * The list of dataset resync statuses. Not checked when `dataset_documents` is specified in ResyncRequest.
    */
  var datasetResyncStatuses: js.UndefOr[
    js.Array[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus]
  ] = js.undefined
  
  /**
    * The list of document resync statuses. The same document could have multiple `individual_document_resync_statuses` if it has multiple inconsistencies.
    */
  var individualDocumentResyncStatuses: js.UndefOr[
    js.Array[
      SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus
    ]
  ] = js.undefined
  
  /**
    * Returns the newly added document Cloud Storage prefix if the documents are founded in Cloud Storage while not in Document Service storage.
    */
  var newlyAddedDocuments: js.UndefOr[
    js.Array[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument]
  ] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
    
    inline def setDatasetResyncStatuses(value: js.Array[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus]): Self = StObject.set(x, "datasetResyncStatuses", value.asInstanceOf[js.Any])
    
    inline def setDatasetResyncStatusesUndefined: Self = StObject.set(x, "datasetResyncStatuses", js.undefined)
    
    inline def setDatasetResyncStatusesVarargs(value: SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataDatasetResyncStatus*): Self = StObject.set(x, "datasetResyncStatuses", js.Array(value*))
    
    inline def setIndividualDocumentResyncStatuses(
      value: js.Array[
          SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus
        ]
    ): Self = StObject.set(x, "individualDocumentResyncStatuses", value.asInstanceOf[js.Any])
    
    inline def setIndividualDocumentResyncStatusesUndefined: Self = StObject.set(x, "individualDocumentResyncStatuses", js.undefined)
    
    inline def setIndividualDocumentResyncStatusesVarargs(value: SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus*): Self = StObject.set(x, "individualDocumentResyncStatuses", js.Array(value*))
    
    inline def setNewlyAddedDocuments(value: js.Array[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument]): Self = StObject.set(x, "newlyAddedDocuments", value.asInstanceOf[js.Any])
    
    inline def setNewlyAddedDocumentsUndefined: Self = StObject.set(x, "newlyAddedDocuments", js.undefined)
    
    inline def setNewlyAddedDocumentsVarargs(value: SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument*): Self = StObject.set(x, "newlyAddedDocuments", js.Array(value*))
  }
}
