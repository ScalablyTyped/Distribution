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
    val __obj = js.Dynamic.literal(env = env, root = root)
    if (enableArgs != null) __obj.updateDynamic("enableArgs")(enableArgs)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    __obj.asInstanceOf[IntegrationAddDetails]
  }
}

