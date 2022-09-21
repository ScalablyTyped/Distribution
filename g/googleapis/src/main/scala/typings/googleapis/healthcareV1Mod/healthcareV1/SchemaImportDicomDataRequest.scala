package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportDicomDataRequest extends StObject {
  
  /**
    * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage location.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1DicomGcsSource] = js.undefined
}
object SchemaImportDicomDataRequest {
  
  inline def apply(): SchemaImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataRequest]
  }
  
  extension [Self <: SchemaImportDicomDataRequest](x: Self) {
    
    inline def setGcsSource(value: SchemaGoogleCloudHealthcareV1DicomGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
