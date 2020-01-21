package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of the operation.
  */
@js.native
trait SchemaClusterOperationStatus extends js.Object {
  /**
    * Output only. A message containing any operation metadata details.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * Output only. A message containing the detailed operation state.
    */
  var innerState: js.UndefOr[String] = js.native
  /**
    * Output only. A message containing the operation state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The time this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.native
}

object SchemaClusterOperationStatus {
  @scala.inline
  def apply(
    details: String = null,
    innerState: String = null,
    state: String = null,
    stateStartTime: String = null
  ): SchemaClusterOperationStatus = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (innerState != null) __obj.updateDynamic("innerState")(innerState.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateStartTime != null) __obj.updateDynamic("stateStartTime")(stateStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusterOperationStatus]
  }
}

