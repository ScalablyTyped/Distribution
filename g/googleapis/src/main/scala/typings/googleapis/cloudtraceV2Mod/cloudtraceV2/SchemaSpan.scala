package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpan extends StObject {
  
  /**
    * A set of attributes on the span. You can have up to 32 attributes per span.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.undefined
  
  /**
    * Optional. The number of child spans that were generated while this span was active. If set, allows implementation to detect missing child spans.
    */
  var childSpanCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. A description of the span's operation (up to 128 bytes). Cloud Trace displays the description in the Cloud console. For example, the display name can be a qualified method name or a file name and a line number where the operation is called. A best practice is to use the same display name within an application and at the same call point. This makes it easier to correlate spans in different traces.
    */
  var displayName: js.UndefOr[SchemaTruncatableString] = js.undefined
  
  /**
    * Required. The end time of the span. On the client side, this is the time kept by the local machine where the span execution ends. On the server side, this is the time when the server application handler stops running.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Links associated with the span. You can have up to 128 links per Span.
    */
  var links: js.UndefOr[SchemaLinks] = js.undefined
  
  /**
    * Required. The resource name of the span in the following format: * `projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]` `[TRACE_ID]` is a unique identifier for a trace within a project; it is a 32-character hexadecimal encoding of a 16-byte array. It should not be zero. `[SPAN_ID]` is a unique identifier for a span within a trace; it is a 16-character hexadecimal encoding of an 8-byte array. It should not be zero. .
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `[SPAN_ID]` of this span's parent span. If this is a root span, then this field must be empty.
    */
  var parentSpanId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Set this parameter to indicate whether this span is in the same process as its parent. If you do not set this parameter, Trace is unable to take advantage of this helpful information.
    */
  var sameProcessAsParentSpan: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The `[SPAN_ID]` portion of the span's resource name.
    */
  var spanId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Distinguishes between spans generated in a particular context. For example, two spans with the same name may be distinguished using `CLIENT` (caller) and `SERVER` (callee) to identify an RPC call.
    */
  var spanKind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Stack trace captured at the start of the span.
    */
  var stackTrace: js.UndefOr[SchemaStackTrace] = js.undefined
  
  /**
    * Required. The start time of the span. On the client side, this is the time kept by the local machine where the span execution starts. On the server side, this is the time when the server's application handler starts running.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The final status for this span.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * A set of time events. You can have up to 32 annotations and 128 message events per span.
    */
  var timeEvents: js.UndefOr[SchemaTimeEvents] = js.undefined
}
object SchemaSpan {
  
  inline def apply(): SchemaSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpan]
  }
  
  extension [Self <: SchemaSpan](x: Self) {
    
    inline def setAttributes(value: SchemaAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setChildSpanCount(value: Double): Self = StObject.set(x, "childSpanCount", value.asInstanceOf[js.Any])
    
    inline def setChildSpanCountNull: Self = StObject.set(x, "childSpanCount", null)
    
    inline def setChildSpanCountUndefined: Self = StObject.set(x, "childSpanCount", js.undefined)
    
    inline def setDisplayName(value: SchemaTruncatableString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLinks(value: SchemaLinks): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
    
    inline def setParentSpanIdNull: Self = StObject.set(x, "parentSpanId", null)
    
    inline def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
    
    inline def setSameProcessAsParentSpan(value: Boolean): Self = StObject.set(x, "sameProcessAsParentSpan", value.asInstanceOf[js.Any])
    
    inline def setSameProcessAsParentSpanNull: Self = StObject.set(x, "sameProcessAsParentSpan", null)
    
    inline def setSameProcessAsParentSpanUndefined: Self = StObject.set(x, "sameProcessAsParentSpan", js.undefined)
    
    inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    inline def setSpanIdNull: Self = StObject.set(x, "spanId", null)
    
    inline def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
    
    inline def setSpanKind(value: String): Self = StObject.set(x, "spanKind", value.asInstanceOf[js.Any])
    
    inline def setSpanKindNull: Self = StObject.set(x, "spanKind", null)
    
    inline def setSpanKindUndefined: Self = StObject.set(x, "spanKind", js.undefined)
    
    inline def setStackTrace(value: SchemaStackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeEvents(value: SchemaTimeEvents): Self = StObject.set(x, "timeEvents", value.asInstanceOf[js.Any])
    
    inline def setTimeEventsUndefined: Self = StObject.set(x, "timeEvents", js.undefined)
  }
}
