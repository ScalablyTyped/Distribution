package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the NetworkPolicy feature.
  * https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
  */
@js.native
trait SchemaNetworkPolicy extends js.Object {
  /**
    * Whether network policy is enabled on the cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The selected network policy provider.
    */
  var provider: js.UndefOr[String] = js.native
}

object SchemaNetworkPolicy {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, provider: String = null): SchemaNetworkPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkPolicy]
  }
}

