package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was moved.
  */
@js.native
trait SchemaMove extends js.Object {
  /**
    * The added parent object(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.native
  /**
    * The removed parent object(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaTargetReference]] = js.native
}

object SchemaMove {
  @scala.inline
  def apply(
    addedParents: js.Array[SchemaTargetReference] = null,
    removedParents: js.Array[SchemaTargetReference] = null
  ): SchemaMove = {
    val __obj = js.Dynamic.literal()
    if (addedParents != null) __obj.updateDynamic("addedParents")(addedParents.asInstanceOf[js.Any])
    if (removedParents != null) __obj.updateDynamic("removedParents")(removedParents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMove]
  }
}

