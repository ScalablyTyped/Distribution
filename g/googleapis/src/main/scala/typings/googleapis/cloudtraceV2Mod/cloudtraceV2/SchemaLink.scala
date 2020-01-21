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
  def apply(
    attributes: SchemaAttributes = null,
    spanId: String = null,
    traceId: String = null,
    `type`: String = null
  ): SchemaLink = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (spanId != null) __obj.updateDynamic("spanId")(spanId.asInstanceOf[js.Any])
    if (traceId != null) __obj.updateDynamic("traceId")(traceId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLink]
  }
}

