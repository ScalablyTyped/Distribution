package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for UpdateProjectConfig.
  */
@js.native
trait SchemaUpdateProjectConfigRequest extends js.Object {
  /**
    * The new configuration for the project.
    */
  var projectConfig: js.UndefOr[SchemaProjectConfig] = js.native
  /**
    * A FieldMask specifying which fields of the project_config to modify. Only
    * the fields in the mask will be modified. If no mask is provided, this
    * request is no-op.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateProjectConfigRequest {
  @scala.inline
  def apply(): SchemaUpdateProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateProjectConfigRequest]
  }
  @scala.inline
  implicit class SchemaUpdateProjectConfigRequestOps[Self <: SchemaUpdateProjectConfigRequest] (val x: Self) extends AnyVal {
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
    def setProjectConfig(value: SchemaProjectConfig): Self = this.set("projectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectConfig: Self = this.set("projectConfig", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

