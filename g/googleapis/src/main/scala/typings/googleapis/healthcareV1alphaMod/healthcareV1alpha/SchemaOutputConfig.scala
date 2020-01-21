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
  def apply(bigQueryDestination: SchemaBigQueryDestination = null, gcsDestination: SchemaGcsDestination = null): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    if (bigQueryDestination != null) __obj.updateDynamic("bigQueryDestination")(bigQueryDestination.asInstanceOf[js.Any])
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOutputConfig]
  }
}

