package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the HTTP (L7) load balancing controller addon,
  * which makes it easy to set up HTTP load balancers for services in a
  * cluster.
  */
@js.native
trait SchemaHttpLoadBalancing extends js.Object {
  /**
    * Whether the HTTP Load Balancing controller is enabled in the cluster.
    * When enabled, it runs a small pod in the cluster that manages the load
    * balancers.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaHttpLoadBalancing {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): SchemaHttpLoadBalancing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpLoadBalancing]
  }
}

