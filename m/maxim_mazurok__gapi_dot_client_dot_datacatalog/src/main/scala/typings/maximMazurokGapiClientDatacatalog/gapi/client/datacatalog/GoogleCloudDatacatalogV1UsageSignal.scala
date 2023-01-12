package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1UsageSignal extends StObject {
  
  /** The end timestamp of the duration of usage statistics. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Usage statistics over each of the predefined time ranges. Supported time ranges are `{"24H", "7D", "30D"}`. */
  var usageWithinTimeRange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1UsageStats} */ js.Any
  ] = js.undefined
}
object GoogleCloudDatacatalogV1UsageSignal {
  
  inline def apply(): GoogleCloudDatacatalogV1UsageSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1UsageSignal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatacatalogV1UsageSignal] (val x: Self) extends AnyVal {
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUsageWithinTimeRange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1UsageStats} */ js.Any
    ): Self = StObject.set(x, "usageWithinTimeRange", value.asInstanceOf[js.Any])
    
    inline def setUsageWithinTimeRangeUndefined: Self = StObject.set(x, "usageWithinTimeRange", js.undefined)
  }
}
