package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2EntityExtractionParams extends StObject {
  
  /**
    * Whether to enable entity extraction.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Model version of the entity extraction. Default is "builtin/stable". Specify "builtin/latest" for the latest model.
    */
  var modelVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2EntityExtractionParams {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2EntityExtractionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2EntityExtractionParams]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2EntityExtractionParams](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionNull: Self = StObject.set(x, "modelVersion", null)
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "modelVersion", js.undefined)
  }
}
