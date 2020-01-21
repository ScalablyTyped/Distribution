package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An auxiliary table contains statistical information on the relative
  * frequency of different quasi-identifiers values. It has one or several
  * quasi-identifiers columns, and one column that indicates the relative
  * frequency of each quasi-identifier tuple. If a tuple is present in the data
  * but not in the auxiliary table, the corresponding relative frequency is
  * assumed to be zero (and thus, the tuple is highly reidentifiable).
  */
@js.native
trait SchemaGooglePrivacyDlpV2AuxiliaryTable extends js.Object {
  /**
    * Quasi-identifier columns. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2QuasiIdField]] = js.native
  /**
    * The relative frequency column must contain a floating-point number
    * between 0 and 1 (inclusive). Null values are assumed to be zero.
    * [required]
    */
  var relativeFrequency: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * Auxiliary table location. [required]
    */
  var table: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2AuxiliaryTable {
  @scala.inline
  def apply(
    quasiIds: js.Array[SchemaGooglePrivacyDlpV2QuasiIdField] = null,
    relativeFrequency: SchemaGooglePrivacyDlpV2FieldId = null,
    table: SchemaGooglePrivacyDlpV2BigQueryTable = null
  ): SchemaGooglePrivacyDlpV2AuxiliaryTable = {
    val __obj = js.Dynamic.literal()
    if (quasiIds != null) __obj.updateDynamic("quasiIds")(quasiIds.asInstanceOf[js.Any])
    if (relativeFrequency != null) __obj.updateDynamic("relativeFrequency")(relativeFrequency.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2AuxiliaryTable]
  }
}

