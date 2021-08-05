package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CreateCollectdTimeSeries request.
  */
trait SchemaCreateCollectdTimeSeriesRequest extends StObject {
  
  /**
    * The collectd payloads representing the time series data. You must not
    * include more than a single point for each time series, so no two payloads
    * can have the same values for all of the fields plugin, plugin_instance,
    * type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[SchemaCollectdPayload]] = js.undefined
  
  /**
    * The version of collectd that collected the data. Example:
    * &quot;5.3.0-192.el6&quot;.
    */
  var collectdVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The monitored resource associated with the time series.
    */
  var resource: js.UndefOr[SchemaMonitoredResource] = js.undefined
}
object SchemaCreateCollectdTimeSeriesRequest {
  
  inline def apply(): SchemaCreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesRequest]
  }
  
  extension [Self <: SchemaCreateCollectdTimeSeriesRequest](x: Self) {
    
    inline def setCollectdPayloads(value: js.Array[SchemaCollectdPayload]): Self = StObject.set(x, "collectdPayloads", value.asInstanceOf[js.Any])
    
    inline def setCollectdPayloadsUndefined: Self = StObject.set(x, "collectdPayloads", js.undefined)
    
    inline def setCollectdPayloadsVarargs(value: SchemaCollectdPayload*): Self = StObject.set(x, "collectdPayloads", js.Array(value :_*))
    
    inline def setCollectdVersion(value: String): Self = StObject.set(x, "collectdVersion", value.asInstanceOf[js.Any])
    
    inline def setCollectdVersionUndefined: Self = StObject.set(x, "collectdVersion", js.undefined)
    
    inline def setResource(value: SchemaMonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
