package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportResourcesRequest extends StObject {
  
  /**
    * The content structure in the source location. If not specified, the server treats the input source files as BUNDLE.
    */
  var contentStructure: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage location. The Healthcare Service Agent Each Cloud Storage object should be a text file that contains the format specified in ContentStructure.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1FhirGcsSource] = js.undefined
}
object SchemaImportResourcesRequest {
  
  inline def apply(): SchemaImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportResourcesRequest]
  }
  
  extension [Self <: SchemaImportResourcesRequest](x: Self) {
    
    inline def setContentStructure(value: String): Self = StObject.set(x, "contentStructure", value.asInstanceOf[js.Any])
    
    inline def setContentStructureNull: Self = StObject.set(x, "contentStructure", null)
    
    inline def setContentStructureUndefined: Self = StObject.set(x, "contentStructure", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudHealthcareV1beta1FhirGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
