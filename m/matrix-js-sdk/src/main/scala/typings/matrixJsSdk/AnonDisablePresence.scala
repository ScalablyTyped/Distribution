package typings.matrixJsSdk

import typings.matrixJsSdk.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisablePresence extends js.Object {
  // <optional> The filter to apply to /sync calls. This will override the opts.initialSyncLimit, which would normally result in a timeline limit filter.
  var disablePresence: js.UndefOr[Boolean] = js.undefined
  // <optional> The number of milliseconds to wait on /sync. Default: 30000 (30 seconds).
  var filter: js.UndefOr[Filter] = js.undefined
  // <optional> The event limit= to apply to initial sync. Default: 8.
  var includeArchivedRooms: js.UndefOr[Boolean] = js.undefined
  var initialSyncLimit: js.UndefOr[Double] = js.undefined
  // <optional> True to perform syncing without automatically updating presence.
  var lazyLoadMembers: js.UndefOr[Boolean] = js.undefined
  // <optional> True to do /profile requests on every invite event if the displayname/avatar_url is not known for this user ID. Default: false.
  var pendingEventOrdering: js.UndefOr[String] = js.undefined
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline when the call to sendEvent
  var pollTimeout: js.UndefOr[Double] = js.undefined
  // <optional> True to put archived=true on the /initialSync request. Default: false.
  var resolveInvitesToProfiles: js.UndefOr[Boolean] = js.undefined
}

object AnonDisablePresence {
  @scala.inline
  def apply(
    disablePresence: js.UndefOr[Boolean] = js.undefined,
    filter: Filter = null,
    includeArchivedRooms: js.UndefOr[Boolean] = js.undefined,
    initialSyncLimit: Int | Double = null,
    lazyLoadMembers: js.UndefOr[Boolean] = js.undefined,
    pendingEventOrdering: String = null,
    pollTimeout: Int | Double = null,
    resolveInvitesToProfiles: js.UndefOr[Boolean] = js.undefined
  ): AnonDisablePresence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disablePresence)) __obj.updateDynamic("disablePresence")(disablePresence.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeArchivedRooms)) __obj.updateDynamic("includeArchivedRooms")(includeArchivedRooms.asInstanceOf[js.Any])
    if (initialSyncLimit != null) __obj.updateDynamic("initialSyncLimit")(initialSyncLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoadMembers)) __obj.updateDynamic("lazyLoadMembers")(lazyLoadMembers.asInstanceOf[js.Any])
    if (pendingEventOrdering != null) __obj.updateDynamic("pendingEventOrdering")(pendingEventOrdering.asInstanceOf[js.Any])
    if (pollTimeout != null) __obj.updateDynamic("pollTimeout")(pollTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveInvitesToProfiles)) __obj.updateDynamic("resolveInvitesToProfiles")(resolveInvitesToProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisablePresence]
  }
}

