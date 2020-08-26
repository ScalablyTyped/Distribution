package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingEventOrdering extends js.Object {
  // Optional. The token which a data store can use to remember the state of the room. What this means is dependent on the store implementation.
  var pendingEventOrdering: js.UndefOr[String] = js.native
  var storageToken: js.UndefOr[js.Any] = js.native
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline
  var timelineSupport: js.UndefOr[Boolean] = js.native
  // <optional> false Set to true to enable improved timeline support.
  var unstableClientRelationAggregation: js.UndefOr[Boolean] = js.native
}

object PendingEventOrdering {
  @scala.inline
  def apply(): PendingEventOrdering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingEventOrdering]
  }
  @scala.inline
  implicit class PendingEventOrderingOps[Self <: PendingEventOrdering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPendingEventOrdering(value: String): Self = this.set("pendingEventOrdering", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingEventOrdering: Self = this.set("pendingEventOrdering", js.undefined)
    @scala.inline
    def setStorageToken(value: js.Any): Self = this.set("storageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageToken: Self = this.set("storageToken", js.undefined)
    @scala.inline
    def setTimelineSupport(value: Boolean): Self = this.set("timelineSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimelineSupport: Self = this.set("timelineSupport", js.undefined)
    @scala.inline
    def setUnstableClientRelationAggregation(value: Boolean): Self = this.set("unstableClientRelationAggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnstableClientRelationAggregation: Self = this.set("unstableClientRelationAggregation", js.undefined)
  }
  
}

