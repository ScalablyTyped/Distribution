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
  def apply(datasetUri: String = null, schemaConfig: SchemaSchemaConfig = null): SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    if (datasetUri != null) __obj.updateDynamic("datasetUri")(datasetUri.asInstanceOf[js.Any])
    if (schemaConfig != null) __obj.updateDynamic("schemaConfig")(schemaConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1FhirBigQueryDestination]
  }
}

