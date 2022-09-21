package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata] = js.undefined
  
  /**
    * The destination dataset split type.
    */
  var destDatasetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The destination dataset split type.
    */
  var destSplitType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of response details of each document.
    */
  var individualBatchMoveStatuses: js.UndefOr[
    js.Array[
      SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadataIndividualBatchMoveStatus
    ]
  ] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
    
    inline def setDestDatasetType(value: String): Self = StObject.set(x, "destDatasetType", value.asInstanceOf[js.Any])
    
    inline def setDestDatasetTypeNull: Self = StObject.set(x, "destDatasetType", null)
    
    inline def setDestDatasetTypeUndefined: Self = StObject.set(x, "destDatasetType", js.undefined)
    
    inline def setDestSplitType(value: String): Self = StObject.set(x, "destSplitType", value.asInstanceOf[js.Any])
    
    inline def setDestSplitTypeNull: Self = StObject.set(x, "destSplitType", null)
    
    inline def setDestSplitTypeUndefined: Self = StObject.set(x, "destSplitType", js.undefined)
    
    inline def setIndividualBatchMoveStatuses(
      value: js.Array[
          SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadataIndividualBatchMoveStatus
        ]
    ): Self = StObject.set(x, "individualBatchMoveStatuses", value.asInstanceOf[js.Any])
    
    inline def setIndividualBatchMoveStatusesUndefined: Self = StObject.set(x, "individualBatchMoveStatuses", js.undefined)
    
    inline def setIndividualBatchMoveStatusesVarargs(value: SchemaGoogleCloudDocumentaiUiv1beta3BatchMoveDocumentsMetadataIndividualBatchMoveStatus*): Self = StObject.set(x, "individualBatchMoveStatuses", js.Array(value*))
  }
}
