package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final response of exporting resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse extends js.Object {
  /**
    * The FHIR store name of the resources that have been exported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The total number of resources exported from the requested FHIR store.
    */
  var resourceCount: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse {
  @scala.inline
  def apply(name: String = null, resourceCount: String = null): SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceCount != null) __obj.updateDynamic("resourceCount")(resourceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alphaFhirRestExportResourcesResponse]
  }
}

