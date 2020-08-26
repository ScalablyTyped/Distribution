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
  def apply(): SchemaScanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanConfig]
  }
  @scala.inline
  implicit class SchemaScanConfigOps[Self <: SchemaScanConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

