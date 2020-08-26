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
  def apply(): SchemaSpreadsheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpreadsheetProperties]
  }
  @scala.inline
  implicit class SchemaSpreadsheetPropertiesOps[Self <: SchemaSpreadsheetProperties] (val x: Self) extends AnyVal {
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
    def setAutoRecalc(value: String): Self = this.set("autoRecalc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRecalc: Self = this.set("autoRecalc", js.undefined)
    @scala.inline
    def setDefaultFormat(value: SchemaCellFormat): Self = this.set("defaultFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFormat: Self = this.set("defaultFormat", js.undefined)
    @scala.inline
    def setIterativeCalculationSettings(value: SchemaIterativeCalculationSettings): Self = this.set("iterativeCalculationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterativeCalculationSettings: Self = this.set("iterativeCalculationSettings", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

