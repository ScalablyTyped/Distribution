package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ID for a user or group as seen in Permission items.
  */
@js.native
trait SchemaPermissionId extends js.Object {
  /**
    * The permission ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#permissionId.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPermissionId {
  @scala.inline
  def apply(): SchemaPermissionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionId]
  }
  @scala.inline
  implicit class SchemaPermissionIdOps[Self <: SchemaPermissionId] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

