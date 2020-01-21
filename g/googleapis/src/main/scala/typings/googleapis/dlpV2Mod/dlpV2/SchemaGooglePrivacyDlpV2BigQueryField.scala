package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining a field of a BigQuery table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BigQueryField extends js.Object {
  /**
    * Designated field in the BigQuery table.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * Source table of the field.
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2BigQueryField {
  @scala.inline
  def apply(field: SchemaGooglePrivacyDlpV2FieldId = null, table: SchemaGooglePrivacyDlpV2BigQueryTable = null): SchemaGooglePrivacyDlpV2BigQueryField = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryField]
  }
}

