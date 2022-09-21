package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest extends StObject {
  
  /**
    * Controls AutoML model prediction behavior. AutoMlParams cannot be used together with other Params.
    */
  var automlParams: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2AutoMlParams] = js.undefined
  
  /**
    * Specifies a known document type for deeper structure detection. Valid values are currently "general" and "invoice". If not provided, "general"\ is used as default. If any other value is given, the request is rejected.
    */
  var documentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls entity extraction behavior. If not specified, the system will decide reasonable defaults.
    */
  var entityExtractionParams: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2EntityExtractionParams] = js.undefined
  
  /**
    * Controls form extraction behavior. If not specified, the system will decide reasonable defaults.
    */
  var formExtractionParams: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2FormExtractionParams] = js.undefined
  
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2InputConfig] = js.undefined
  
  /**
    * Controls OCR behavior. If not specified, the system will decide reasonable defaults.
    */
  var ocrParams: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2OcrParams] = js.undefined
  
  /**
    * The desired output location. This field is only needed in BatchProcessDocumentsRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2OutputConfig] = js.undefined
  
  /**
    * Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no location is specified, a region will be chosen automatically. This field is only populated when used in ProcessDocument method.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls table extraction behavior. If not specified, the system will decide reasonable defaults.
    */
  var tableExtractionParams: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta2TableExtractionParams] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2ProcessDocumentRequest](x: Self) {
    
    inline def setAutomlParams(value: SchemaGoogleCloudDocumentaiV1beta2AutoMlParams): Self = StObject.set(x, "automlParams", value.asInstanceOf[js.Any])
    
    inline def setAutomlParamsUndefined: Self = StObject.set(x, "automlParams", js.undefined)
    
    inline def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeNull: Self = StObject.set(x, "documentType", null)
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
    
    inline def setEntityExtractionParams(value: SchemaGoogleCloudDocumentaiV1beta2EntityExtractionParams): Self = StObject.set(x, "entityExtractionParams", value.asInstanceOf[js.Any])
    
    inline def setEntityExtractionParamsUndefined: Self = StObject.set(x, "entityExtractionParams", js.undefined)
    
    inline def setFormExtractionParams(value: SchemaGoogleCloudDocumentaiV1beta2FormExtractionParams): Self = StObject.set(x, "formExtractionParams", value.asInstanceOf[js.Any])
    
    inline def setFormExtractionParamsUndefined: Self = StObject.set(x, "formExtractionParams", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudDocumentaiV1beta2InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setOcrParams(value: SchemaGoogleCloudDocumentaiV1beta2OcrParams): Self = StObject.set(x, "ocrParams", value.asInstanceOf[js.Any])
    
    inline def setOcrParamsUndefined: Self = StObject.set(x, "ocrParams", js.undefined)
    
    inline def setOutputConfig(value: SchemaGoogleCloudDocumentaiV1beta2OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTableExtractionParams(value: SchemaGoogleCloudDocumentaiV1beta2TableExtractionParams): Self = StObject.set(x, "tableExtractionParams", value.asInstanceOf[js.Any])
    
    inline def setTableExtractionParamsUndefined: Self = StObject.set(x, "tableExtractionParams", js.undefined)
  }
}
