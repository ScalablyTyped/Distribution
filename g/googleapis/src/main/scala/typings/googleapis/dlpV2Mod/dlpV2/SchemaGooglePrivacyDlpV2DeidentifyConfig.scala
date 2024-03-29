package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DeidentifyConfig extends StObject {
  
  /**
    * Treat the dataset as an image and redact.
    */
  var imageTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2ImageTransformations] = js.undefined
  
  /**
    * Treat the dataset as free-form text and apply the same free text transformation everywhere.
    */
  var infoTypeTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2InfoTypeTransformations] = js.undefined
  
  /**
    * Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table.
    */
  var recordTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2RecordTransformations] = js.undefined
  
  /**
    * Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`.
    */
  var transformationErrorHandling: js.UndefOr[SchemaGooglePrivacyDlpV2TransformationErrorHandling] = js.undefined
}
object SchemaGooglePrivacyDlpV2DeidentifyConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DeidentifyConfig](x: Self) {
    
    inline def setImageTransformations(value: SchemaGooglePrivacyDlpV2ImageTransformations): Self = StObject.set(x, "imageTransformations", value.asInstanceOf[js.Any])
    
    inline def setImageTransformationsUndefined: Self = StObject.set(x, "imageTransformations", js.undefined)
    
    inline def setInfoTypeTransformations(value: SchemaGooglePrivacyDlpV2InfoTypeTransformations): Self = StObject.set(x, "infoTypeTransformations", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeTransformationsUndefined: Self = StObject.set(x, "infoTypeTransformations", js.undefined)
    
    inline def setRecordTransformations(value: SchemaGooglePrivacyDlpV2RecordTransformations): Self = StObject.set(x, "recordTransformations", value.asInstanceOf[js.Any])
    
    inline def setRecordTransformationsUndefined: Self = StObject.set(x, "recordTransformations", js.undefined)
    
    inline def setTransformationErrorHandling(value: SchemaGooglePrivacyDlpV2TransformationErrorHandling): Self = StObject.set(x, "transformationErrorHandling", value.asInstanceOf[js.Any])
    
    inline def setTransformationErrorHandlingUndefined: Self = StObject.set(x, "transformationErrorHandling", js.undefined)
  }
}
