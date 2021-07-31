package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reporting Configuration
  */
trait SchemaReportsConfiguration extends StObject {
  
  /**
    * Whether the exposure to conversion report is enabled. This report shows
    * detailed pathway information on up to 10 of the most recent ad exposures
    * seen by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default lookback windows for new advertisers in this account.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.undefined
  
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
  var reportGenerationTimeZoneId: js.UndefOr[String] = js.undefined
}
object SchemaReportsConfiguration {
  
  @scala.inline
  def apply(): SchemaReportsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportsConfiguration]
  }
  
  @scala.inline
  implicit class SchemaReportsConfigurationMutableBuilder[Self <: SchemaReportsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExposureToConversionEnabled(value: Boolean): Self = StObject.set(x, "exposureToConversionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureToConversionEnabledUndefined: Self = StObject.set(x, "exposureToConversionEnabled", js.undefined)
    
    @scala.inline
    def setLookbackConfiguration(value: SchemaLookbackConfiguration): Self = StObject.set(x, "lookbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookbackConfigurationUndefined: Self = StObject.set(x, "lookbackConfiguration", js.undefined)
    
    @scala.inline
    def setReportGenerationTimeZoneId(value: String): Self = StObject.set(x, "reportGenerationTimeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportGenerationTimeZoneIdUndefined: Self = StObject.set(x, "reportGenerationTimeZoneId", js.undefined)
  }
}
