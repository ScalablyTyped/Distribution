package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Activity in applications other than Drive.
  */
@js.native
trait SchemaApplicationReference extends js.Object {
  /**
    * The reference type corresponding to this event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaApplicationReference {
  @scala.inline
  def apply(`type`: String = null): SchemaApplicationReference = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationReference]
  }
}

