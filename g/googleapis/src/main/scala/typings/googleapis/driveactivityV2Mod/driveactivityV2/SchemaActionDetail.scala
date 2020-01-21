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
  def apply(
    comment: SchemaComment = null,
    create: SchemaCreate = null,
    delete: SchemaDelete = null,
    dlpChange: SchemaDataLeakPreventionChange = null,
    edit: SchemaEdit = null,
    move: SchemaMove = null,
    permissionChange: SchemaPermissionChange = null,
    reference: SchemaApplicationReference = null,
    rename: SchemaRename = null,
    restore: SchemaRestore = null,
    settingsChange: SchemaSettingsChange = null
  ): SchemaActionDetail = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (dlpChange != null) __obj.updateDynamic("dlpChange")(dlpChange.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (permissionChange != null) __obj.updateDynamic("permissionChange")(permissionChange.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (restore != null) __obj.updateDynamic("restore")(restore.asInstanceOf[js.Any])
    if (settingsChange != null) __obj.updateDynamic("settingsChange")(settingsChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActionDetail]
  }
}

