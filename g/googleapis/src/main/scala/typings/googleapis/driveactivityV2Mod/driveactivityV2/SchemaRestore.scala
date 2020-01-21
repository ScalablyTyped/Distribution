package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A deleted object was restored.
  */
@js.native
trait SchemaRestore extends js.Object {
  /**
    * The type of restore action taken.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaRestore {
  @scala.inline
  def apply(`type`: String = null): SchemaRestore = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRestore]
  }
}

