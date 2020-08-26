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
  def apply(): SchemaBatchWriteSpansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchWriteSpansRequest]
  }
  @scala.inline
  implicit class SchemaBatchWriteSpansRequestOps[Self <: SchemaBatchWriteSpansRequest] (val x: Self) extends AnyVal {
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
    def setSpansVarargs(value: SchemaSpan*): Self = this.set("spans", js.Array(value :_*))
    @scala.inline
    def setSpans(value: js.Array[SchemaSpan]): Self = this.set("spans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpans: Self = this.set("spans", js.undefined)
  }
  
}

