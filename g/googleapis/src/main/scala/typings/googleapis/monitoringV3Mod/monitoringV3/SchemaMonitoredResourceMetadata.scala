package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Auxiliary metadata for a MonitoredResource object. MonitoredResource
  * objects contain the minimum set of information to uniquely identify a
  * monitored resource instance. There is some other useful auxiliary metadata.
  * Monitoring and Logging use an ingestion pipeline to extract metadata for
  * cloud resources of all types, and store the metadata in this message.
  */
trait SchemaMonitoredResourceMetadata extends StObject {
  
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
  var systemLabels: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Output only. A map of user-defined metadata labels.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaMonitoredResourceMetadata {
  
  inline def apply(): SchemaMonitoredResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoredResourceMetadata]
  }
  
  extension [Self <: SchemaMonitoredResourceMetadata](x: Self) {
    
    inline def setSystemLabels(value: StringDictionary[js.Any]): Self = StObject.set(x, "systemLabels", value.asInstanceOf[js.Any])
    
    inline def setSystemLabelsUndefined: Self = StObject.set(x, "systemLabels", js.undefined)
    
    inline def setUserLabels(value: StringDictionary[String]): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
