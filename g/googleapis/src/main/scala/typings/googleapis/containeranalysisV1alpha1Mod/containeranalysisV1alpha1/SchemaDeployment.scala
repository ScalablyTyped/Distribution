package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The period during which some deployable was active in a runtime.
  */
@js.native
trait SchemaDeployment extends js.Object {
  /**
    * Address of the runtime element hosting this deployment.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Configuration used to create this deployment.
    */
  var config: js.UndefOr[String] = js.native
  /**
    * Beginning of the lifetime of this deployment.
    */
  var deployTime: js.UndefOr[String] = js.native
  /**
    * Platform hosting this deployment.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Output only. Resource URI for the artifact being deployed taken from the
    * deployable field with the same name.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
  /**
    * End of the lifetime of this deployment.
    */
  var undeployTime: js.UndefOr[String] = js.native
  /**
    * Identity of the user that triggered this deployment.
    */
  var userEmail: js.UndefOr[String] = js.native
}

object SchemaDeployment {
  @scala.inline
  def apply(
    address: String = null,
    config: String = null,
    deployTime: String = null,
    platform: String = null,
    resourceUri: js.Array[String] = null,
    undeployTime: String = null,
    userEmail: String = null
  ): SchemaDeployment = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (deployTime != null) __obj.updateDynamic("deployTime")(deployTime.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri.asInstanceOf[js.Any])
    if (undeployTime != null) __obj.updateDynamic("undeployTime")(undeployTime.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeployment]
  }
}

