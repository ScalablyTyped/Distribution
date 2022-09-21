package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModelState extends StObject {
  
  /**
    * Indicates if this model has been published.
    */
  var published: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Indicates the latest validation error on the model if any. A model may have validation errors if there were problems during the model creation/update. e.g. in the case of a TfLiteModel, if a tflite model file was missing or in the wrong format. This field will be empty for valid models.
    */
  var validationError: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaModelState {
  
  inline def apply(): SchemaModelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModelState]
  }
  
  extension [Self <: SchemaModelState](x: Self) {
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedNull: Self = StObject.set(x, "published", null)
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setValidationError(value: SchemaStatus): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
  }
}
