package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for status of room automatching that is in
  * progress.
  */
@js.native
trait SchemaRoomAutoMatchStatus extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomAutoMatchStatus.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An estimate for the amount of time (in seconds) that auto-matching is
    * expected to take to complete.
    */
  var waitEstimateSeconds: js.UndefOr[Double] = js.native
}

object SchemaRoomAutoMatchStatus {
  @scala.inline
  def apply(kind: String = null, waitEstimateSeconds: js.UndefOr[Double] = js.undefined): SchemaRoomAutoMatchStatus = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(waitEstimateSeconds)) __obj.updateDynamic("waitEstimateSeconds")(waitEstimateSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomAutoMatchStatus]
  }
}

