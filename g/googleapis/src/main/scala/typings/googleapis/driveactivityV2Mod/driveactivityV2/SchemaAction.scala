package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the action.
  */
@js.native
trait SchemaAction extends js.Object {
  /**
    * The actor responsible for this action (or empty if all actors are
    * responsible).
    */
  var actor: js.UndefOr[SchemaActor] = js.native
  /**
    * The type and detailed information about the action.
    */
  var detail: js.UndefOr[SchemaActionDetail] = js.native
  /**
    * The target this action affects (or empty if affecting all targets). This
    * represents the state of the target immediately after this action
    * occurred.
    */
  var target: js.UndefOr[SchemaTarget] = js.native
  /**
    * The action occurred over this time range.
    */
  var timeRange: js.UndefOr[SchemaTimeRange] = js.native
  /**
    * The action occurred at this specific time.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaAction {
  @scala.inline
  def apply(
    actor: SchemaActor = null,
    detail: SchemaActionDetail = null,
    target: SchemaTarget = null,
    timeRange: SchemaTimeRange = null,
    timestamp: String = null
  ): SchemaAction = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAction]
  }
}

