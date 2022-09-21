package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ZoneDiscoverySpec extends StObject {
  
  /**
    * Optional. Configuration for CSV data.
    */
  var csvOptions: js.UndefOr[SchemaGoogleCloudDataplexV1ZoneDiscoverySpecCsvOptions] = js.undefined
  
  /**
    * Required. Whether discovery is enabled.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The list of patterns to apply for selecting data to exclude during discovery. For Cloud Storage bucket assets, these are interpreted as glob patterns used to match object names. For BigQuery dataset assets, these are interpreted as patterns to match table names.
    */
  var excludePatterns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The list of patterns to apply for selecting data to include during discovery if only a subset of the data should considered. For Cloud Storage bucket assets, these are interpreted as glob patterns used to match object names. For BigQuery dataset assets, these are interpreted as patterns to match table names.
    */
  var includePatterns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Configuration for Json data.
    */
  var jsonOptions: js.UndefOr[SchemaGoogleCloudDataplexV1ZoneDiscoverySpecJsonOptions] = js.undefined
  
  /**
    * Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running discovery periodically. Successive discovery runs must be scheduled at least 60 minutes apart. The default value is to run discovery every 60 minutes. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: "CRON_TZ=${IANA_TIME_ZONE\}" or TZ=${IANA_TIME_ZONE\}". The ${IANA_TIME_ZONE\} may only be a valid string from IANA time zone database. For example, "CRON_TZ=America/New_York 1 * * * *", or "TZ=America/New_York 1 * * * *".
    */
  var schedule: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ZoneDiscoverySpec {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ZoneDiscoverySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ZoneDiscoverySpec]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ZoneDiscoverySpec](x: Self) {
    
    inline def setCsvOptions(value: SchemaGoogleCloudDataplexV1ZoneDiscoverySpecCsvOptions): Self = StObject.set(x, "csvOptions", value.asInstanceOf[js.Any])
    
    inline def setCsvOptionsUndefined: Self = StObject.set(x, "csvOptions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExcludePatterns(value: js.Array[String]): Self = StObject.set(x, "excludePatterns", value.asInstanceOf[js.Any])
    
    inline def setExcludePatternsNull: Self = StObject.set(x, "excludePatterns", null)
    
    inline def setExcludePatternsUndefined: Self = StObject.set(x, "excludePatterns", js.undefined)
    
    inline def setExcludePatternsVarargs(value: String*): Self = StObject.set(x, "excludePatterns", js.Array(value*))
    
    inline def setIncludePatterns(value: js.Array[String]): Self = StObject.set(x, "includePatterns", value.asInstanceOf[js.Any])
    
    inline def setIncludePatternsNull: Self = StObject.set(x, "includePatterns", null)
    
    inline def setIncludePatternsUndefined: Self = StObject.set(x, "includePatterns", js.undefined)
    
    inline def setIncludePatternsVarargs(value: String*): Self = StObject.set(x, "includePatterns", js.Array(value*))
    
    inline def setJsonOptions(value: SchemaGoogleCloudDataplexV1ZoneDiscoverySpecJsonOptions): Self = StObject.set(x, "jsonOptions", value.asInstanceOf[js.Any])
    
    inline def setJsonOptionsUndefined: Self = StObject.set(x, "jsonOptions", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
