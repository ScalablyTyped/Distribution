package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Drive item which is a folder.
  */
@js.native
trait SchemaFolder extends js.Object {
  /**
    * The type of Drive folder.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaFolder {
  @scala.inline
  def apply(`type`: String = null): SchemaFolder = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFolder]
  }
}

