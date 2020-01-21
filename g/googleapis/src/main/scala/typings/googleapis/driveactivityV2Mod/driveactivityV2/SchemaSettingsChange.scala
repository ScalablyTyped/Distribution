package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about settings changes.
  */
@js.native
trait SchemaSettingsChange extends js.Object {
  /**
    * The set of changes made to restrictions.
    */
  var restrictionChanges: js.UndefOr[js.Array[SchemaRestrictionChange]] = js.native
}

object SchemaSettingsChange {
  @scala.inline
  def apply(restrictionChanges: js.Array[SchemaRestrictionChange] = null): SchemaSettingsChange = {
    val __obj = js.Dynamic.literal()
    if (restrictionChanges != null) __obj.updateDynamic("restrictionChanges")(restrictionChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSettingsChange]
  }
}

