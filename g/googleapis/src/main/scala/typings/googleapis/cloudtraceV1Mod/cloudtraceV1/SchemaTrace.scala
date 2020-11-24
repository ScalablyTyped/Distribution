package typings.googleapis.cloudtraceV1Mod.cloudtraceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A trace describes how long it takes for an application to perform an
  * operation. It consists of a set of spans, each of which represent a single
  * timed event within the operation.
  */
@js.native
trait SchemaTrace extends js.Object {
  
  /**
    * Project ID of the Cloud project where the trace data is stored.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Collection of spans in the trace.
    */
  var spans: js.UndefOr[js.Array[SchemaTraceSpan]] = js.native
  
  /**
    * Globally unique identifier for the trace. This identifier is a 128-bit
    * numeric value formatted as a 32-byte hex string. For example,
    * `382d4f4c6b7bb2f4a972559d9085001d`.
    */
  var traceId: js.UndefOr[String] = js.native
}
object SchemaTrace {
  
  @scala.inline
  def apply(): SchemaTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrace]
  }
  
  @scala.inline
  implicit class SchemaTraceOps[Self <: SchemaTrace] (val x: Self) extends AnyVal {
    
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSpansVarargs(value: SchemaTraceSpan*): Self = this.set("spans", js.Array(value :_*))
    
    @scala.inline
    def setSpans(value: js.Array[SchemaTraceSpan]): Self = this.set("spans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpans: Self = this.set("spans", js.undefined)
    
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceId: Self = this.set("traceId", js.undefined)
  }
}
