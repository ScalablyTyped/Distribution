package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BigQuery dataset location.
  */
@js.native
trait SchemaBigQueryLocation extends js.Object {
  /**
    * ID of the dataset that houses the BigQuery tables.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * ID of the project that owns the BigQuery datasets.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The configuration for the exported BigQuery schema.
    */
  var schemaConfig: js.UndefOr[SchemaSchemaConfig] = js.native
}

object SchemaBigQueryLocation {
  @scala.inline
  def apply(datasetId: String = null, projectId: String = null, schemaConfig: SchemaSchemaConfig = null): SchemaBigQueryLocation = {
    val __obj = js.Dynamic.literal()
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (schemaConfig != null) __obj.updateDynamic("schemaConfig")(schemaConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBigQueryLocation]
  }
}

