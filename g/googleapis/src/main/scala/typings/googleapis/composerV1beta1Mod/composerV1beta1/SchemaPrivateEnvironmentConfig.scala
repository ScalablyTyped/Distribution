package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration information for configuring a Private IP Cloud Composer
  * environment.
  */
@js.native
trait SchemaPrivateEnvironmentConfig extends js.Object {
  /**
    * Optional. If `true`, a Private IP Cloud Composer environment is created.
    * If this field is true, `use_ip_aliases` must be true.
    */
  var enablePrivateEnvironment: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Configuration for the private GKE cluster for a Private IP
    * Cloud Composer environment.
    */
  var privateClusterConfig: js.UndefOr[SchemaPrivateClusterConfig] = js.native
}

object SchemaPrivateEnvironmentConfig {
  @scala.inline
  def apply(
    enablePrivateEnvironment: js.UndefOr[Boolean] = js.undefined,
    privateClusterConfig: SchemaPrivateClusterConfig = null
  ): SchemaPrivateEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePrivateEnvironment)) __obj.updateDynamic("enablePrivateEnvironment")(enablePrivateEnvironment.get.asInstanceOf[js.Any])
    if (privateClusterConfig != null) __obj.updateDynamic("privateClusterConfig")(privateClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrivateEnvironmentConfig]
  }
}

