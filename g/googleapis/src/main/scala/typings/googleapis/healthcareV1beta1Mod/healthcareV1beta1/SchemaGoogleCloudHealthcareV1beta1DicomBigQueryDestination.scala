package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The BigQuery table where the output should be written.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination extends js.Object {
  /**
    * If the destination table already exists and this flag is `TRUE`, the
    * table will be overwritten by the contents of the DICOM store. If the flag
    * is not set and the destination table already exists, the export call
    * returns an error.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * BigQuery URI to a table, up to 2000 characters long, in the format
    * `bq://projectId.bqDatasetId.tableId`
    */
  var tableUri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, tableUri: String = null): SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (tableUri != null) __obj.updateDynamic("tableUri")(tableUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1beta1DicomBigQueryDestination]
  }
}

