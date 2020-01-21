package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of reverting a zone in a workspace.
  */
@js.native
trait SchemaRevertZoneResponse extends js.Object {
  /**
    * Zone as it appears in the latest container version since the last
    * workspace synchronization operation. If no zone is present, that means
    * the zone was deleted in the latest container version.
    */
  var zone: js.UndefOr[SchemaZone] = js.native
}

object SchemaRevertZoneResponse {
  @scala.inline
  def apply(zone: SchemaZone = null): SchemaRevertZoneResponse = {
    val __obj = js.Dynamic.literal()
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevertZoneResponse]
  }
}

