package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates various scans and whether they are turned on or off.
  */
@js.native
trait SchemaScanConfig extends js.Object {
  /**
    * Output only. The time this scan config was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. A human-readable description of what the `ScanConfig` does.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Indicates whether the Scan is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The name of the ScanConfig in the form
    * “projects/{project_id}/scanConfigs/{scan_config_id}&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time this scan config was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaScanConfig {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    updateTime: String = null
  ): SchemaScanConfig = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScanConfig]
  }
}

