package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for exporting to BigQuery.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination extends js.Object {
  /**
    * BigQuery URI to a dataset, up to 2000 characters long, in the format
    * `bq://projectId.bqDatasetId`
    */
  var datasetUri: js.UndefOr[String] = js.native
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[SchemaSchemaConfig] = js.native
}

object SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination {
  @scala.inline
  def apply(): SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination]
  }
  @scala.inline
  implicit class SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestinationOps[Self <: SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination] (val x: Self) extends AnyVal {
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
    def setDatasetUri(value: String): Self = this.set("datasetUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetUri: Self = this.set("datasetUri", js.undefined)
    @scala.inline
    def setSchemaConfig(value: SchemaSchemaConfig): Self = this.set("schemaConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaConfig: Self = this.set("schemaConfig", js.undefined)
  }
  
}

