package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A workspace entity that may represent a tag, trigger, variable, or folder
  * in addition to its status in the workspace.
  */
@js.native
trait SchemaEntity extends js.Object {
  /**
    * Represents how the entity has been changed in the workspace.
    */
  var changeStatus: js.UndefOr[String] = js.native
  /**
    * The Folder being represented by the entity.
    */
  var folder: js.UndefOr[SchemaFolder] = js.native
  /**
    * The tag being represented by the entity.
    */
  var tag: js.UndefOr[SchemaTag] = js.native
  /**
    * The trigger being represented by the entity.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.native
  /**
    * The variable being represented by the entity.
    */
  var variable: js.UndefOr[SchemaVariable] = js.native
}

object SchemaEntity {
  @scala.inline
  def apply(
    changeStatus: String = null,
    folder: SchemaFolder = null,
    tag: SchemaTag = null,
    trigger: SchemaTrigger = null,
    variable: SchemaVariable = null
  ): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    if (changeStatus != null) __obj.updateDynamic("changeStatus")(changeStatus.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntity]
  }
}

