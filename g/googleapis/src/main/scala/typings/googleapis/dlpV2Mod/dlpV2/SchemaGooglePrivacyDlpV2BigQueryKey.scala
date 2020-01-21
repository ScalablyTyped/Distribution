package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Row key for identifying a record in BigQuery table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BigQueryKey extends js.Object {
  /**
    * Absolute number of the row from the beginning of the table at the time of
    * scanning.
    */
  var rowNumber: js.UndefOr[String] = js.native
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2BigQueryKey {
  @scala.inline
  def apply(rowNumber: String = null, tableReference: SchemaGooglePrivacyDlpV2BigQueryTable = null): SchemaGooglePrivacyDlpV2BigQueryKey = {
    val __obj = js.Dynamic.literal()
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryKey]
  }
}

