package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rich Media Exit Override.
  */
@js.native
trait SchemaRichMediaExitOverride extends js.Object {
  /**
    * Click-through URL of this rich media exit override. Applicable if the
    * enabled field is set to true.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  /**
    * Whether to use the clickThroughUrl. If false, the creative-level exit
    * will be used.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * ID for the override to refer to a specific exit in the creative.
    */
  var exitId: js.UndefOr[String] = js.native
}

object SchemaRichMediaExitOverride {
  @scala.inline
  def apply(
    clickThroughUrl: SchemaClickThroughUrl = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exitId: String = null
  ): SchemaRichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (exitId != null) __obj.updateDynamic("exitId")(exitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRichMediaExitOverride]
  }
}

