package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Debugging information about the response.
  */
@js.native
trait SchemaResponseDebugInfo extends js.Object {
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}

object SchemaResponseDebugInfo {
  @scala.inline
  def apply(formattedDebugInfo: String = null): SchemaResponseDebugInfo = {
    val __obj = js.Dynamic.literal()
    if (formattedDebugInfo != null) __obj.updateDynamic("formattedDebugInfo")(formattedDebugInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResponseDebugInfo]
  }
}

