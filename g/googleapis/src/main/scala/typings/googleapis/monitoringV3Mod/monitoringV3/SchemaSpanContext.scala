package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The context of a span, attached to google.api.Distribution.Exemplars in
  * google.api.Distribution values during aggregation.It contains the name of a
  * span with format:  projects/PROJECT_ID/traces/TRACE_ID/spans/SPAN_ID
  */
@js.native
trait SchemaSpanContext extends js.Object {
  /**
    * The resource name of the span in the following format:
    * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID] TRACE_ID is a
    * unique identifier for a trace within a project; it is a 32-character
    * hexadecimal encoding of a 16-byte array.SPAN_ID is a unique identifier
    * for a span within a trace; it is a 16-character hexadecimal encoding of
    * an 8-byte array.
    */
  var spanName: js.UndefOr[String] = js.native
}

object SchemaSpanContext {
  @scala.inline
  def apply(spanName: String = null): SchemaSpanContext = {
    val __obj = js.Dynamic.literal()
    if (spanName != null) __obj.updateDynamic("spanName")(spanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpanContext]
  }
}

