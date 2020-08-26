package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisablePresence extends js.Object {
  // <optional> The filter to apply to /sync calls. This will override the opts.initialSyncLimit, which would normally result in a timeline limit filter.
  var disablePresence: js.UndefOr[Boolean] = js.native
  // <optional> The number of milliseconds to wait on /sync. Default: 30000 (30 seconds).
  var filter: js.UndefOr[typings.matrixJsSdk.mod.Filter] = js.native
  // <optional> The event limit= to apply to initial sync. Default: 8.
  var includeArchivedRooms: js.UndefOr[Boolean] = js.native
  var initialSyncLimit: js.UndefOr[Double] = js.native
  // <optional> True to perform syncing without automatically updating presence.
  var lazyLoadMembers: js.UndefOr[Boolean] = js.native
  // <optional> True to do /profile requests on every invite event if the displayname/avatar_url is not known for this user ID. Default: false.
  var pendingEventOrdering: js.UndefOr[String] = js.native
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline when the call to sendEvent
  var pollTimeout: js.UndefOr[Double] = js.native
  // <optional> True to put archived=true on the /initialSync request. Default: false.
  var resolveInvitesToProfiles: js.UndefOr[Boolean] = js.native
}

object DisablePresence {
  @scala.inline
  def apply(): DisablePresence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisablePresence]
  }
  @scala.inline
  implicit class DisablePresenceOps[Self <: DisablePresence] (val x: Self) extends AnyVal {
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
    def setDisablePresence(value: Boolean): Self = this.set("disablePresence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePresence: Self = this.set("disablePresence", js.undefined)
    @scala.inline
    def setFilter(value: typings.matrixJsSdk.mod.Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIncludeArchivedRooms(value: Boolean): Self = this.set("includeArchivedRooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeArchivedRooms: Self = this.set("includeArchivedRooms", js.undefined)
    @scala.inline
    def setInitialSyncLimit(value: Double): Self = this.set("initialSyncLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSyncLimit: Self = this.set("initialSyncLimit", js.undefined)
    @scala.inline
    def setLazyLoadMembers(value: Boolean): Self = this.set("lazyLoadMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoadMembers: Self = this.set("lazyLoadMembers", js.undefined)
    @scala.inline
    def setPendingEventOrdering(value: String): Self = this.set("pendingEventOrdering", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingEventOrdering: Self = this.set("pendingEventOrdering", js.undefined)
    @scala.inline
    def setPollTimeout(value: Double): Self = this.set("pollTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollTimeout: Self = this.set("pollTimeout", js.undefined)
    @scala.inline
    def setResolveInvitesToProfiles(value: Boolean): Self = this.set("resolveInvitesToProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveInvitesToProfiles: Self = this.set("resolveInvitesToProfiles", js.undefined)
  }
  
}

