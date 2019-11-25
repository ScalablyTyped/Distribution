package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationAddDetails extends js.Object {
  var enableArgs: js.UndefOr[js.Array[String]] = js.undefined
  var env: IonicEnvironment
  var quiet: js.UndefOr[Boolean] = js.undefined
  var root: String
}

object IntegrationAddDetails {
  @scala.inline
  def apply(
    env: IonicEnvironment,
    root: String,
    enableArgs: js.Array[String] = null,
    quiet: js.UndefOr[Boolean] = js.undefined
  ): IntegrationAddDetails = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (enableArgs != null) __obj.updateDynamic("enableArgs")(enableArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationAddDetails]
  }
}

