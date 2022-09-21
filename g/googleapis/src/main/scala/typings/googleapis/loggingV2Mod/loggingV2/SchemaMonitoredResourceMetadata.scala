package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonitoredResourceMetadata extends StObject {
  
  /**
    * Output only. Values for predefined system metadata labels. System labels are a kind of metadata extracted by Google, including "machine_image", "vpc", "subnet_id", "security_group", "name", etc. System label values can be only strings, Boolean values, or a list of strings. For example: { "name": "my-test-instance", "security_group": ["a", "b", "c"], "spot_instance": false \}
    */
  var systemLabels: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Output only. A map of user-defined metadata labels.
    */
  var userLabels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaMonitoredResourceMetadata {
  
  inline def apply(): SchemaMonitoredResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoredResourceMetadata]
  }
  
  extension [Self <: SchemaMonitoredResourceMetadata](x: Self) {
    
    inline def setSystemLabels(value: StringDictionary[Any]): Self = StObject.set(x, "systemLabels", value.asInstanceOf[js.Any])
    
    inline def setSystemLabelsNull: Self = StObject.set(x, "systemLabels", null)
    
    inline def setSystemLabelsUndefined: Self = StObject.set(x, "systemLabels", js.undefined)
    
    inline def setUserLabels(value: StringDictionary[String]): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsNull: Self = StObject.set(x, "userLabels", null)
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
