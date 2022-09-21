package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaTuneModelMetadata extends StObject {
  
  /**
    * The resource name of the model that this tune applies to. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaTuneModelMetadata {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaTuneModelMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaTuneModelMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaTuneModelMetadata](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
