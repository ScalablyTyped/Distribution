package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Debugging information about the result.
  */
@js.native
trait SchemaResultDebugInfo extends js.Object {
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}

object SchemaResultDebugInfo {
  @scala.inline
  def apply(formattedDebugInfo: String = null): SchemaResultDebugInfo = {
    val __obj = js.Dynamic.literal()
    if (formattedDebugInfo != null) __obj.updateDynamic("formattedDebugInfo")(formattedDebugInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultDebugInfo]
  }
}

