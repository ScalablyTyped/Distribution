package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the PodSecurityPolicy feature.
  */
@js.native
trait SchemaPodSecurityPolicyConfig extends js.Object {
  /**
    * Enable the PodSecurityPolicy controller for this cluster. If enabled,
    * pods must be valid under a PodSecurityPolicy to be created.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaPodSecurityPolicyConfig {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SchemaPodSecurityPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPodSecurityPolicyConfig]
  }
}

