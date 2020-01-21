package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Additional information returned to client, such as debugging
  * information.
  */
@js.native
trait SchemaResponseMetadata extends js.Object {
  /**
    * A unique id associated with this call. This id is logged for tracking
    * purposes.
    */
  var requestId: js.UndefOr[String] = js.native
}

object SchemaResponseMetadata {
  @scala.inline
  def apply(requestId: String = null): SchemaResponseMetadata = {
    val __obj = js.Dynamic.literal()
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResponseMetadata]
  }
}

