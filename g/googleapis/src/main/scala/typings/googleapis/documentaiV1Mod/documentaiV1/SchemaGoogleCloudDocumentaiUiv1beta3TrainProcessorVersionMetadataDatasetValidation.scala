package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation extends StObject {
  
  /**
    * The total number of dataset errors.
    */
  var datasetErrorCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Error information for the dataset as a whole. A maximum of 10 dataset errors will be returned. A single dataset error is terminal for training.
    */
  var datasetErrors: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * The total number of document errors.
    */
  var documentErrorCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Error information pertaining to specific documents. A maximum of 10 document errors will be returned. Any document with errors will not be used throughout training.
    */
  var documentErrors: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionMetadataDatasetValidation](x: Self) {
    
    inline def setDatasetErrorCount(value: Double): Self = StObject.set(x, "datasetErrorCount", value.asInstanceOf[js.Any])
    
    inline def setDatasetErrorCountNull: Self = StObject.set(x, "datasetErrorCount", null)
    
    inline def setDatasetErrorCountUndefined: Self = StObject.set(x, "datasetErrorCount", js.undefined)
    
    inline def setDatasetErrors(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "datasetErrors", value.asInstanceOf[js.Any])
    
    inline def setDatasetErrorsUndefined: Self = StObject.set(x, "datasetErrors", js.undefined)
    
    inline def setDatasetErrorsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "datasetErrors", js.Array(value*))
    
    inline def setDocumentErrorCount(value: Double): Self = StObject.set(x, "documentErrorCount", value.asInstanceOf[js.Any])
    
    inline def setDocumentErrorCountNull: Self = StObject.set(x, "documentErrorCount", null)
    
    inline def setDocumentErrorCountUndefined: Self = StObject.set(x, "documentErrorCount", js.undefined)
    
    inline def setDocumentErrors(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "documentErrors", value.asInstanceOf[js.Any])
    
    inline def setDocumentErrorsUndefined: Self = StObject.set(x, "documentErrors", js.undefined)
    
    inline def setDocumentErrorsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "documentErrors", js.Array(value*))
  }
}
