package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The BigQuery table to which the output should be written.
  */
@js.native
trait SchemaBigQueryDestination extends js.Object {
  /**
    * Required. The BigQuery dataset to which the DICOM store should be
    * exported. If this dataset does not exist, the export call returns an
    * error.
    */
  var dataset: js.UndefOr[String] = js.native
  /**
    * If the destination table already exists and this flag is `TRUE`, the
    * table will be overwritten by the contents of the DICOM store. If the flag
    * is not set and the destination table already exists, the export call
    * returns an error.
    */
  var overwriteTable: js.UndefOr[Boolean] = js.native
  /**
    * Required. The BigQuery table to which the DICOM store should be written.
    * If this table does not exist, a new table with the given name will be
    * created.
    */
  var table: js.UndefOr[String] = js.native
}

object SchemaBigQueryDestination {
  @scala.inline
  def apply(dataset: String = null, overwriteTable: js.UndefOr[Boolean] = js.undefined, table: String = null): SchemaBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteTable)) __obj.updateDynamic("overwriteTable")(overwriteTable.get.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBigQueryDestination]
  }
}

