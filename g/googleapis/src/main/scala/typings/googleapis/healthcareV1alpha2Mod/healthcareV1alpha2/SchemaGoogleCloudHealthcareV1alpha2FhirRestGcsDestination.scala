package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for exporting to Cloud Storage.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination extends js.Object {
  /**
    * URI for a Cloud Storage directory where result files should be written
    * (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If there is
    * no trailing slash, the service will append one when composing the object
    * path. The user is responsible for creating the Cloud Storage bucket
    * referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination {
  @scala.inline
  def apply(uriPrefix: String = null): SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination = {
    val __obj = js.Dynamic.literal()
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination]
  }
}

