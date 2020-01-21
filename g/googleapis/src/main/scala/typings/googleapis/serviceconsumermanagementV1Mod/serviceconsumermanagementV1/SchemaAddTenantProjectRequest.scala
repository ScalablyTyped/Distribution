package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to add a newly created and configured tenant project to a tenancy
  * unit.
  */
@js.native
trait SchemaAddTenantProjectRequest extends js.Object {
  /**
    * Configuration of the new tenant project to be added to tenancy unit
    * resources.
    */
  var projectConfig: js.UndefOr[SchemaTenantProjectConfig] = js.native
  /**
    * Tag of the added project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaAddTenantProjectRequest {
  @scala.inline
  def apply(projectConfig: SchemaTenantProjectConfig = null, tag: String = null): SchemaAddTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (projectConfig != null) __obj.updateDynamic("projectConfig")(projectConfig.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddTenantProjectRequest]
  }
}

