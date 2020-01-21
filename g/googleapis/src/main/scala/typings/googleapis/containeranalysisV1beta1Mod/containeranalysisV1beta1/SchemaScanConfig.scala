package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A scan configuration specifies whether Cloud components in a project have a
  * particular type of analysis being run. For example, it can configure
  * whether vulnerability scanning is being done on Docker images or not.
  */
@js.native
trait SchemaScanConfig extends js.Object {
  /**
    * Output only. The time this scan config was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. A human-readable description of what the scan configuration
    * does.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether the scan is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Output only. The name of the scan configuration in the form of
    * `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`.
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

