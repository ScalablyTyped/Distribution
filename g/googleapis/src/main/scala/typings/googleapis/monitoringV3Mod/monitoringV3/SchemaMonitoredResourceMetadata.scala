package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Auxiliary metadata for a MonitoredResource object. MonitoredResource
  * objects contain the minimum set of information to uniquely identify a
  * monitored resource instance. There is some other useful auxiliary metadata.
  * Monitoring and Logging use an ingestion pipeline to extract metadata for
  * cloud resources of all types, and store the metadata in this message.
  */
@js.native
trait SchemaMonitoredResourceMetadata extends js.Object {
  
  /**
    * Output only. Values for predefined system metadata labels. System labels
    * are a kind of metadata extracted by Google, including
    * &quot;machine_image&quot;, &quot;vpc&quot;, &quot;subnet_id&quot;,
    * &quot;security_group&quot;, &quot;name&quot;, etc. System label values
    * can be only strings, Boolean values, or a list of strings. For example: {
    * &quot;name&quot;: &quot;my-test-instance&quot;,
    * &quot;security_group&quot;: [&quot;a&quot;, &quot;b&quot;,
    * &quot;c&quot;],   &quot;spot_instance&quot;: false }
    */
  var systemLabels: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Output only. A map of user-defined metadata labels.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaMonitoredResourceMetadata {
  
  @scala.inline
  def apply(): SchemaMonitoredResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoredResourceMetadata]
  }
  
  @scala.inline
  implicit class SchemaMonitoredResourceMetadataOps[Self <: SchemaMonitoredResourceMetadata] (val x: Self) extends AnyVal {
    
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
    def setSystemLabels(value: StringDictionary[js.Any]): Self = this.set("systemLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemLabels: Self = this.set("systemLabels", js.undefined)
    
    @scala.inline
    def setUserLabels(value: StringDictionary[String]): Self = this.set("userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLabels: Self = this.set("userLabels", js.undefined)
  }
}
