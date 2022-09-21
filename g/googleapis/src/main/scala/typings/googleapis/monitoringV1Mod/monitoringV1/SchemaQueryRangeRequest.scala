package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryRangeRequest extends StObject {
  
  /**
    * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted timestamp.
    */
  var end: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A PromQL query string. Query lanauge documentation: https://prometheus.io/docs/prometheus/latest/querying/basics/.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted timestamp.
    */
  var start: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resolution of query result. Either a Prometheus duration string (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating point seconds. This non-standard encoding must be used for compatibility with the open source API. Clients may still implement timeouts at the connection level while ignoring this field.
    */
  var step: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An upper bound timeout for the query. Either a Prometheus duration string (https://prometheus.io/docs/prometheus/latest/querying/basics/#time-durations) or floating point seconds. This non-standard encoding must be used for compatibility with the open source API. Clients may still implement timeouts at the connection level while ignoring this field.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryRangeRequest {
  
  inline def apply(): SchemaQueryRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryRangeRequest]
  }
  
  extension [Self <: SchemaQueryRangeRequest](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
