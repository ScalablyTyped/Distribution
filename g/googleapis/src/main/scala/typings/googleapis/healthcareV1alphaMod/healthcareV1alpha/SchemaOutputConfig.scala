package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the location(s) to which data should be exported.
  */
@js.native
trait SchemaOutputConfig extends js.Object {
  /**
    * BigQueryDestination requires two IAM roles: `roles/bigquery.dataEditor`
    * and `roles/bigquery.jobUser`.
    */
  var bigQueryDestination: js.UndefOr[SchemaBigQueryDestination] = js.native
  /**
    * GcsDestination requires `roles/storage.objectAdmin` Cloud IAM role. Note
    * that writing a file to the same destination multiple times will result in
    * the previous version of the file being overwritten.
    */
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.native
}

object SchemaOutputConfig {
  @scala.inline
  def apply(): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutputConfig]
  }
  @scala.inline
  implicit class SchemaOutputConfigOps[Self <: SchemaOutputConfig] (val x: Self) extends AnyVal {
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
    def setBigQueryDestination(value: SchemaBigQueryDestination): Self = this.set("bigQueryDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBigQueryDestination: Self = this.set("bigQueryDestination", js.undefined)
    @scala.inline
    def setGcsDestination(value: SchemaGcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
  
}

