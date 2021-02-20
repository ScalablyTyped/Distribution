package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Google Cloud Storage location to which the output should be written.
  */
@js.native
trait SchemaGcsDestination extends StObject {
  
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
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * URI for a Google Cloud Storage directory to which result files should be
    * written (e.g., `gs://bucket-id/path/to/destination/dir`). If there is no
    * trailing slash, the service will append one when composing the object
    * path. The user is responsible for creating the Google Cloud Storage
    * bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}
object SchemaGcsDestination {
  
  @scala.inline
  def apply(): SchemaGcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsDestination]
  }
  
  @scala.inline
  implicit class SchemaGcsDestinationMutableBuilder[Self <: SchemaGcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setUriPrefix(value: String): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
