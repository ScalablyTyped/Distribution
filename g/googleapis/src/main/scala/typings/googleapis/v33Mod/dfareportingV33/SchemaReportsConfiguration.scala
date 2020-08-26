package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reporting Configuration
  */
@js.native
trait SchemaReportsConfiguration extends js.Object {
  /**
    * Whether the exposure to conversion report is enabled. This report shows
    * detailed pathway information on up to 10 of the most recent ad exposures
    * seen by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Default lookback windows for new advertisers in this account.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  /**
    * Report generation time zone ID of this account. This is a required field
    * that can only be changed by a superuser. Acceptable values are:  -
    * &quot;1&quot; for &quot;America/New_York&quot;  - &quot;2&quot; for
    * &quot;Europe/London&quot;  - &quot;3&quot; for &quot;Europe/Paris&quot;
    * - &quot;4&quot; for &quot;Africa/Johannesburg&quot;  - &quot;5&quot; for
    * &quot;Asia/Jerusalem&quot;  - &quot;6&quot; for &quot;Asia/Shanghai&quot;
    * - &quot;7&quot; for &quot;Asia/Hong_Kong&quot;  - &quot;8&quot; for
    * &quot;Asia/Tokyo&quot;  - &quot;9&quot; for &quot;Australia/Sydney&quot;
    * - &quot;10&quot; for &quot;Asia/Dubai&quot;  - &quot;11&quot; for
    * &quot;America/Los_Angeles&quot;  - &quot;12&quot; for
    * &quot;Pacific/Auckland&quot;  - &quot;13&quot; for
    * &quot;America/Sao_Paulo&quot;
    */
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.native
}

object SchemaReportsConfiguration {
  @scala.inline
  def apply(): SchemaReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportsConfiguration]
  }
  @scala.inline
  implicit class SchemaReportsConfigurationOps[Self <: SchemaReportsConfiguration] (val x: Self) extends AnyVal {
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
    def setExposureToConversionEnabled(value: Boolean): Self = this.set("exposureToConversionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureToConversionEnabled: Self = this.set("exposureToConversionEnabled", js.undefined)
    @scala.inline
    def setLookbackConfiguration(value: SchemaLookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    @scala.inline
    def setReportGenerationTimeZoneId(value: String): Self = this.set("reportGenerationTimeZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportGenerationTimeZoneId: Self = this.set("reportGenerationTimeZoneId", js.undefined)
  }
  
}

