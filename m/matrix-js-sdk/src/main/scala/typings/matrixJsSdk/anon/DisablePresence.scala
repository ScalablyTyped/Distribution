package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisablePresence extends StObject {
  
  // <optional> True to perform syncing without automatically updating presence.
  var disablePresence: js.UndefOr[Boolean] = js.undefined
  
  // <optional> The filter to apply to /sync calls. This will override the opts.initialSyncLimit, which would normally result in a timeline limit filter.
  var filter: js.UndefOr[typings.matrixJsSdk.mod.Filter] = js.undefined
  
  // <optional> True to put archived=true on the /initialSync request. Default: false.
  var includeArchivedRooms: js.UndefOr[Boolean] = js.undefined
  
  // <optional> The event limit= to apply to initial sync. Default: 8.
  var initialSyncLimit: js.UndefOr[Double] = js.undefined
  
  // <optional> True to not load all membership events during initial sync but fetch them when needed by calling `loadOutOfBandMembers` This will override the filter
  var lazyLoadMembers: js.UndefOr[Boolean] = js.undefined
  
  // <optional> Controls where pending messages appear in a room's timeline. If "chronological", messages will appear in the timeline when the call to sendEvent
  var pendingEventOrdering: js.UndefOr[String] = js.undefined
  
  // <optional> The number of milliseconds to wait on /sync. Default: 30000 (30 seconds).
  var pollTimeout: js.UndefOr[Double] = js.undefined
  
  // <optional> True to do /profile requests on every invite event if the displayname/avatar_url is not known for this user ID. Default: false.
  var resolveInvitesToProfiles: js.UndefOr[Boolean] = js.undefined
}
object DisablePresence {
  
  inline def apply(): DisablePresence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisablePresence]
  }
  
  extension [Self <: DisablePresence](x: Self) {
    
    inline def setDisablePresence(value: Boolean): Self = StObject.set(x, "disablePresence", value.asInstanceOf[js.Any])
    
    inline def setDisablePresenceUndefined: Self = StObject.set(x, "disablePresence", js.undefined)
    
    inline def setFilter(value: typings.matrixJsSdk.mod.Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIncludeArchivedRooms(value: Boolean): Self = StObject.set(x, "includeArchivedRooms", value.asInstanceOf[js.Any])
    
    inline def setIncludeArchivedRoomsUndefined: Self = StObject.set(x, "includeArchivedRooms", js.undefined)
    
    inline def setInitialSyncLimit(value: Double): Self = StObject.set(x, "initialSyncLimit", value.asInstanceOf[js.Any])
    
    inline def setInitialSyncLimitUndefined: Self = StObject.set(x, "initialSyncLimit", js.undefined)
    
    inline def setLazyLoadMembers(value: Boolean): Self = StObject.set(x, "lazyLoadMembers", value.asInstanceOf[js.Any])
    
    inline def setLazyLoadMembersUndefined: Self = StObject.set(x, "lazyLoadMembers", js.undefined)
    
    inline def setPendingEventOrdering(value: String): Self = StObject.set(x, "pendingEventOrdering", value.asInstanceOf[js.Any])
    
    inline def setPendingEventOrderingUndefined: Self = StObject.set(x, "pendingEventOrdering", js.undefined)
    
    inline def setPollTimeout(value: Double): Self = StObject.set(x, "pollTimeout", value.asInstanceOf[js.Any])
    
    inline def setPollTimeoutUndefined: Self = StObject.set(x, "pollTimeout", js.undefined)
    
    inline def setResolveInvitesToProfiles(value: Boolean): Self = StObject.set(x, "resolveInvitesToProfiles", value.asInstanceOf[js.Any])
    
    inline def setResolveInvitesToProfilesUndefined: Self = StObject.set(x, "resolveInvitesToProfiles", js.undefined)
  }
}
