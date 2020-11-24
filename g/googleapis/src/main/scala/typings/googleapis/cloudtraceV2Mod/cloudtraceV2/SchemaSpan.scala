package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A span represents a single operation within a trace. Spans can be nested to
  * form a trace tree. Often, a trace contains a root span that describes the
  * end-to-end latency, and one or more subspans for its sub-operations. A
  * trace can also contain multiple root spans, or none at all. Spans do not
  * need to be contiguous&amp;mdash;there may be gaps or overlaps between spans
  * in a trace.
  */
@js.native
trait SchemaSpan extends js.Object {
  
  /**
    * A set of attributes on the span. You can have up to 32 attributes per
    * span.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.native
  
  /**
    * An optional number of child spans that were generated while this span was
    * active. If set, allows implementation to detect missing child spans.
    */
  var childSpanCount: js.UndefOr[Double] = js.native
  
  /**
    * A description of the span&#39;s operation (up to 128 bytes). Stackdriver
    * Trace displays the description in the Google Cloud Platform Console. For
    * example, the display name can be a qualified method name or a file name
    * and a line number where the operation is called. A best practice is to
    * use the same display name within an application and at the same call
    * point. This makes it easier to correlate spans in different traces.
    */
  var displayName: js.UndefOr[SchemaTruncatableString] = js.native
  
  /**
    * The end time of the span. On the client side, this is the time kept by
    * the local machine where the span execution ends. On the server side, this
    * is the time when the server application handler stops running.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Links associated with the span. You can have up to 128 links per Span.
    */
  var links: js.UndefOr[SchemaLinks] = js.native
  
  /**
    * The resource name of the span in the following format:
    * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique
    * identifier for a trace within a project; it is a 32-character hexadecimal
    * encoding of a 16-byte array.  [SPAN_ID] is a unique identifier for a span
    * within a trace; it is a 16-character hexadecimal encoding of an 8-byte
    * array.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The [SPAN_ID] of this span&#39;s parent span. If this is a root span,
    * then this field must be empty.
    */
  var parentSpanId: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Set this parameter to indicate whether this span is in the
    * same process as its parent. If you do not set this parameter, Stackdriver
    * Trace is unable to take advantage of this helpful information.
    */
  var sameProcessAsParentSpan: js.UndefOr[Boolean] = js.native
  
  /**
    * The [SPAN_ID] portion of the span&#39;s resource name.
    */
  var spanId: js.UndefOr[String] = js.native
  
  /**
    * Stack trace captured at the start of the span.
    */
  var stackTrace: js.UndefOr[SchemaStackTrace] = js.native
  
  /**
    * The start time of the span. On the client side, this is the time kept by
    * the local machine where the span execution starts. On the server side,
    * this is the time when the server&#39;s application handler starts
    * running.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * An optional final status for this span.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * A set of time events. You can have up to 32 annotations and 128 message
    * events per span.
    */
  var timeEvents: js.UndefOr[SchemaTimeEvents] = js.native
}
object SchemaSpan {
  
  @scala.inline
  def apply(): SchemaSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpan]
  }
  
  @scala.inline
  implicit class SchemaSpanOps[Self <: SchemaSpan] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: SchemaAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setChildSpanCount(value: Double): Self = this.set("childSpanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildSpanCount: Self = this.set("childSpanCount", js.undefined)
    
    @scala.inline
    def setDisplayName(value: SchemaTruncatableString): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setLinks(value: SchemaLinks): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentSpanId(value: String): Self = this.set("parentSpanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSpanId: Self = this.set("parentSpanId", js.undefined)
    
    @scala.inline
    def setSameProcessAsParentSpan(value: Boolean): Self = this.set("sameProcessAsParentSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameProcessAsParentSpan: Self = this.set("sameProcessAsParentSpan", js.undefined)
    
    @scala.inline
    def setSpanId(value: String): Self = this.set("spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanId: Self = this.set("spanId", js.undefined)
    
    @scala.inline
    def setStackTrace(value: SchemaStackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeEvents(value: SchemaTimeEvents): Self = this.set("timeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeEvents: Self = this.set("timeEvents", js.undefined)
  }
}
