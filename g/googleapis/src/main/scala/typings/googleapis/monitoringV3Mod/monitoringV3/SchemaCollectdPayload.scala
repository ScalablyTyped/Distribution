package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of data points sent from a collectd-based plugin. See the
  * collectd documentation for more information.
  */
@js.native
trait SchemaCollectdPayload extends js.Object {
  
  /**
    * The end time of the interval.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The measurement metadata. Example: &quot;process_id&quot; -&gt; 12345
    */
  var metadata: js.UndefOr[StringDictionary[SchemaTypedValue]] = js.native
  
  /**
    * The name of the plugin. Example: &quot;disk&quot;.
    */
  var plugin: js.UndefOr[String] = js.native
  
  /**
    * The instance name of the plugin Example: &quot;hdcl&quot;.
    */
  var pluginInstance: js.UndefOr[String] = js.native
  
  /**
    * The start time of the interval.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * The measurement type. Example: &quot;memory&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The measurement type instance. Example: &quot;used&quot;.
    */
  var typeInstance: js.UndefOr[String] = js.native
  
  /**
    * The measured values during this time interval. Each value must have a
    * different dataSourceName.
    */
  var values: js.UndefOr[js.Array[SchemaCollectdValue]] = js.native
}
object SchemaCollectdPayload {
  
  @scala.inline
  def apply(): SchemaCollectdPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdPayload]
  }
  
  @scala.inline
  implicit class SchemaCollectdPayloadOps[Self <: SchemaCollectdPayload] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[SchemaTypedValue]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setPluginInstance(value: String): Self = this.set("pluginInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginInstance: Self = this.set("pluginInstance", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeInstance(value: String): Self = this.set("typeInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeInstance: Self = this.set("typeInstance", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaCollectdValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[SchemaCollectdValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
