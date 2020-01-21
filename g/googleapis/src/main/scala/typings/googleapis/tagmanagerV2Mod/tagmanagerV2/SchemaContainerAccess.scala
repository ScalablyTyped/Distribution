package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the Google Tag Manager Container access permissions.
  */
@js.native
trait SchemaContainerAccess extends js.Object {
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * List of Container permissions.
    */
  var permission: js.UndefOr[String] = js.native
}

object SchemaContainerAccess {
  @scala.inline
  def apply(containerId: String = null, permission: String = null): SchemaContainerAccess = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerAccess]
  }
}

