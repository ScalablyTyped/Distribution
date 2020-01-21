package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to import resources.
  */
@js.native
trait SchemaImportResourcesRequest extends js.Object {
  /**
    * The content structure in the source location. The default is BUNDLE.
    */
  var contentStructure: js.UndefOr[String] = js.native
  /**
    * Cloud Storage source data location and import configuration.  The Cloud
    * Storage location requires the `roles/storage.objectViewer` Cloud IAM
    * role.  Each Cloud Storage object should be a text file that contains
    * newline delimited JSON structures conforming to FHIR standard.  To
    * improve performance, use multiple Cloud Storage objects where each object
    * contains a subset of all of the newline-delimited JSON structures. You
    * can select all of the objects using the uri as the prefix. The maximum
    * number of objects is 1,000.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource] = js.native
}

object SchemaImportResourcesRequest {
  @scala.inline
  def apply(
    contentStructure: String = null,
    gcsSource: SchemaGoogleCloudHealthcareV1beta1FhirRestGcsSource = null
  ): SchemaImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (contentStructure != null) __obj.updateDynamic("contentStructure")(contentStructure.asInstanceOf[js.Any])
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportResourcesRequest]
  }
}

