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
  def apply(): SchemaContainerAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerAccess]
  }
  @scala.inline
  implicit class SchemaContainerAccessOps[Self <: SchemaContainerAccess] (val x: Self) extends AnyVal {
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
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
  }
  
}

