package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was deleted.
  */
@js.native
trait SchemaDelete extends js.Object {
  /**
    * The type of delete action taken.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDelete {
  @scala.inline
  def apply(`type`: String = null): SchemaDelete = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDelete]
  }
}

