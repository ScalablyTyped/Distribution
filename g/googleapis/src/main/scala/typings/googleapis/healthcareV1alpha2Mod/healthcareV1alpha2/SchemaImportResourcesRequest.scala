package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

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
    * The Cloud Storage destination to write the error report to.  The Cloud
    * Storage location requires the `roles/storage.objectAdmin` Cloud IAM role.
    * Note that writing a file to the same destination multiple times will
    * result in the previous version of the file being overwritten.
    */
  var gcsErrorDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination] = js.native
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
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsSource] = js.native
}

object SchemaImportResourcesRequest {
  @scala.inline
  def apply(
    contentStructure: String = null,
    gcsErrorDestination: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination = null,
    gcsSource: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsSource = null
  ): SchemaImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (contentStructure != null) __obj.updateDynamic("contentStructure")(contentStructure.asInstanceOf[js.Any])
    if (gcsErrorDestination != null) __obj.updateDynamic("gcsErrorDestination")(gcsErrorDestination.asInstanceOf[js.Any])
    if (gcsSource != null) __obj.updateDynamic("gcsSource")(gcsSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportResourcesRequest]
  }
}

