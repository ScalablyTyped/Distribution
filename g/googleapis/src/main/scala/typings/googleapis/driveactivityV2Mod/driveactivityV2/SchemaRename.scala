package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was renamed.
  */
@js.native
trait SchemaRename extends js.Object {
  /**
    * The new title of the drive object.
    */
  var newTitle: js.UndefOr[String] = js.native
  /**
    * The previous title of the drive object.
    */
  var oldTitle: js.UndefOr[String] = js.native
}

object SchemaRename {
  @scala.inline
  def apply(newTitle: String = null, oldTitle: String = null): SchemaRename = {
    val __obj = js.Dynamic.literal()
    if (newTitle != null) __obj.updateDynamic("newTitle")(newTitle.asInstanceOf[js.Any])
    if (oldTitle != null) __obj.updateDynamic("oldTitle")(oldTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRename]
  }
}

