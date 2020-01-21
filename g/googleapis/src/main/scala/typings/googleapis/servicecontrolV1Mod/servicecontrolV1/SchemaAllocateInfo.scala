package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAllocateInfo extends js.Object {
  /**
    * A list of label keys that were unused by the server in processing the
    * request. Thus, for similar requests repeated in a certain future time
    * window, the caller can choose to ignore these labels in the requests to
    * achieve better client-side cache hits and quota aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAllocateInfo {
  @scala.inline
  def apply(unusedArguments: js.Array[String] = null): SchemaAllocateInfo = {
    val __obj = js.Dynamic.literal()
    if (unusedArguments != null) __obj.updateDynamic("unusedArguments")(unusedArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAllocateInfo]
  }
}

