package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata] = js.undefined
  
  /**
    * The list of response details of each document.
    */
  var individualBatchDeleteStatuses: js.UndefOr[
    js.Array[
      SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadataIndividualBatchDeleteStatus
    ]
  ] = js.undefined
  
  /**
    * Total number of documents deleting from dataset.
    */
  var totalDocumentCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
    
    inline def setIndividualBatchDeleteStatuses(
      value: js.Array[
          SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadataIndividualBatchDeleteStatus
        ]
    ): Self = StObject.set(x, "individualBatchDeleteStatuses", value.asInstanceOf[js.Any])
    
    inline def setIndividualBatchDeleteStatusesUndefined: Self = StObject.set(x, "individualBatchDeleteStatuses", js.undefined)
    
    inline def setIndividualBatchDeleteStatusesVarargs(
      value: SchemaGoogleCloudDocumentaiUiv1beta3BatchDeleteDocumentsMetadataIndividualBatchDeleteStatus*
    ): Self = StObject.set(x, "individualBatchDeleteStatuses", js.Array(value*))
    
    inline def setTotalDocumentCount(value: Double): Self = StObject.set(x, "totalDocumentCount", value.asInstanceOf[js.Any])
    
    inline def setTotalDocumentCountNull: Self = StObject.set(x, "totalDocumentCount", null)
    
    inline def setTotalDocumentCountUndefined: Self = StObject.set(x, "totalDocumentCount", js.undefined)
  }
}
