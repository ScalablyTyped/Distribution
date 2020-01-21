package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of goals that were reached in an activity.
  */
@js.native
trait SchemaGoalSetData extends js.Object {
  /**
    * All the goals that were reached in the current activity.
    */
  var goals: js.UndefOr[js.Array[SchemaGoalData]] = js.native
}

object SchemaGoalSetData {
  @scala.inline
  def apply(goals: js.Array[SchemaGoalData] = null): SchemaGoalSetData = {
    val __obj = js.Dynamic.literal()
    if (goals != null) __obj.updateDynamic("goals")(goals.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoalSetData]
  }
}

