package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to apply configuration to an existing tenant project.
  */
@js.native
trait SchemaApplyTenantProjectConfigRequest extends js.Object {
  /**
    * Configuration that should be applied to the existing tenant project.
    */
  var projectConfig: js.UndefOr[SchemaTenantProjectConfig] = js.native
  /**
    * Tag of the project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaApplyTenantProjectConfigRequest {
  @scala.inline
  def apply(): SchemaApplyTenantProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplyTenantProjectConfigRequest]
  }
  @scala.inline
  implicit class SchemaApplyTenantProjectConfigRequestOps[Self <: SchemaApplyTenantProjectConfigRequest] (val x: Self) extends AnyVal {
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
    def setProjectConfig(value: SchemaTenantProjectConfig): Self = this.set("projectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectConfig: Self = this.set("projectConfig", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

