package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a built-in variable in a workspace.
  */
@js.native
trait SchemaRevertBuiltInVariableResponse extends js.Object {
  /**
    * Whether the built-in variable is enabled after reversion.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaRevertBuiltInVariableResponse {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaRevertBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevertBuiltInVariableResponse]
  }
}

