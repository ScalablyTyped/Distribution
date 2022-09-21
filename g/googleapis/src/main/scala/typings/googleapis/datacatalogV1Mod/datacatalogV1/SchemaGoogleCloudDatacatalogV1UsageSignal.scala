package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1UsageSignal extends StObject {
  
  /**
    * The end timestamp of the duration of usage statistics.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Usage statistics over each of the predefined time ranges. Supported time ranges are `{"24H", "7D", "30D"\}`.
    */
  var usageWithinTimeRange: js.UndefOr[StringDictionary[SchemaGoogleCloudDatacatalogV1UsageStats] | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1UsageSignal {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1UsageSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1UsageSignal]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1UsageSignal](x: Self) {
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUsageWithinTimeRange(value: StringDictionary[SchemaGoogleCloudDatacatalogV1UsageStats]): Self = StObject.set(x, "usageWithinTimeRange", value.asInstanceOf[js.Any])
    
    inline def setUsageWithinTimeRangeNull: Self = StObject.set(x, "usageWithinTimeRange", null)
    
    inline def setUsageWithinTimeRangeUndefined: Self = StObject.set(x, "usageWithinTimeRange", js.undefined)
  }
}
