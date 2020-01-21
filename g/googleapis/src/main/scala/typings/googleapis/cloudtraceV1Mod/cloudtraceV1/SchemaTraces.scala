package typings.googleapis.cloudtraceV1Mod.cloudtraceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of new or updated traces.
  */
@js.native
trait SchemaTraces extends js.Object {
  /**
    * List of traces.
    */
  var traces: js.UndefOr[js.Array[SchemaTrace]] = js.native
}

object SchemaTraces {
  @scala.inline
  def apply(traces: js.Array[SchemaTrace] = null): SchemaTraces = {
    val __obj = js.Dynamic.literal()
    if (traces != null) __obj.updateDynamic("traces")(traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTraces]
  }
}

