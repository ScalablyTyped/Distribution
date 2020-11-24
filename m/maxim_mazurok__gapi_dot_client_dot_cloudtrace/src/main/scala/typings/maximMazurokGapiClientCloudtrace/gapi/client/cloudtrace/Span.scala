package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Span extends js.Object {
  
  /** A set of attributes on the span. You can have up to 32 attributes per span. */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /** Optional. The number of child spans that were generated while this span was active. If set, allows implementation to detect missing child spans. */
  var childSpanCount: js.UndefOr[Double] = js.native
  
  /**
    * Required. A description of the span's operation (up to 128 bytes). Trace displays the description in the Google Cloud Platform Console. For example, the display name can be a
    * qualified method name or a file name and a line number where the operation is called. A best practice is to use the same display name within an application and at the same call
    * point. This makes it easier to correlate spans in different traces.
    */
  var displayName: js.UndefOr[TruncatableString] = js.native
  
  /**
    * Required. The end time of the span. On the client side, this is the time kept by the local machine where the span execution ends. On the server side, this is the time when the
    * server application handler stops running.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /** Links associated with the span. You can have up to 128 links per Span. */
  var links: js.UndefOr[Links] = js.native
  
  /**
    * Required. The resource name of the span in the following format: projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a trace within a project; it is a
    * 32-character hexadecimal encoding of a 16-byte array. [SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character hexadecimal encoding of an 8-byte array. It
    * should not be zero.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The [SPAN_ID] of this span's parent span. If this is a root span, then this field must be empty. */
  var parentSpanId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Set this parameter to indicate whether this span is in the same process as its parent. If you do not set this parameter, Trace is unable to take advantage of this helpful
    * information.
    */
  var sameProcessAsParentSpan: js.UndefOr[Boolean] = js.native
  
  /** Required. The [SPAN_ID] portion of the span's resource name. */
  var spanId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Distinguishes between spans generated in a particular context. For example, two spans with the same name may be distinguished using `CLIENT` (caller) and `SERVER` (callee)
    * to identify an RPC call.
    */
  var spanKind: js.UndefOr[String] = js.native
  
  /** Stack trace captured at the start of the span. */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  
  /**
    * Required. The start time of the span. On the client side, this is the time kept by the local machine where the span execution starts. On the server side, this is the time when the
    * server's application handler starts running.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /** Optional. The final status for this span. */
  var status: js.UndefOr[Status] = js.native
  
  /** A set of time events. You can have up to 32 annotations and 128 message events per span. */
  var timeEvents: js.UndefOr[TimeEvents] = js.native
}
object Span {
  
  @scala.inline
  def apply(): Span = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Span]
  }
  
  @scala.inline
  implicit class SpanOps[Self <: Span] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setChildSpanCount(value: Double): Self = this.set("childSpanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildSpanCount: Self = this.set("childSpanCount", js.undefined)
    
    @scala.inline
    def setDisplayName(value: TruncatableString): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setLinks(value: Links): Self = this.set("links", value.asInstanceOf[js.Any])
    
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
    def setSpanKind(value: String): Self = this.set("spanKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanKind: Self = this.set("spanKind", js.undefined)
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTimeEvents(value: TimeEvents): Self = this.set("timeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeEvents: Self = this.set("timeEvents", js.undefined)
  }
}
