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
  def apply(entityInBaseVersion: SchemaEntity = null, entityInWorkspace: SchemaEntity = null): SchemaMergeConflict = {
    val __obj = js.Dynamic.literal()
    if (entityInBaseVersion != null) __obj.updateDynamic("entityInBaseVersion")(entityInBaseVersion.asInstanceOf[js.Any])
    if (entityInWorkspace != null) __obj.updateDynamic("entityInWorkspace")(entityInWorkspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMergeConflict]
  }
}

