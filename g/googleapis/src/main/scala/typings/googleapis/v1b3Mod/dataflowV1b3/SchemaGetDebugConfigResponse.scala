package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a get debug configuration request.
  */
@js.native
trait SchemaGetDebugConfigResponse extends js.Object {
  /**
    * The encoded debug configuration for the requested component.
    */
  var config: js.UndefOr[String] = js.native
}

object SchemaGetDebugConfigResponse {
  @scala.inline
  def apply(config: String = null): SchemaGetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetDebugConfigResponse]
  }
}

