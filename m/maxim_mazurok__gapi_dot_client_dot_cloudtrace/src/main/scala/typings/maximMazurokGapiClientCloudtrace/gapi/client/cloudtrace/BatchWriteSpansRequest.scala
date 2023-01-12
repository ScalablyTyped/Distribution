package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteSpansRequest extends StObject {
  
  /** Required. A list of new spans. The span names must not match existing spans, otherwise the results are undefined. */
  var spans: js.UndefOr[js.Array[Span]] = js.undefined
}
object BatchWriteSpansRequest {
  
  inline def apply(): BatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteSpansRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchWriteSpansRequest] (val x: Self) extends AnyVal {
    
    inline def setSpans(value: js.Array[Span]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    inline def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
    
    inline def setSpansVarargs(value: Span*): Self = StObject.set(x, "spans", js.Array(value*))
  }
}
