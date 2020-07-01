package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata the defines how a deployment is configured.
  */
@js.native
trait SchemaDeploymentConfig extends js.Object {
  /**
    * The description for this deployment.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The manifest file name for this deployment.
    */
  var manifestFileName: js.UndefOr[String] = js.native
  /**
    * The script project&#39;s Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
  /**
    * The version number on which this deployment is based.
    */
  var versionNumber: js.UndefOr[Double] = js.native
}

object SchemaDeploymentConfig {
  @scala.inline
  def apply(
    description: String = null,
    manifestFileName: String = null,
    scriptId: String = null,
    versionNumber: js.UndefOr[Double] = js.undefined
  ): SchemaDeploymentConfig = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (manifestFileName != null) __obj.updateDynamic("manifestFileName")(manifestFileName.asInstanceOf[js.Any])
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId.asInstanceOf[js.Any])
    if (!js.isUndefined(versionNumber)) __obj.updateDynamic("versionNumber")(versionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeploymentConfig]
  }
}

