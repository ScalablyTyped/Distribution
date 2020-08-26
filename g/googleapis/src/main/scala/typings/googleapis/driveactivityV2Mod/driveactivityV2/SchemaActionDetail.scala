package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data describing the type and additional information of an action.
  */
@js.native
trait SchemaActionDetail extends js.Object {
  /**
    * A change about comments was made.
    */
  var comment: js.UndefOr[SchemaComment] = js.native
  /**
    * An object was created.
    */
  var create: js.UndefOr[SchemaCreate] = js.native
  /**
    * An object was deleted.
    */
  var delete: js.UndefOr[SchemaDelete] = js.native
  /**
    * A change happened in data leak prevention status.
    */
  var dlpChange: js.UndefOr[SchemaDataLeakPreventionChange] = js.native
  /**
    * An object was edited.
    */
  var edit: js.UndefOr[SchemaEdit] = js.native
  /**
    * An object was moved.
    */
  var move: js.UndefOr[SchemaMove] = js.native
  /**
    * The permission on an object was changed.
    */
  var permissionChange: js.UndefOr[SchemaPermissionChange] = js.native
  /**
    * An object was referenced in an application outside of Drive/Docs.
    */
  var reference: js.UndefOr[SchemaApplicationReference] = js.native
  /**
    * An object was renamed.
    */
  var rename: js.UndefOr[SchemaRename] = js.native
  /**
    * A deleted object was restored.
    */
  var restore: js.UndefOr[SchemaRestore] = js.native
  /**
    * Settings were changed.
    */
  var settingsChange: js.UndefOr[SchemaSettingsChange] = js.native
}

object SchemaActionDetail {
  @scala.inline
  def apply(): SchemaActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionDetail]
  }
  @scala.inline
  implicit class SchemaActionDetailOps[Self <: SchemaActionDetail] (val x: Self) extends AnyVal {
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
    def setComment(value: SchemaComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCreate(value: SchemaCreate): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDelete(value: SchemaDelete): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setDlpChange(value: SchemaDataLeakPreventionChange): Self = this.set("dlpChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDlpChange: Self = this.set("dlpChange", js.undefined)
    @scala.inline
    def setEdit(value: SchemaEdit): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setMove(value: SchemaMove): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setPermissionChange(value: SchemaPermissionChange): Self = this.set("permissionChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionChange: Self = this.set("permissionChange", js.undefined)
    @scala.inline
    def setReference(value: SchemaApplicationReference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setRename(value: SchemaRename): Self = this.set("rename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    @scala.inline
    def setRestore(value: SchemaRestore): Self = this.set("restore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    @scala.inline
    def setSettingsChange(value: SchemaSettingsChange): Self = this.set("settingsChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsChange: Self = this.set("settingsChange", js.undefined)
  }
  
}

