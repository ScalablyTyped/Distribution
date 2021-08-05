package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Cloud Storage location where the output should be written, and the
  * export configuration.
  */
trait SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination extends StObject {
  
  /**
    * MIME types supported by DICOM spec. Each file will be written in the
    * following format:
    * `.../{study_id}/{series_id}/{instance_id}[/{frame_number}].{extension}`
    * The frame_number component will exist only for multi-frame instances.
    * Refer to the DICOM conformance statement for permissible MIME types:
    * https://cloud.google.com/healthcare/docs/dicom#wado-rs  The following
    * extensions will be used for output files:   application/dicom -&gt; .dcm
    * image/jpeg -&gt; .jpg   image/png -&gt; .png  If unspecified, the
    * instances will be exported in their original DICOM format.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The Cloud Storage destination to export to.  URI for a Cloud Storage
    * directory where result files should be written (in the format
    * `gs://{bucket-id}/{path/to/destination/dir}`). If there is no trailing
    * slash, the service will append one when composing the object path. The
    * user is responsible for creating the Cloud Storage bucket referenced in
    * `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1beta1DicomGcsDestination](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
