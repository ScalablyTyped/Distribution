package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change in the object&#39;s data leak prevention status.
  */
@js.native
trait SchemaDataLeakPreventionChange extends js.Object {
  /**
    * The type of Data Leak Prevention (DLP) change.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDataLeakPreventionChange {
  @scala.inline
  def apply(`type`: String = null): SchemaDataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataLeakPreventionChange]
  }
}

