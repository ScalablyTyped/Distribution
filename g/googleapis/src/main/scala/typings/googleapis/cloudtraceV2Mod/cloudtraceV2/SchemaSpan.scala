package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A span represents a single operation within a trace. Spans can be nested to
  * form a trace tree. Often, a trace contains a root span that describes the
  * end-to-end latency, and one or more subspans for its sub-operations. A
  * trace can also contain multiple root spans, or none at all. Spans do not
  * need to be contiguous&amp;mdash;there may be gaps or overlaps between spans
  * in a trace.
  */
trait SchemaSpan extends StObject {
  
  /**
    * A set of attributes on the span. You can have up to 32 attributes per
    * span.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.undefined
  
  /**
    * An optional number of child spans that were generated while this span was
    * active. If set, allows implementation to detect missing child spans.
    */
  var childSpanCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A description of the span&#39;s operation (up to 128 bytes). Stackdriver
    * Trace displays the description in the Google Cloud Platform Console. For
    * example, the display name can be a qualified method name or a file name
    * and a line number where the operation is called. A best practice is to
    * use the same display name within an application and at the same call
    * point. This makes it easier to correlate spans in different traces.
    */
  var displayName: js.UndefOr[SchemaTruncatableString] = js.undefined
  
  /**
    * The end time of the span. On the client side, this is the time kept by
    * the local machine where the span execution ends. On the server side, this
    * is the time when the server application handler stops running.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Links associated with the span. You can have up to 128 links per Span.
    */
  var links: js.UndefOr[SchemaLinks] = js.undefined
  
  /**
    * The resource name of the span in the following format:
    * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique
    * identifier for a trace within a project; it is a 32-character hexadecimal
    * encoding of a 16-byte array.  [SPAN_ID] is a unique identifier for a span
    * within a trace; it is a 16-character hexadecimal encoding of an 8-byte
    * array.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The [SPAN_ID] of this span&#39;s parent span. If this is a root span,
    * then this field must be empty.
    */
  var parentSpanId: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Set this parameter to indicate whether this span is in the
    * same process as its parent. If you do not set this parameter, Stackdriver
    * Trace is unable to take advantage of this helpful information.
    */
  var sameProcessAsParentSpan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The [SPAN_ID] portion of the span&#39;s resource name.
    */
  var spanId: js.UndefOr[String] = js.undefined
  
  /**
    * Stack trace captured at the start of the span.
    */
  var stackTrace: js.UndefOr[SchemaStackTrace] = js.undefined
  
  /**
    * The start time of the span. On the client side, this is the time kept by
    * the local machine where the span execution starts. On the server side,
    * this is the time when the server&#39;s application handler starts
    * running.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * An optional final status for this span.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * A set of time events. You can have up to 32 annotations and 128 message
    * events per span.
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
    
    inline def setChildSpanCountUndefined: Self = StObject.set(x, "childSpanCount", js.undefined)
    
    inline def setDisplayName(value: SchemaTruncatableString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLinks(value: SchemaLinks): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
    
    inline def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
    
    inline def setSameProcessAsParentSpan(value: Boolean): Self = StObject.set(x, "sameProcessAsParentSpan", value.asInstanceOf[js.Any])
    
    inline def setSameProcessAsParentSpanUndefined: Self = StObject.set(x, "sameProcessAsParentSpan", js.undefined)
    
    inline def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    inline def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
    
    inline def setStackTrace(value: SchemaStackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeEvents(value: SchemaTimeEvents): Self = StObject.set(x, "timeEvents", value.asInstanceOf[js.Any])
    
    inline def setTimeEventsUndefined: Self = StObject.set(x, "timeEvents", js.undefined)
  }
}
