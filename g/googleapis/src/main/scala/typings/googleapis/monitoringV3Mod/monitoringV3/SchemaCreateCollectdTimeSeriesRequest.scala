package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CreateCollectdTimeSeries request.
  */
@js.native
trait SchemaCreateCollectdTimeSeriesRequest extends js.Object {
  
  /**
    * The collectd payloads representing the time series data. You must not
    * include more than a single point for each time series, so no two payloads
    * can have the same values for all of the fields plugin, plugin_instance,
    * type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[SchemaCollectdPayload]] = js.native
  
  /**
    * The version of collectd that collected the data. Example:
    * &quot;5.3.0-192.el6&quot;.
    */
  var collectdVersion: js.UndefOr[String] = js.native
  
  /**
    * The monitored resource associated with the time series.
    */
  var resource: js.UndefOr[SchemaMonitoredResource] = js.native
}
object SchemaCreateCollectdTimeSeriesRequest {
  
  @scala.inline
  def apply(): SchemaCreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateCollectdTimeSeriesRequestOps[Self <: SchemaCreateCollectdTimeSeriesRequest] (val x: Self) extends AnyVal {
    
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
    def setCollectdPayloadsVarargs(value: SchemaCollectdPayload*): Self = this.set("collectdPayloads", js.Array(value :_*))
    
    @scala.inline
    def setCollectdPayloads(value: js.Array[SchemaCollectdPayload]): Self = this.set("collectdPayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectdPayloads: Self = this.set("collectdPayloads", js.undefined)
    
    @scala.inline
    def setCollectdVersion(value: String): Self = this.set("collectdVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectdVersion: Self = this.set("collectdVersion", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaMonitoredResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
