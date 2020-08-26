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
  def apply(): SchemaBigQueryLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryLocation]
  }
  @scala.inline
  implicit class SchemaBigQueryLocationOps[Self <: SchemaBigQueryLocation] (val x: Self) extends AnyVal {
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
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setSchemaConfig(value: SchemaSchemaConfig): Self = this.set("schemaConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaConfig: Self = this.set("schemaConfig", js.undefined)
  }
  
}

