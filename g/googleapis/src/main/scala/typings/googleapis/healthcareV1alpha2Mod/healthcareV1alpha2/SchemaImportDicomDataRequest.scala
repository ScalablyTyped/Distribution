package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Imports data into the specified DICOM store. Returns an error if any of the
  * files to import are not DICOM files. This API will accept duplicate DICOM
  * instances, by simply ignoring the newly pushed instance (it will not
  * overwrite).
  */
trait SchemaImportDicomDataRequest extends StObject {
  
  /**
    * Cloud Storage source data location and import configuration.  The Cloud
    * Storage location requires the `roles/storage.objectViewer` Cloud IAM
    * role.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource] = js.undefined
}
object SchemaImportDicomDataRequest {
  
  @scala.inline
  def apply(): SchemaImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataRequest]
  }
  
  @scala.inline
  implicit class SchemaImportDicomDataRequestMutableBuilder[Self <: SchemaImportDicomDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsSource(value: SchemaGoogleCloudHealthcareV1alpha2DicomGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
