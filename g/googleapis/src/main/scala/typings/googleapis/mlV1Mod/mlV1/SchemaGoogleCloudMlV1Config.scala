package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudMlV1Config extends js.Object {
  /**
    * The service account Cloud ML uses to run on TPU node.
    */
  var tpuServiceAccount: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1Config {
  @scala.inline
  def apply(tpuServiceAccount: String = null): SchemaGoogleCloudMlV1Config = {
    val __obj = js.Dynamic.literal()
    if (tpuServiceAccount != null) __obj.updateDynamic("tpuServiceAccount")(tpuServiceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Config]
  }
}

