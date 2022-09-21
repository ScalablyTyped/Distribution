package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryInstantRequest extends StObject {
  
  /**
    * A PromQL query string. Query lanauge documentation: https://prometheus.io/docs/prometheus/latest/querying/basics/.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The single point in time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted timestamp.
    */
  var time: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An upper bound timeout for the query. Either a Prometheus duration string (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating point seconds. This non-standard encoding must be used for compatibility with the open source API. Clients may still implement timeouts at the connection level while ignoring this field.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryInstantRequest {
  
  inline def apply(): SchemaQueryInstantRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInstantRequest]
  }
  
  extension [Self <: SchemaQueryInstantRequest](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
