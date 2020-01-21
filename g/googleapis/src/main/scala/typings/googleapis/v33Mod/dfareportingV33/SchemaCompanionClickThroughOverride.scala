package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Companion Click-through override.
  */
@js.native
trait SchemaCompanionClickThroughOverride extends js.Object {
  /**
    * Click-through URL of this companion click-through override.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  /**
    * ID of the creative for this companion click-through override.
    */
  var creativeId: js.UndefOr[String] = js.native
}

object SchemaCompanionClickThroughOverride {
  @scala.inline
  def apply(clickThroughUrl: SchemaClickThroughUrl = null, creativeId: String = null): SchemaCompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompanionClickThroughOverride]
  }
}

