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
  def apply(projectConfig: SchemaProjectConfig = null, updateMask: String = null): SchemaUpdateProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (projectConfig != null) __obj.updateDynamic("projectConfig")(projectConfig.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateProjectConfigRequest]
  }
}

