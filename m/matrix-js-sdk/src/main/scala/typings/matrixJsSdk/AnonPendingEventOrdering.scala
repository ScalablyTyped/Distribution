package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPendingEventOrdering extends js.Object {
  // Optional. The token which a data store can use to remember the state of the room. What this means is dependent on the store implementation.
  var pendingEventOrdering: js.UndefOr[String] = js.undefined
  var storageToken: js.UndefOr[js.Any] = js.undefined
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline
  var timelineSupport: js.UndefOr[Boolean] = js.undefined
  // <optional> false Set to true to enable improved timeline support.
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
}

object AnonPendingEventOrdering {
  @scala.inline
  def apply(
    pendingEventOrdering: String = null,
    storageToken: js.Any = null,
    timelineSupport: js.UndefOr[Boolean] = js.undefined,
    unstableClientRelationAggregation: js.UndefOr[Boolean] = js.undefined
  ): AnonPendingEventOrdering = {
    val __obj = js.Dynamic.literal()
    if (pendingEventOrdering != null) __obj.updateDynamic("pendingEventOrdering")(pendingEventOrdering.asInstanceOf[js.Any])
    if (storageToken != null) __obj.updateDynamic("storageToken")(storageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(timelineSupport)) __obj.updateDynamic("timelineSupport")(timelineSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(unstableClientRelationAggregation)) __obj.updateDynamic("unstableClientRelationAggregation")(unstableClientRelationAggregation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPendingEventOrdering]
  }
}

