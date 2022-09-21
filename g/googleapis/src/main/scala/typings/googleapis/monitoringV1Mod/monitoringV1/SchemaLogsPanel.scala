package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogsPanel extends StObject {
  
  /**
    * A filter that chooses which log entries to return. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries). Only log entries that match the filter are returned. An empty filter matches all log entries.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The names of logging resources to collect logs for. Currently only projects are supported. If empty, the widget will default to the host project.
    */
  var resourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaLogsPanel {
  
  inline def apply(): SchemaLogsPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogsPanel]
  }
  
  extension [Self <: SchemaLogsPanel](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesNull: Self = StObject.set(x, "resourceNames", null)
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
  }
}
