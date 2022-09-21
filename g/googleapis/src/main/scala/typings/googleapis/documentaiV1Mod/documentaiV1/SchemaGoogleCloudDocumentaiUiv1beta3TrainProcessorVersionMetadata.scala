package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata] = js.undefined
  
  /**
    * The test dataset validation information.
    */
  var testDatasetValidation: js.UndefOr[
    SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation
  ] = js.undefined
  
  /**
    * The training dataset validation information.
    */
  var trainingDatasetValidation: js.UndefOr[
    SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation
  ] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
    
    inline def setTestDatasetValidation(value: SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation): Self = StObject.set(x, "testDatasetValidation", value.asInstanceOf[js.Any])
    
    inline def setTestDatasetValidationUndefined: Self = StObject.set(x, "testDatasetValidation", js.undefined)
    
    inline def setTrainingDatasetValidation(value: SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation): Self = StObject.set(x, "trainingDatasetValidation", value.asInstanceOf[js.Any])
    
    inline def setTrainingDatasetValidationUndefined: Self = StObject.set(x, "trainingDatasetValidation", js.undefined)
  }
}
