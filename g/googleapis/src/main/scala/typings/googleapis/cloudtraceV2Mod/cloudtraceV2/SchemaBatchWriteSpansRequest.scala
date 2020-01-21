package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for the `BatchWriteSpans` method.
  */
@js.native
trait SchemaBatchWriteSpansRequest extends js.Object {
  /**
    * A list of new spans. The span names must not match existing spans, or the
    * results are undefined.
    */
  var spans: js.UndefOr[js.Array[SchemaSpan]] = js.native
}

object SchemaBatchWriteSpansRequest {
  @scala.inline
  def apply(spans: js.Array[SchemaSpan] = null): SchemaBatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    if (spans != null) __obj.updateDynamic("spans")(spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchWriteSpansRequest]
  }
}

