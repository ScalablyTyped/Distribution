package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequest extends StObject {
  
  /**
    * The overall output config for batch process.
    */
  var documentOutputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfig] = js.undefined
  
  /**
    * The input config for each single document in the batch process.
    */
  var inputConfigs: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig]] = js.undefined
  
  /**
    * The input documents for batch process.
    */
  var inputDocuments: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3BatchDocumentsInputConfig] = js.undefined
  
  /**
    * The overall output config for batch process.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchOutputConfig] = js.undefined
  
  /**
    * Whether Human Review feature should be skipped for this request. Default to false.
    */
  var skipHumanReview: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequest](x: Self) {
    
    inline def setDocumentOutputConfig(value: SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfig): Self = StObject.set(x, "documentOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentOutputConfigUndefined: Self = StObject.set(x, "documentOutputConfig", js.undefined)
    
    inline def setInputConfigs(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig]): Self = StObject.set(x, "inputConfigs", value.asInstanceOf[js.Any])
    
    inline def setInputConfigsUndefined: Self = StObject.set(x, "inputConfigs", js.undefined)
    
    inline def setInputConfigsVarargs(value: SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig*): Self = StObject.set(x, "inputConfigs", js.Array(value*))
    
    inline def setInputDocuments(value: SchemaGoogleCloudDocumentaiV1beta3BatchDocumentsInputConfig): Self = StObject.set(x, "inputDocuments", value.asInstanceOf[js.Any])
    
    inline def setInputDocumentsUndefined: Self = StObject.set(x, "inputDocuments", js.undefined)
    
    inline def setOutputConfig(value: SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setSkipHumanReview(value: Boolean): Self = StObject.set(x, "skipHumanReview", value.asInstanceOf[js.Any])
    
    inline def setSkipHumanReviewNull: Self = StObject.set(x, "skipHumanReview", null)
    
    inline def setSkipHumanReviewUndefined: Self = StObject.set(x, "skipHumanReview", js.undefined)
  }
}
