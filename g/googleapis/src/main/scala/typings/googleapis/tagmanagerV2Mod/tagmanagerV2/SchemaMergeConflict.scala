package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a merge conflict.
  */
@js.native
trait SchemaMergeConflict extends js.Object {
  /**
    * The base version entity (since the latest sync operation) that has
    * conflicting changes compared to the workspace. If this field is missing,
    * it means the workspace entity is deleted from the base version.
    */
  var entityInBaseVersion: js.UndefOr[SchemaEntity] = js.native
  /**
    * The workspace entity that has conflicting changes compared to the base
    * version. If an entity is deleted in a workspace, it will still appear
    * with a deleted change status.
    */
  var entityInWorkspace: js.UndefOr[SchemaEntity] = js.native
}

object SchemaMergeConflict {
  @scala.inline
  def apply(): SchemaMergeConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeConflict]
  }
  @scala.inline
  implicit class SchemaMergeConflictOps[Self <: SchemaMergeConflict] (val x: Self) extends AnyVal {
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
    def setEntityInBaseVersion(value: SchemaEntity): Self = this.set("entityInBaseVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityInBaseVersion: Self = this.set("entityInBaseVersion", js.undefined)
    @scala.inline
    def setEntityInWorkspace(value: SchemaEntity): Self = this.set("entityInWorkspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityInWorkspace: Self = this.set("entityInWorkspace", js.undefined)
  }
  
}

