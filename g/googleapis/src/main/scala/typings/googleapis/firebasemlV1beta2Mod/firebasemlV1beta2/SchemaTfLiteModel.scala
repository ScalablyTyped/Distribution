package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTfLiteModel extends StObject {
  
  /**
    * The AutoML model id referencing a model you created with the AutoML API. The name should have format 'projects//locations//models/' (This is the model resource name returned from the AutoML API)
    */
  var automlModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The TfLite file containing the model. (Stored in Google Cloud). The gcs_tflite_uri should have form: gs://some-bucket/some-model.tflite Note: If you update the file in the original location, it is necessary to call UpdateModel for ML to pick up and validate the updated file.
    */
  var gcsTfliteUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The size of the TFLite model
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaTfLiteModel {
  
  inline def apply(): SchemaTfLiteModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTfLiteModel]
  }
  
  extension [Self <: SchemaTfLiteModel](x: Self) {
    
    inline def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
    
    inline def setAutomlModelNull: Self = StObject.set(x, "automlModel", null)
    
    inline def setAutomlModelUndefined: Self = StObject.set(x, "automlModel", js.undefined)
    
    inline def setGcsTfliteUri(value: String): Self = StObject.set(x, "gcsTfliteUri", value.asInstanceOf[js.Any])
    
    inline def setGcsTfliteUriNull: Self = StObject.set(x, "gcsTfliteUri", null)
    
    inline def setGcsTfliteUriUndefined: Self = StObject.set(x, "gcsTfliteUri", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
