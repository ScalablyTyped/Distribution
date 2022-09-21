package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoggingDestination extends StObject {
  
  /**
    * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs section. If the log name is not a domain scoped name, it will be automatically prefixed with the service name followed by "/".
    */
  var logs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The monitored resource type. The type must be defined in the Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String | Null] = js.undefined
}
object SchemaLoggingDestination {
  
  inline def apply(): SchemaLoggingDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingDestination]
  }
  
  extension [Self <: SchemaLoggingDestination](x: Self) {
    
    inline def setLogs(value: js.Array[String]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsNull: Self = StObject.set(x, "logs", null)
    
    inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    inline def setLogsVarargs(value: String*): Self = StObject.set(x, "logs", js.Array(value*))
    
    inline def setMonitoredResource(value: String): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceNull: Self = StObject.set(x, "monitoredResource", null)
    
    inline def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
  }
}
