package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2FormExtractionParams extends StObject {
  
  /**
    * Whether to enable form extraction.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var keyValuePairHints: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint]] = js.undefined
  
  /**
    * Model version of the form extraction system. Default is "builtin/stable". Specify "builtin/latest" for the latest model. For custom form models, specify: "custom/{model_name\}". Model name format is "bucket_name/path/to/modeldir" corresponding to "gs://bucket_name/path/to/modeldir" where annotated examples are stored.
    */
  var modelVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2FormExtractionParams {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2FormExtractionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2FormExtractionParams]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2FormExtractionParams](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKeyValuePairHints(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint]): Self = StObject.set(x, "keyValuePairHints", value.asInstanceOf[js.Any])
    
    inline def setKeyValuePairHintsUndefined: Self = StObject.set(x, "keyValuePairHints", js.undefined)
    
    inline def setKeyValuePairHintsVarargs(value: SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint*): Self = StObject.set(x, "keyValuePairHints", js.Array(value*))
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionNull: Self = StObject.set(x, "modelVersion", null)
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "modelVersion", js.undefined)
  }
}
