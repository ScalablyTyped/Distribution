package typings.googleapis.jobsV2Mod.jobsV2

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
    * Identifiers for the versions of the search algorithm used during this API
    * invocation if multiple algorithms are used. The default value is empty.
    * For search response only.
    */
  var experimentIdList: js.UndefOr[js.Array[Double]] = js.native
  /**
    * For search response only. Indicates the mode of a performed search.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * A unique id associated with this call. This id is logged for tracking
    * purposes.
    */
  var requestId: js.UndefOr[String] = js.native
}

object SchemaResponseMetadata {
  @scala.inline
  def apply(experimentIdList: js.Array[Double] = null, mode: String = null, requestId: String = null): SchemaResponseMetadata = {
    val __obj = js.Dynamic.literal()
    if (experimentIdList != null) __obj.updateDynamic("experimentIdList")(experimentIdList.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResponseMetadata]
  }
}

