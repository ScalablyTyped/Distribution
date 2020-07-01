package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining BigQuery table and row identifiers.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BigQueryOptions extends js.Object {
  /**
    * References to fields excluded from scanning. This allows you to skip
    * inspection of entire columns which you know have no findings.
    */
  var excludedFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  /**
    * References to fields uniquely identifying rows within the table. Nested
    * fields in the format, like `person.birthdate.year`, are allowed.
    */
  var identifyingFields: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
  /**
    * Max number of rows to scan. If the table has more rows than this value,
    * the rest of the rows are omitted. If not set, or if set to 0, all rows
    * will be scanned. Only one of rows_limit and rows_limit_percent can be
    * specified. Cannot be used in conjunction with TimespanConfig.
    */
  var rowsLimit: js.UndefOr[String] = js.native
  /**
    * Max percentage of rows to scan. The rest are omitted. The number of rows
    * scanned is rounded down. Must be between 0 and 100, inclusively. Both 0
    * and 100 means no limit. Defaults to 0. Only one of rows_limit and
    * rows_limit_percent can be specified. Cannot be used in conjunction with
    * TimespanConfig.
    */
  var rowsLimitPercent: js.UndefOr[Double] = js.native
  var sampleMethod: js.UndefOr[String] = js.native
  /**
    * Complete BigQuery table reference.
    */
  var tableReference: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2BigQueryOptions {
  @scala.inline
  def apply(
    excludedFields: js.Array[SchemaGooglePrivacyDlpV2FieldId] = null,
    identifyingFields: js.Array[SchemaGooglePrivacyDlpV2FieldId] = null,
    rowsLimit: String = null,
    rowsLimitPercent: js.UndefOr[Double] = js.undefined,
    sampleMethod: String = null,
    tableReference: SchemaGooglePrivacyDlpV2BigQueryTable = null
  ): SchemaGooglePrivacyDlpV2BigQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (excludedFields != null) __obj.updateDynamic("excludedFields")(excludedFields.asInstanceOf[js.Any])
    if (identifyingFields != null) __obj.updateDynamic("identifyingFields")(identifyingFields.asInstanceOf[js.Any])
    if (rowsLimit != null) __obj.updateDynamic("rowsLimit")(rowsLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(rowsLimitPercent)) __obj.updateDynamic("rowsLimitPercent")(rowsLimitPercent.get.asInstanceOf[js.Any])
    if (sampleMethod != null) __obj.updateDynamic("sampleMethod")(sampleMethod.asInstanceOf[js.Any])
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BigQueryOptions]
  }
}

