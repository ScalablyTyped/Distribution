package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Folder&#39;s contents.
  */
@js.native
trait SchemaFolderEntities extends js.Object {
  /**
    * The list of tags inside the folder.
    */
  var tag: js.UndefOr[js.Array[SchemaTag]] = js.native
  /**
    * The list of triggers inside the folder.
    */
  var trigger: js.UndefOr[js.Array[SchemaTrigger]] = js.native
  /**
    * The list of variables inside the folder.
    */
  var variable: js.UndefOr[js.Array[SchemaVariable]] = js.native
}

object SchemaFolderEntities {
  @scala.inline
  def apply(
    tag: js.Array[SchemaTag] = null,
    trigger: js.Array[SchemaTrigger] = null,
    variable: js.Array[SchemaVariable] = null
  ): SchemaFolderEntities = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFolderEntities]
  }
}

