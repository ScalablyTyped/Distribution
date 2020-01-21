package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of a spreadsheet.
  */
@js.native
trait SchemaSpreadsheetProperties extends js.Object {
  /**
    * The amount of time to wait before volatile functions are recalculated.
    */
  var autoRecalc: js.UndefOr[String] = js.native
  /**
    * The default format of all cells in the spreadsheet.
    * CellData.effectiveFormat will not be set if the cell&#39;s format is
    * equal to this default format. This field is read-only.
    */
  var defaultFormat: js.UndefOr[SchemaCellFormat] = js.native
  /**
    * Determines whether and how circular references are resolved with
    * iterative calculation.  Absence of this field means that circular
    * references will result in calculation errors.
    */
  var iterativeCalculationSettings: js.UndefOr[SchemaIterativeCalculationSettings] = js.native
  /**
    * The locale of the spreadsheet in one of the following formats:  * an ISO
    * 639-1 language code such as `en`  * an ISO 639-2 language code such as
    * `fil`, if no 639-1 code exists  * a combination of the ISO language code
    * and country code, such as `en_US`  Note: when updating this field, not
    * all locales/languages are supported.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The time zone of the spreadsheet, in CLDR format such as
    * `America/New_York`. If the time zone isn&#39;t recognized, this may be a
    * custom time zone such as `GMT-07:00`.
    */
  var timeZone: js.UndefOr[String] = js.native
  /**
    * The title of the spreadsheet.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaSpreadsheetProperties {
  @scala.inline
  def apply(
    autoRecalc: String = null,
    defaultFormat: SchemaCellFormat = null,
    iterativeCalculationSettings: SchemaIterativeCalculationSettings = null,
    locale: String = null,
    timeZone: String = null,
    title: String = null
  ): SchemaSpreadsheetProperties = {
    val __obj = js.Dynamic.literal()
    if (autoRecalc != null) __obj.updateDynamic("autoRecalc")(autoRecalc.asInstanceOf[js.Any])
    if (defaultFormat != null) __obj.updateDynamic("defaultFormat")(defaultFormat.asInstanceOf[js.Any])
    if (iterativeCalculationSettings != null) __obj.updateDynamic("iterativeCalculationSettings")(iterativeCalculationSettings.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpreadsheetProperties]
  }
}

