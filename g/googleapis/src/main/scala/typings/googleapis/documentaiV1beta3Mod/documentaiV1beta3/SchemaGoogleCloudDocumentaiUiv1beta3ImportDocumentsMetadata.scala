package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata] = js.undefined
  
  /**
    * Validation statuses of the batch documents import config.
    */
  var importConfigValidationResults: js.UndefOr[
    js.Array[
      SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult
    ]
  ] = js.undefined
  
  /**
    * The list of response details of each document.
    */
  var individualImportStatuses: js.UndefOr[
    js.Array[
      SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus
    ]
  ] = js.undefined
  
  /**
    * Total number of the documents that are qualified for importing.
    */
  var totalDocumentCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
    
    inline def setImportConfigValidationResults(
      value: js.Array[
          SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult
        ]
    ): Self = StObject.set(x, "importConfigValidationResults", value.asInstanceOf[js.Any])
    
    inline def setImportConfigValidationResultsUndefined: Self = StObject.set(x, "importConfigValidationResults", js.undefined)
    
    inline def setImportConfigValidationResultsVarargs(value: SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult*): Self = StObject.set(x, "importConfigValidationResults", js.Array(value*))
    
    inline def setIndividualImportStatuses(
      value: js.Array[
          SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus
        ]
    ): Self = StObject.set(x, "individualImportStatuses", value.asInstanceOf[js.Any])
    
    inline def setIndividualImportStatusesUndefined: Self = StObject.set(x, "individualImportStatuses", js.undefined)
    
    inline def setIndividualImportStatusesVarargs(value: SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus*): Self = StObject.set(x, "individualImportStatuses", js.Array(value*))
    
    inline def setTotalDocumentCount(value: Double): Self = StObject.set(x, "totalDocumentCount", value.asInstanceOf[js.Any])
    
    inline def setTotalDocumentCountNull: Self = StObject.set(x, "totalDocumentCount", null)
    
    inline def setTotalDocumentCountUndefined: Self = StObject.set(x, "totalDocumentCount", js.undefined)
  }
}
