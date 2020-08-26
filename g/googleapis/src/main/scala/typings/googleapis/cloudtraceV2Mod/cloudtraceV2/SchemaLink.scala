package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pointer from the current span to another span in the same trace or in a
  * different trace. For example, this can be used in batching operations,
  * where a single batch handler processes multiple requests from different
  * traces or when the handler receives a request from a different project.
  */
@js.native
trait SchemaLink extends js.Object {
  /**
    * A set of attributes on the link. You have have up to  32 attributes per
    * link.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.native
  /**
    * The [SPAN_ID] for a span within a trace.
    */
  var spanId: js.UndefOr[String] = js.native
  /**
    * The [TRACE_ID] for a trace within a project.
    */
  var traceId: js.UndefOr[String] = js.native
  /**
    * The relationship of the current span relative to the linked span.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaLink {
  @scala.inline
  def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  @scala.inline
  implicit class SchemaLinkOps[Self <: SchemaLink] (val x: Self) extends AnyVal {
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
    def setSpanId(value: String): Self = this.set("spanId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpanId: Self = this.set("spanId", js.undefined)
    @scala.inline
    def setTraceId(value: String): Self = this.set("traceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceId: Self = this.set("traceId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

