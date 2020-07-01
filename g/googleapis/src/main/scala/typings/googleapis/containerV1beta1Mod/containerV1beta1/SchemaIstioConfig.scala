package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for Istio addon.
  */
@js.native
trait SchemaIstioConfig extends js.Object {
  /**
    * The specified Istio auth mode, either none, or mutual TLS.
    */
  var auth: js.UndefOr[String] = js.native
  /**
    * Whether Istio is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaIstioConfig {
  @scala.inline
  def apply(auth: String = null, disabled: js.UndefOr[Boolean] = js.undefined): SchemaIstioConfig = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIstioConfig]
  }
}

