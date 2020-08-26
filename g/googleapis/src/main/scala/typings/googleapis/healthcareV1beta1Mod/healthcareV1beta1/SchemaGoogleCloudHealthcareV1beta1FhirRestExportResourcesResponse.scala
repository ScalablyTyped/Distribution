package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final response of exporting resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse extends js.Object {
  /**
    * The name of the FHIR store where resources have been exported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.native
  /**
    * The total number of resources exported from the requested FHIR store.
    */
  var resourceCount: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponseOps[Self <: SchemaGoogleCloudHealthcareV1beta1FhirRestExportResourcesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFhirStore(value: String): Self = this.set("fhirStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFhirStore: Self = this.set("fhirStore", js.undefined)
    @scala.inline
    def setResourceCount(value: String): Self = this.set("resourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceCount: Self = this.set("resourceCount", js.undefined)
  }
  
}

